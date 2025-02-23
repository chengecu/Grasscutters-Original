package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify;
import emu.grasscutter.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType;
import emu.grasscutter.net.proto.VectorOuterClass.Vector;
import emu.grasscutter.utils.Position;
import java.util.Objects;

public class PacketScenePlayerSoundNotify extends BasePacket {

    public PacketScenePlayerSoundNotify(Position playPosition, String soundName, int playType) {
        super(PacketOpcodes.ScenePlayerSoundNotify, true);

        ScenePlayerSoundNotify.Builder proto = ScenePlayerSoundNotify.newBuilder();
        if (!Objects.equals(playPosition, null)) {
            proto.setPlayPos(
                    Vector.newBuilder()
                            .setX(playPosition.getX())
                            .setY(playPosition.getY())
                            .setZ(playPosition.getZ())
                            .build());
        }
        if (!Objects.equals(soundName, null)) {
            proto.setSoundName(soundName);
        }
        proto.setPlayType(PlaySoundType.forNumber(playType));

        this.setData(proto.build());
    }
}
