/**
 * This file is part of Aion-Lightning <aion-lightning.org>.
 *
 *  Aion-Lightning is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Aion-Lightning is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details. *
 *  You should have received a copy of the GNU General Public License
 *  along with Aion-Lightning.
 *  If not, see <http://www.gnu.org/licenses/>.
 */
package quest.event_quests;

import com.aionemu.gameserver.model.gameobjects.player.Player;
import com.aionemu.gameserver.questEngine.handlers.QuestHandler;
import com.aionemu.gameserver.model.DialogAction;
import com.aionemu.gameserver.questEngine.model.QuestEnv;
import com.aionemu.gameserver.questEngine.model.QuestState;
import com.aionemu.gameserver.questEngine.model.QuestStatus;
import com.aionemu.gameserver.services.EventService;
import com.aionemu.gameserver.services.QuestService;

public class _80008PieceOfCake extends QuestHandler {

    private final static int questId = 80008;

    public _80008PieceOfCake() {
        super(questId);
    }

    @Override
    public void register() {
        qe.registerQuestNpc(798415).addOnTalkEvent(questId);
        qe.registerOnLevelUp(questId);
    }

    @Override
    public boolean onDialogEvent(QuestEnv env) {
        Player player = env.getPlayer();

        if (env.getTargetId() == 0) {
            if (env.getDialog() == DialogAction.QUEST_ACCEPT_1) {
                QuestService.startEventQuest(env, QuestStatus.START);
                closeDialogWindow(env);
                return true;
            }
        }

        QuestState qs = player.getQuestStateList().getQuestState(questId);
        if (qs == null) {
            return false;
        }

        int var = qs.getQuestVarById(0);

        if (qs.getStatus() == QuestStatus.START) {
            if (env.getTargetId() == 798415) {
                switch (env.getDialog()) {
                    case QUEST_SELECT:
                        if (var == 0) {
                            return sendQuestDialog(env, 2375);
                        }
                    case SELECT_QUEST_REWARD:
                        removeQuestItem(env, 182214006, 1);
                        return defaultCloseDialog(env, 0, 1, true, true);
				default:
					break;
                }
            }
        }
        return sendQuestRewardDialog(env, 798415, 0);
    }

    @Override
    public boolean onLvlUpEvent(QuestEnv env) {
        Player player = env.getPlayer();
        QuestState qs = player.getQuestStateList().getQuestState(questId);
        if (!EventService.getInstance().checkQuestIsActive(questId) && qs != null) {
            QuestService.abandonQuest(player, questId);
        }
        return true;
    }
}
