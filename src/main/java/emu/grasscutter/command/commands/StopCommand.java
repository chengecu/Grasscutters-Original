package emu.grasscutter.command.commands;

import static emu.grasscutter.utils.Language.translate;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import java.util.List;

@Command(
        label = "stop",
        aliases = {"shutdown"},
        permission = "server.stop",
        targetRequirement = Command.TargetRequirement.NONE)
public final class StopCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        CommandHandler.sendMessage(null, translate("commands.stop.success"));
        for (Player p : Grasscutter.getGameServer().getPlayers().values()) {
            CommandHandler.sendMessage(p, translate(p, "commands.stop.success"));
        }

        System.exit(1000);
    }
}
