package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.SetPlayerPropRspOuterClass;

public class PacketSetPlayerPropRsp extends BasePacket {

    public PacketSetPlayerPropRsp(int retCode) {
        super(PacketOpcodes.SetPlayerPropRsp);
        SetPlayerPropRspOuterClass.SetPlayerPropRsp.Builder proto =
                SetPlayerPropRspOuterClass.SetPlayerPropRsp.newBuilder();
        if (retCode != 0) {
            proto.setRetcode(retCode);
        }
        this.setData(proto.build());
    }
}
