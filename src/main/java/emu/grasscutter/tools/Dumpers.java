package emu.grasscutter.tools;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.Command.TargetRequirement;
import emu.grasscutter.command.CommandMap;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.ResourceLoader;
import emu.grasscutter.game.inventory.ItemType;
import emu.grasscutter.game.props.SceneType;
import emu.grasscutter.utils.JsonUtils;
import emu.grasscutter.utils.Language;
import lombok.AllArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface Dumpers {
    // See `src/handbook/data/README.md` for attributions.

    /**
     * Fetches the description of a command.
     *
     * @param locale The locale to use.
     * @param command The command to get the description of.
     * @return The description of the command.
     */
    private static String commandDescription(String locale, Command command) {
        try {
            // Get the language by the locale.
            var language = Language.getLanguage(locale);
            if (language == null) throw new IllegalArgumentException("Invalid language.");

            return language.get("commands." + command.label() + ".description");
        } catch (IllegalArgumentException ignored) {
            return command.label();
        }
    }

    /**
     * Encodes the dump into comma separated values.
     *
     * @param dump The dump to encode.
     * @return The encoded dump.
     */
    private static String miniEncode(Map<Integer, ?> dump) {
        return dump.entrySet().stream()
            .map(entry -> entry.getKey() + "," + entry.getValue().toString())
            .collect(Collectors.joining("\n"));
    }

    /**
     * Dumps all commands to a JSON file.
     *
     * @param locale The language to dump the commands in.
     */
    static void dumpCommands(String locale) {
        // Check that commands are registered.
        var commandMap = CommandMap.getInstance();
        if (commandMap == null) commandMap = new CommandMap(true);

        // Convert all registered commands to an info map.
        var dump = new HashMap<String, CommandInfo>();
        commandMap.getAnnotationsAsList().forEach(command -> {
            var description = Dumpers.commandDescription(locale, command);
            var labels = new ArrayList<String>(){{
                this.add(command.label());
                this.addAll(List.of(command.aliases()));
            }};

            // Add the command info to the list.
            dump.put(command.label(), new CommandInfo(
                labels, description, List.of(command.usage()), List.of(
                command.permission(), command.permissionTargeted()),
                command.targetRequirement()));
        });

        try {
            // Create a file for the dump.
            var file = new File("commands.json");
            if (file.exists() && !file.delete())
                throw new RuntimeException("Failed to delete file.");
            if (!file.exists() && !file.createNewFile())
                throw new RuntimeException("Failed to create file.");

            // Write the dump to the file.
            Files.writeString(file.toPath(), JsonUtils.encode(dump));
        } catch (IOException ignored) {
            throw new RuntimeException("Failed to write to file.");
        }
    }

    /**
     * Dumps all avatars to a JSON file.
     *
     * @param locale The language to dump the avatars in.
     */
    static void dumpAvatars(String locale) {
        // Reload resources.
        ResourceLoader.loadAll();
        Language.loadTextMaps();

        // Convert all known avatars to an avatar map.
        var dump = new HashMap<Integer, AvatarInfo>();
        GameData.getAvatarDataMap().forEach((id, avatar) -> {
            var langHash = avatar.getNameTextMapHash();
            dump.put(id, new AvatarInfo(
                langHash == 0 ? avatar.getName() : Language.getTextMapKey(langHash).get(locale),
                avatar.getQualityType().equals("QUALITY_PURPLE") ? Quality.EPIC : Quality.LEGENDARY
            ));
        });

        try {
            // Create a file for the dump.
            var file = new File("avatars.csv");
            if (file.exists() && !file.delete())
                throw new RuntimeException("Failed to delete file.");
            if (!file.exists() && !file.createNewFile())
                throw new RuntimeException("Failed to create file.");

            // Write the dump to the file.
            Files.writeString(file.toPath(), Dumpers.miniEncode(dump));
        } catch (IOException ignored) {
            throw new RuntimeException("Failed to write to file.");
        }
    }

    /**
     * Dumps all items to a JSON file.
     *
     * @param locale The language to dump the items in.
     */
    static void dumpItems(String locale) {
        // Reload resources.
        ResourceLoader.loadAll();
        Language.loadTextMaps();

        // Convert all known items to an item map.
        var originalDump = new ArrayList<ItemInfo>();
        GameData.getItemDataMap().forEach((id, item) -> originalDump.add(new ItemInfo(id,
            Language.getTextMapKey(item.getNameTextMapHash()).get(locale),
            Quality.from(item.getRankLevel()), item.getItemType(),
            item.getIcon().length() > 0 ? item.getIcon().substring(3) : ""
        )));

        // Create a new dump with filtered duplicates.
        var names = new ArrayList<String>();
        var dump = new HashMap<Integer, ItemInfo>();
        originalDump.forEach(item -> {
            // Validate the item.
            if (item.name.contains("[CHS]")) return;
            if (names.contains(item.name)) return;
            if (dump.containsKey(item.id)) return;
            // Add the item to the dump.
            names.add(item.name);
            dump.put(item.id, item);
        });

        try {
            // Create a file for the dump.
            var file = new File("items.csv");
            if (file.exists() && !file.delete())
                throw new RuntimeException("Failed to delete file.");
            if (!file.exists() && !file.createNewFile())
                throw new RuntimeException("Failed to create file.");

            // Write the dump to the file.
            Files.writeString(file.toPath(), Dumpers.miniEncode(dump));
        } catch (IOException ignored) {
            throw new RuntimeException("Failed to write to file.");
        }
    }

    /**
     * Dumps all scenes to a JSON file.
     */
    static void dumpScenes() {
        // Reload resources.
        ResourceLoader.loadAll();
        Language.loadTextMaps();

        // Convert all known scenes to a scene map.
        var dump = new HashMap<Integer, SceneInfo>();
        GameData.getSceneDataMap().forEach((id, scene) ->
            dump.put(id, new SceneInfo(scene.getScriptData(), scene.getSceneType())));

        try {
            // Create a file for the dump.
            var file = new File("scenes.csv");
            if (file.exists() && !file.delete())
                throw new RuntimeException("Failed to delete file.");
            if (!file.exists() && !file.createNewFile())
                throw new RuntimeException("Failed to create file.");

            // Write the dump to the file.
            Files.writeString(file.toPath(), Dumpers.miniEncode(dump));
        } catch (IOException ignored) {
            throw new RuntimeException("Failed to write to file.");
        }
    }

    /**
     * Dumps all entities to a JSON file.
     *
     * @param locale The language to dump the entities in.
     */
    static void dumpEntities(String locale) {
        // Reload resources.
        ResourceLoader.loadAll();
        Language.loadTextMaps();

        // Convert all known avatars to an avatar map.
        var dump = new HashMap<Integer, EntityInfo>();
        GameData.getMonsterDataMap().forEach((id, monster) -> {
            var langHash = monster.getNameTextMapHash();
            dump.put(id, new EntityInfo(
                langHash == 0 ? monster.getMonsterName() :
                    Language.getTextMapKey(langHash).get(locale),
                monster.getMonsterName()
            ));
        });

        try {
            // Create a file for the dump.
            var file = new File("entities.csv");
            if (file.exists() && !file.delete())
                throw new RuntimeException("Failed to delete file.");
            if (!file.exists() && !file.createNewFile())
                throw new RuntimeException("Failed to create file.");

            // Write the dump to the file.
            Files.writeString(file.toPath(), Dumpers.miniEncode(dump));
        } catch (IOException ignored) {
            throw new RuntimeException("Failed to write to file.");
        }
    }

    @AllArgsConstructor
    class CommandInfo {
        public List<String> name;
        public String description;
        public List<String> usage;
        public List<String> permission;
        public TargetRequirement target;
    }

    @AllArgsConstructor
    class AvatarInfo {
        public String name;
        public Quality quality;

        @Override
        public String toString() {
            return this.name + ","
                + this.quality;
        }
    }

    @AllArgsConstructor
    class ItemInfo {
        public Integer id;
        public String name;
        public Quality quality;
        public ItemType type;
        public String icon;

        @Override
        public String toString() {
            return this.name + ","
                + this.quality + ","
                + this.type + ","
                + this.icon;
        }
    }

    @AllArgsConstructor
    class SceneInfo {
        public String identifier;
        public SceneType type;

        @Override
        public String toString() {
            return this.identifier + ","
                + this.type;
        }
    }

    @AllArgsConstructor
    class EntityInfo {
        public String name;
        public String internal;

        @Override
        public String toString() {
            return this.name + ","
                + this.internal;
        }
    }

    enum Quality {
        LEGENDARY, EPIC, RARE, UNCOMMON, COMMON, UNKNOWN;

        /**
         * Convert a rank level to a quality.
         *
         * @param rankLevel The rank level to convert.
         * @return The quality.
         */
        static Quality from(int rankLevel) {
            return switch (rankLevel) {
                case 0 -> UNKNOWN;
                case 1 -> COMMON;
                case 2 -> UNCOMMON;
                case 3 -> RARE;
                case 4 -> EPIC;
                default -> LEGENDARY;
            };
        }
    }
}
