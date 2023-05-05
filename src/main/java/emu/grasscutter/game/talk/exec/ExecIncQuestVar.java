package emu.grasscutter.game.talk.exec;

import emu.grasscutter.data.excels.TalkConfigData;
import emu.grasscutter.data.excels.TalkConfigData.TalkExecParam;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.quest.GameMainQuest;
import emu.grasscutter.game.talk.TalkExec;
import emu.grasscutter.game.talk.TalkExecHandler;
import emu.grasscutter.game.talk.TalkValueExec;

@TalkValueExec(TalkExec.TALK_EXEC_INC_QUEST_VAR)
public final class ExecIncQuestVar extends TalkExecHandler {
    @Override
    public void execute(Player player, TalkConfigData talkData, TalkExecParam execParam) {
        if (execParam.getParam().length < 3) return;

        GameMainQuest mainQuest = player.getQuestManager().getMainQuestById(
            Integer.parseInt(execParam.getParam()[2])
        );
        if (mainQuest == null) return;

        mainQuest.incQuestVar(
            Integer.parseInt(execParam.getParam()[0]),
            Integer.parseInt(execParam.getParam()[1])
        );
    }
}
