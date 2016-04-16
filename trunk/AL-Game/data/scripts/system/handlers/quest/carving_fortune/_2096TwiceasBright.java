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
package quest.carving_fortune;

import com.aionemu.gameserver.model.gameobjects.player.Player;
import com.aionemu.gameserver.model.TeleportAnimation;
import com.aionemu.gameserver.questEngine.handlers.QuestHandler;
import com.aionemu.gameserver.model.DialogAction;
import com.aionemu.gameserver.questEngine.model.QuestEnv;
import com.aionemu.gameserver.questEngine.model.QuestState;
import com.aionemu.gameserver.questEngine.model.QuestStatus;
import com.aionemu.gameserver.services.teleport.TeleportService2;

/**
 * Go to Pandaemonium and talk with Cavalorn (204206).<br>
 * Meet with Kasir (204207) in the Hidden Library.<br>
 * Go to Ishalgen and talk with Munin (203550).
 *
 * @author Manu72
 * @reworked vlog
 */
public class _2096TwiceasBright extends QuestHandler {

    private final static int questId = 2096;

    public _2096TwiceasBright() {
        super(questId);
    }

    @Override
    public void register() {
        qe.registerOnLevelUp(questId);
        qe.registerQuestNpc(204206).addOnTalkEvent(questId);
        qe.registerQuestNpc(204207).addOnTalkEvent(questId);
        qe.registerQuestNpc(203550).addOnTalkEvent(questId);
    }

    @Override
    public boolean onDialogEvent(QuestEnv env) {
        Player player = env.getPlayer();
        QuestState qs = player.getQuestStateList().getQuestState(questId);
        int targetId = env.getTargetId();
        DialogAction dialog = env.getDialog();
        if (qs == null) {
            return false;
        }
        int var = qs.getQuestVarById(0);

        if (qs.getStatus() == QuestStatus.START) {
            switch (targetId) {
                case 204206: { // Cavalorn
                    if (dialog == DialogAction.QUEST_SELECT && var == 0) {
                        return sendQuestDialog(env, 1011);
                    } else if (dialog == DialogAction.SETPRO1) {
                        return defaultCloseDialog(env, 0, 1); // 1
                    }
                    break;
                }
                case 204207: { // Kasir
                    if (dialog == DialogAction.QUEST_SELECT && var == 1) {
                        return sendQuestDialog(env, 1352);
                    } else if (dialog == DialogAction.SETPRO2) {
                        TeleportService2.teleportTo(player, 220010000, 383.10248f, 1895.3093f, 327.625f, (byte) 59, TeleportAnimation.BEAM_ANIMATION);
                        return defaultCloseDialog(env, 1, 2); // 2
                    }
                    break;
                }
                case 203550: { // Munin
                    if (dialog == DialogAction.QUEST_SELECT && var == 2) {
                        changeQuestStep(env, 2, 2, true); // reward
                        return sendQuestDialog(env, 1693);
                    }
                }
            }
        } else if (qs.getStatus() == QuestStatus.REWARD) {
            if (targetId == 203550) { // Munin
                return sendQuestEndDialog(env);
            }
        }
        return false;
    }

    @Override
    public boolean onLvlUpEvent(QuestEnv env) {
        int[] quests = {2007, 2022, 2041, 2094, 2061, 2076, 2900};
        return defaultOnLvlUpEvent(env, quests, true);
    }
}
