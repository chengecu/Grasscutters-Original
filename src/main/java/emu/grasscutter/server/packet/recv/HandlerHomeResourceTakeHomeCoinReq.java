package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketHomeResourceTakeHomeCoinRsp;

@Opcodes(PacketOpcodes.HomeResourceTakeHomeCoinReq)
public class HandlerHomeResourceTakeHomeCoinReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {

        session.send(new PacketHomeResourceTakeHomeCoinRsp(session.getPlayer()));
    }
}
