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
package com.aionemu.gameserver.model;

import javax.xml.bind.annotation.XmlEnum;

/**
 * @rework Blackfire
 */

@XmlEnum
public enum TribeClass {

    PC(true),
    GENERAL(true),
    GUARD(true),
    PC_DARK(true),
    GENERAL_DARK(true),
    GUARD_DARK(true),
    PC_DRAGON(true),
    GENERAL_DRAGON(true),
    GUARD_DRAGON(true),
    MONSTER(true),
    PET,
    PET_DARK,
    AGGRESSIVESINGLEMONSTER,
    AGGRESSIVESUPPORTMONSTER,
    FRILLFAIMAMCOUPLE,
    SPAKY,
    MUTA,
    FUNGUS,
    ORC,
    GOBLIN,
    POLYMORPHFUNGY,
    FUNGY,
    BRAX,
    HIPPOLIZARD,
    FRILLFAIMAMBABY,
    FRILLFAIMAMMOM,
    FETHLOT,
    GARGOYLE,
    MINX,
    ZAIF,
    TOG,
    GUARD_D1NOATTACK,
    ZAIF_ATOG,
    TOG_AZAIF,
    ZAIF_AMINX,
    MINX_HZAIF,
    MERDION,
    GUARDIAN,
    DARU,
    LUPYLLINI,
    MOSBEARBABY,
    MOSBEARFATHER,
    SOULEDSTONE,
    SOULEDSTONE_MINI,
    MINX_HKALNIF,
    KALNIF_AMINX,
    KALNIF_ATOG,
    TOG_AKALNIF,
    FARMER_HKERUBIM_LF1,
    KERUBIM_AFARMER_LF1,
    GUARD_LIGHT_AKERUBIM_LF1,
    D1_HKERUBIM_LF1,
    KERUBIM_AD1_LF1,
    BROWNIE,
    BROWNIECOWARD,
    BROWNIEGUARD,
    BROWNIEFELLER_HZAIF_LF1,
    ZAIF_ABROWNIEFELLER_LF1,
    KRALL,
    KRALLMASTER,
    KRALLWIZARDCY,
    KRALL_TRAINING,
    SPRIGG_HROBBERALDER_DF1,
    ROBBERALDER_ASPRIGG_DF1,
    SPRIGGREFUSE_DF1,
    ARCHERYBASFELT_ATARGETBASFELT_DF1,
    ARCHERYBASFELT_ATARGETBASFELT_LF1,
    TARGETBASFELT_DF1,
    ARCHERYBASFELT2_ATARGETBASFELT2_DF1,
    ARCHERYBASFELT2_ATARGETBASFELT2_LF1,
    TARGETBASFELT2_DF1,
    GUARD_FTARGETBASFELT_DF1,
    GUARD_FTARGETBASFELT_LF1,
    LYCAN,
    LYCAN_HUNTER,
    LYCAN_MAGE,
    LYCAN_AGUARD_DARK_DF1,
    LYCAN_TRAINING,
    LYCANMASTER,
    LYCAN_PET,
    LYCAN_PET_TRAINING,
    LYCAN_SUM,
    LYCANDF2MASTER,
    LYCANDF2SLAVE1,
    LYCANDF2SLAVE2,
    TOWERMAN,
    RATMAN,
    RATMANWORKER,
    RATMANDFWORKER,
    SAMM,
    RATMAN_AGUARD_DARK_DF1,
    GUARD_DARK_ALYCANARATMAN_DF1,
    UNDEADGRADIATOR_DF1,
    GUARD_LIGHTMA,
    GUARD_DARKMA,
    GUARD_DRAGONMA,
    NEUT,
    NEUTQUEEN,
    NEUTBUG,
    AGGRESSIVE_LIGHT,
    AGGRESSIVE_DARK,
    AGGRESSIVE_DRAGON,
    POLYMORPHPARROT,
    ABDRAGON_AABDARK,
    ABDARK_AABDRAGON,
    OCTASIDEBABY,
    GUARD_DARKAENEMY,
    ENEMY_AGUARD_DARK,
    GRIFFO,
    GRIFFON,
    SHELLIZARDMOM,
    SHELLIZARDBABY,
    MANDURITWEAK,
    CHERUBIM2ND,
    LEHPAR,
    GUARDDARK_ALEHPAR,
    LEHPAR_AGUARDDARK,
    AGGRESSIVE1_AAGGRESSIVE2,
    AGGRESSIVE2_AAGGRESSIVE1,
    LEHPAR_APRETOR,
    PRETOR_ALEHPAR,
    CYCLOPSBOSS,
    FIREELBOSS,
    FIREEL1,
    FIREEL2,
    FIREEL3,
    AIRELBOSS,
    AIREL1,
    AIREL2,
    AIREL3,
    ETTIN,
    L_DRGUARD_ADRAGGMOB1,
    DRAGGMOB_ADRGUARD1,
    DARU_HZAIF,
    ZAIF_ADARU,
    MUTA_HOCTASIDE,
    OCTASIDE_AMUTA,
    LIZARDMAN,
    ATAURIC,
    AHELLHOUND,
    APRETOR,
    GHOSTLIGHT,
    GHOSTDARK,
    BMLGUARDIAN,
    BMDGUARDIAN,
    GMASTER,
    GSLAVE,
    ELEMENTAL_FIRE,
    ELEMENTAL_EARTH,
    ELEMENTAL_AIR,
    ELEMENTAL_WATER,
    BAT_FAMILY_ELITE,
    SUCCUBUS_ELITE,
    SAM_ELITE,
    MAIDENGOLEM_ELITE,
    GARGOYLE_ELITE,
    AGGRESSIVE_LIGHT_HSPECTRE,
    AGGRESSIVE_DARK_HSPECTRE,
    SPECTRE_AALIGHTDARK,
    DRAMA_EVE_NONPC_A,
    DRAMA_EVE_NONPC_B,
    DRAMA_KIMEIA_NPC,
    DRAMA_EVE_NONPC_DARKA,
    DRAMA_EVE_NONPC_DARKB,
    DRAMA_KIMEIA_DARKNPC,
    DRAMA_KIMEIA_MOB,
    XIPETO,
    XIPETOBABY,
    TAURIC,
    CRESTLICH,
    NNAGA,
    NNAGA_PRIEST,
    NNAGA_SERVANT,
    NNAGA_ELEMENTALIST,
    NNAGA_ELEMENTAL,
    NLIZARDMAN,
    NLIZARDRAISER,
    NLIZARDPET,
    NLIZARDPRIEST,
    NNAGA_PRIESTBOSS,
    NNAGA_BOSS_SERVANT,
    SEIREN_MASTER,
    SEIREN_SNAKE,
    GENERAL_ADADR,
    GENERALDA_ALIDR,
    GENERALDR_ALIDA,
    LIZARDMAN_BOMB,
    BOMB_LIZARDMAN,
    LIZARDMAN_KB,
    DRAKEPURPLE_MASTER,
    DRAKEPURPLE_SLAVE,
    DRAKY_BOMB_MASTER,
    DRAKY_BOMB_EX,
    FIREFUNGY,
    NOFIGHT,
    FIELD_OBJECT_ALL,
    DRAKANDF3BOSS,
    DRAKANDF3SLAVE,
    CONSIADE,
    CONSIADE_SUM,
    PARENTSMONSTER,
    CHILDMONSTER,
    SEIREN,
    TEST_LIGHT_ADARK,
    TEST_LIGHT_ADRAGON,
    TEST_LIGHT_AETC,
    TEST_DARK_ALIGHT,
    TEST_DARK_ADRAGON,
    TEST_DARK_AETC,
    TEST_DRAGON_ALIGHT,
    TEST_DRAGON_ADARK,
    TEST_DRAGON_AETC,
    TEST_ETC_ALIGHT,
    TEST_ETC_ADARK,
    TEST_ETC_ADRAGON,
    ABYSSDRAKANGATE,
    DARK_NPC,
    LIGHT_NPC,
    DARK_MOB,
    LIGHT_MOB,
    DARK_SUR_MOB,
    LIGHT_SUR_MOB,
    DARK_LICH,
    LIGHT_LICH,
    LICH_SOULEDSTONE,
    LIGHT_DENLABIS,
    FIRETEMPLE_MOB,
    QUESTGUARD_DARK,
    QUESTGUARD_LIGHT,
    BROHUM,
    CALYDON,
    CALYDON_POLYMORPH,
    SWELLFISH,
    TRICON,
    TRICO,
    PROTECTGUARD_LIGHT,
    PROTECTGUARD_DARK,
    FIELD_OBJECT_ALL_MONSTER,
    HOLYSERVANT,
    HOLYSERVANT_DEBUFFER,
    HOLYSERVANT_DESPAWN,
    RANMARK,
    AGGRESSIVESUPPORTMONSTER2,
    LASBERG,
    SHULACK,
    ESCORT,
    AGGRESSIVEESCORT,
    XDRAKAN,
    XDRAKAN_ELEMENTALIST,
    XDRAKAN_PET,
    XDRAKAN_PRIEST,
    XDRAKAN_SERVANT,
    AGGRESSIVETOSHULACK,
    SHULACK_DECK,
    SHULACK_DECK_KILLER,
    DRAGON,
    DRAGON_SLAVE,
    DRAGON_CTRL,
    AGGRESSIVETOSHULACK2,
    SPALLER,
    SPALLERCTRL,
    SHULACK_SLAVE,
    IDLF1_MONSTER,
    AGGRESSIVETOPCPET,
    GENERALDR_ALIDA_SUPPORT,
    GOLEM_SWITCH,
    USEALLNONETOMONSTER,
    FANATIC,
    IDTEMPLE_BUGS,
    IDTEMPLE_STONE,
    IDELIM,
    IDELIM_FRIEND,
    FRIENDLYTOIDELIM,
    AGGRESSIVETOIDELIM,
    IDCATACOMBS_TAROS,
    IDCATACOMBS_DRAKE,
    IDCATACOMBS_DRAKE_SUM,
    DUMMY,
    HOSTILE_ALL,
    AGGRESSIVE_ALL,
    F4GUARD_LIGHT,
    F4GUARD_DARK,
    F4GUARD_DRAGON,
    F4RAID,
    DRAMATA,
    DRAMATATIMERA,
    DRAMATATIMERB,
    DRAKANPOLYMORPH,
    DRAKANDOOR,
    GHTIMER,
    SHULACK_ATTACKING,
    SHULACK_ATTACKED,
    SHULACK_SUPPORT,
    NLIZARDMAN2,
    DUMMY2,
    DUMMY_DGUARD,
    DUMMY2_DGUARD,
    CRYSTAL,
    ANTI_CRYSTAL,
    DUMMY_LGUARD,
    DUMMY2_LGUARD,
    HOSTILEONLYMONSTER,
    ATKDRAKAN,
    CRYSTAL_NMDD,
    CRYSTAL_SUM,
    GENERAL_KRALL,
    GENERAL_DARK_LYCAN,
    WAVE_TREE,
    WAVE_SWARM1,
    WAVE_SWARM2,
    LYCAN_PC,
    KRALL_PC,
    IDELEMENTAL2HEALSUM,
    AGGRESSIVEMONSTER,
    IDYUN_XDRAKAN,
    IDYUN_SIEGEWEAPON,
    IDYUN_ANCIENT,
    IDYUN_HDRAKAN,
    IDYUN_ODRAKAN,
    IDYUN_RDRAKAN,
    IDYUN_D1,
    IDYUN_OBJECTS,
    IDYUN_TARGET,
    IDRAKSHA_DRAKAN,
    IDRAKSHA_DRAGONTOOTH,
    IDRAKSHA_NORMAL,
    IDRAKSHA_RAKSHA,
    DECOY,
    DECOY_HUNGER,
    IDYUN_BOMBER,
    IDYUN_ANTIBOMBER,
    PREDATOR,
    PREY,
    IDYUN_POLYMORPH,
    IDYUN_DOOR,
    IDYUN_VASARTI,
    IDYUN_MEROPS,
    IDYUN_FIST,
    LDF4A_SANDWARM,
    LDF4A_NEPILIM,
    LDF4A_OWLLAU,
    LDF4A_CALYDON,
    LDF4B_AGGRESSIVEYUNSOLDIER,
    LDF4B_ATTACKWAGON,
    LDF4B_FANATIC,
    IDLDF4A_DECOY,
    GENERAL_IDLDF4A_INTRO,
    GENERAL_DARK_IDLDF4A_INTRO,
    AGRESSIVETOMONSTER,
    LDF4A_PUBLIC_MONSTER,
    GENERAL_LDF4A_PUBLIC_YUN,
    MONSTER_LDF4A_PUBLIC_LIZARDMAN,
    YDUMMY,
    YDUMMY2,
    YDUMMY_GUARD,
    YDUMMY2_GUARD,
    YUN_GUARD,
    LDF4B_WAGON,
    LDF4B_SPARRING_GUARD,
    LDF4B_SPARRING_Y,
    GURURU_D1,
    GURURU_DECO,
    LDF4B_SPARRING_GUARD2,
    LDF4B_SPARRING_Y2,
    YDUMMY_LGUARD,
    YDUMMY2_LGUARD,
    YDUMMY_DGUARD,
    YDUMMY2_DGUARD,
    LDF4B_SPARRING_DGUARD,
    LDF4B_SPARRING_DGUARD2,
    TDOWN_DRAKAN,
    NEUTRAL_LGUARD,
    NEUTRAL_DGUARD,
    LDF4A_NEPILIM_SUMMON,
    DRAKAN_LGUARD,
    DRAKAN_DGUARD,
    LDF4B_MINE,
    LDF4A_YUN_GUARD,
    XDRAKAN_LGUARD,
    XDRAKAN_DGUARD,
    LDF4A_LG_SKILL,
    LDF4A_LG_SKILL_RECEIVE,
    LDF4A_POLY_SHULACK,
    TESTBATTLE_NPC,
    TIAMATREMNANT_DRAKAN,
    TIAMATREMNANT_LIZARD,
    TIAMATREMNANT_LIZARD_INJURY,
    NEUTRAL_GUARD,
    VRITRA,
    IDEVENT01_SUMMON,
    LIGHT_SUR_MOB_DF2ADIRECTPORTAL,
    LIGHT_LICH_DF2ADIRECTPORTAL,
    LDF5_CALYDON,
    LDF5_OWLLAU,
    LDF5_GURURU,
    ELEMENTAL_LIGHT,
    NEUTRAL_GUARD_ON_ATTACK,
    NEUTRAL_GUARD_ON_ATTACK01,
    XDRAKAN_UNATTACK,
    GOD_KAISINEL,
    GOD_MARCHUTAN,
    TIAMAT,
    LDF5_VESPA,
    LDF5_SPAKLE,
    LDF5_LUPYLLINI,
    LDF5_BRAX,
    LDF5_SHULACK_KEEPER,
    LDF5_WORKER,
    KAHRUN,
    IDTIAMAT_XDRAKAN,
    IDTIAMAT_ANCIENT,
    LDF5_DARU,
    IDEVENT01_TOWER,
    IDTIAMAT_SPAWNHEAL,
    IDTIAMAT_AREAHIDE,
    IDEVENT01_POLYMORPHL,
    IDEVENT01_POLYMORPHD,
    IDF5_SIEGEWEAPON,
    IDF5_SIEGEWEAPON_ATTACK,
    IDEVENT01_MC,
    IDF5_R2_SYNC1,
    IDF5_R2_SYNC1_ATTACK,
    IDF5_R2_SYNC2,
    IDF5_R2_SYNC2_ATTACK,
    IDF5_R2_SYNC3,
    IDF5_R2_SYNC3_ATTACK,
    LDF5_FUNGY,
    LDF5_V_CHIEF_L,
    LDF5_V_CHIEF_D,
    LDF5_V_CHIEF_DR,
    LDF5_V_KILLER_L,
    LDF5_V_KILLER_D,
    LDF5_V_KILLER_DR,
    LDF5_BABARIAN,
    IDF5_TD_WEAPON_PC,
    IDF5_TD_DOOR,
    IDF5_TD_ASSULT,
    IDF5_TD_SIEGE,
    TEST_ATTACKTOPC,
    TEST_ATTACKTOPC_DARK,
    TEST_ATTACKTONPC,
    TEST_SUPPORTNPC,
    TEST_DRAKAN,
    LDF_V_CHIEF_L,
    LDF_V_CHIEF_D,
    LDF_V_KILLER_LEHPAR,
    LDF_V_KILLER_KRALL,
    LDF_V_KILLER_LYCAN,
    LDF_V_GUARD_LIGHT,
    LDF_V_GUARD_DARK,
    IDF5_TD_COMMANDER_LI,
    IDF5_TD_COMMANDER_DA,
    IDLDF5_UNDER_RUNE,
    LDF5B_KILLER,
    LDF5B_DOOR_LI,
    LDF5B_DOOR_DA,
    LDF5B_DOOR_DR,
    FIELD_OBJECT_ALL_HOSTILEMONSTER,
    LDF5B_FOBJ_HOSTILEPC,
    IDF5_TD_GUARD_LIGHT,
    IDF5_TD_GUARD_DARK,
    IDRUNEWP_VRITRA,
    IDRUNEWP_ESCORT,
    IDRUNEWP_ANCIENTARM,
    LDF5_DEBRIE,
    LDF5_NEUT,
    IDLDF5RE_SOLO_Q,
    LDF5_SHULACK_DIRECT,
    LDF5_NATIVE_DIRECT,
    SHULACK_SLAVE_NOTAGGRESSIVE,
    LDF5B_OUT_DOOR_KILLER_LI,
    LDF5B_OUT_DOOR_KILLER_DA,
    LDF5_MUTA,
    USEALL_LDF5_TOWER_LI,
    USEALL_LDF5_TOWER_DA,
    MONSTER_FRIENDLY_LDFCHIEF,
    USEALL_TELEPORTER_LI,
    USEALL_TELEPORTER_DA,
    IDASTERIA_IU_MONSTER,
    IDASTERIA_IU_NPC,
    IDASTERIA_IU_POLYMORPHL,
    IDASTERIA_IU_POLYMORPHD,
    IDF5_R2_CANNON,
    IDF5_R2_CANNON_ATTACK,
    IDASTERIA_IU_ATK,
    USEALL_HOSTILEPC,
    IDRUNEWP_RUNEDEVICE,
    IDASTERIA_IU_MONSTER2,
    NONAGRRESSIVEFRIENDLYVRITRA,
    IDVRITRA_BASE_REBIRTH,
    IDKAMAR_VRITRA,
    IDRUNEWP_VRITRADEVICE,
    IDKAMAR_SIEGEWEAPON_LIGHT,
    IDKAMAR_SIEGEWEAPON_DARK,
    IDF5_TD_WEAPON_PC_DARK,
    IDRUNEWP_AGGRESSIVEANCIENTARM,
    VRITRASUPPORT,
    AGRRESSIVEFRIENDLYVRITRA,
    AGRRESSIVEFRIENDLYVRITRA2,
    VRITRATANK,
    AGRRESSIVEVRITRAANDPC,
    TIGRAN,
    IDF5U1_VRITRA,
    IDF5U1_VRITRAWEAPON,
    IDF5U1_VRITRATRAP,
    IDF5U1_TANK,
    IDF5U1_AGGRESSIVETANK,
    IDKAMAR_SIEGEWEAPON_ATTACK,
    PROTECTGUARD_LIGHT_SIEGEWEAPON,
    PROTECTGUARD_DARK_SIEGEWEAPON,
    IDF5_TD_BOMBER,
    IDF5U2_VRITRA,
    IDF5U2_VRITRATRAP,
    IDF5U2_GUARD,
    IDF5U2_GUARD_DARK,
    IDF5U2_SHULACK,
    IDF5U2_SHULACK_SLAVE,
    IDF5U2_SHULACK_ESCORT,
    IDF5U1_VRITRAFLAG,
    IDF5U1_PCFLAG,
    IDKAMAR_PROTECTGUARD_LIGHT,
    IDKAMAR_PROTECTGUARD_DARK,
    IDF5U2_ARROWTRAP,
    IDKAMAR_CANNON,
    IDASTERIA_IU_WORLD_MONSTER,
    IDASTERIA_IU_WORLD_NPC,
    IDASTERIA_IU_WORLD_POLYMORPHL,
    IDASTERIA_IU_WORLD_POLYMORPHD,
    IDASTERIA_IU_WORLD_MONSTER2,
    IDF5U2_FOBJ,
    IDF5_TELEPORT_MONSTER,
    IDF5_TELEPORT_NPC,
    UNDER_01_WAR_VRITRA,
    IDF5_U3_OBJ,
    IDF5_U3_VRITRA_01,
    IDF5_U3_VRITRA_02,
    IDF5_U3_VRITRA_HIDE,
    IDF5_TD_WAR_LIGHT,
    IDF5_TD_WAR_DARK,
    IDF5_U3_CANNON,
    IDF5_U1_WAR_01_GUARD,
    IDF5_U1_WAR_01_GUARD_DARK,
    IDF5_U1_WAR_01_REWARD,
    IDF5_U3_VRITRA,
    IDF5_U3_VRITRA_SUM,
    IDF5_U3_VRITRA_BOSS_SUM,
    GAB1_01_POINT_01(true),
    GAB1_01_POINT_02(true),
    GAB1_01_POINT_03(true),
    GAB1_01_POINT_04(true),
    GAB1_01_POINT_05(true),
    GAB1_02_POINT_01(true),
    GAB1_02_POINT_02(true),
    GAB1_02_POINT_03(true),
    GAB1_02_POINT_04(true),
    GAB1_02_POINT_05(true),
    GAB1_03_POINT_01(true),
    GAB1_03_POINT_02(true),
    GAB1_03_POINT_03(true),
    GAB1_03_POINT_04(true),
    GAB1_03_POINT_05(true),
    GAB1_04_POINT_01(true),
    GAB1_04_POINT_02(true),
    GAB1_04_POINT_03(true),
    GAB1_04_POINT_04(true),
    GAB1_04_POINT_05(true),
    GAB1_MONSTER(true),
    GAB1_SHUGO(true),
    IDFORTRESS_SWITCH_LIGHT,
    IDFORTRESS_SWITCH_DARK,
    IDFORTRESS_VRITRA,
    GAB1_01_REMNANT(true),
    GAB1_02_REMNANT(true),
    GAB1_03_REMNANT(true),
    GAB1_04_REMNANT(true),
    IDRUNEWP_RUNEFRIEND,
    IDLDF4_RE_01,
    IDLDF4_RE_01_DOOR,
    IDLDF4_RE_01_GUARD,
    GAB1_TURRET(true),
    LDF4_ADVANCE_SINGLE,
    LDF4_ADVANCE_SAAM,
    LDF4_ADVANCE_WORKER,
    LDF4_ADVANCE_CHAPIRE_SINGLE,
    LDF4_ADVANCE_POTCRAB,
    LDF4_ADVANCE_TIAMAT,
    LDF4_ADVANCE_MANDURI,
    LDF4_ADVANCE_CHAPIRE_SUPPORT,
    LDF4_ADVANCE_NEUTH,
    LDF4_ADVANCE_XIPRTO,
    LDF4_ADVANCE_POPOKU,
    LDF4_ADVANCE_MUDTHORN,
    IDLDF4_RE_01_GUARD_DARK,
    GAB1_SUB_DRAKAN(true),
    GAB1_SUB_NONAGGRESSIVE_DRAKAN(true),
    GAB1_SUB_DEST_69(true),
    GAB1_SUB_DEST_70(true),
    GAB1_SUB_DEST_71(true),
    GAB1_SUB_DEST_72(true),
    GAB1_SUB_KILLER(true),
    GAB1_KILLER(true),
    LDF5_FORTRESS_VRITRA,
    LDF5_FORTRESS_LIGHT,
    LDF5_FORTRESS_DARK,
    IDLDF4_RE_01_FRIEND,
    WORLDRAID_MONSTER,
    LDF5_DUMMY1,
    LDF5_DUMMY2,
    LDF5_DUMMY1_LGUARD,
    LDF5_DUMMY2_LGUARD,
    LDF5_DUMMY1_DGUARD,
    LDF5_DUMMY2_DGUARD,
    LDF5_SPARRING1_LGUARD,
    LDF5_SPARRING2_LGUARD,
    LDF5_SPARRING1_DGUARD,
    LDF5_SPARRING2_DGUARD,
    LDF4_ADVANCE_LGUARD,
    LDF4_ADVANCE_DGUARD,
    LDF4_ADVANCE_DRGUARD,
    WORLDRAID_MONSTER_SANDWORMSUM,
    LDF5_FORTRESS_TANK_LIGHT,
    LDF5_FORTRESS_TANK_DARK,
    TELEPORTOR_LI,
    TELEPORTOR_DA,
    GAB1_MONSTER_NONAGGRE(true),
    IDVRITRA_BASE_GI_BEACON,
    IDVRITRA_BASE_GI_CANNON,
    IDF5_SIEGEWEAPON_PC_DARK,
    WORLDRAID_NPC,
    LDF4_ADVANCE_LIPOPOKU,
    LDF4_ADVANCE_DACHAPIRE,
    LDF4_ADVANCE_GODELITELF,
    LDF4_ADVANCE_GODELITEDM,
    LDF4_ADVANCE_AGGRESSIVESINGLE,
    LDF4_ADVANCE_FNAMED_FOBJ,
    GAB1_SUB_ATTACKABLE_FOBJ(true),
    GAB1_SUB_DEST_69_AGGRESSIVE(true),
    GAB1_SUB_DEST_70_AGGRESSIVE(true),
    GAB1_SUB_DEST_71_AGGRESSIVE(true),
    GAB1_SUB_DEST_72_AGGRESSIVE(true),
    SIEGEWEAPON_PC,
    SIEGEWEAPON_PC_DARK,
    GAB1_PEACE(true),
    IDSTATION_BOOM,
    IDSWEEP_MONSTER,
    IDSWEEP_MONSTER2,
    IDSWEEP_MINE,
    IDSWEEP_NPC,
    IDSWEEP_POLYMORPHL,
    IDSWEEP_POLYMORPHD,
    LF5_ITEM,
    LF5_ITEM_SUM,
    IDSWEEP_MONSTER3,
    IDSTATION_GUIDE,
    AB1_DOOR_LI,
    AB1_DOOR_DA,
    AB1_DOORKILLER,
    IDSWEEP_BONUS,
    IDSTATION_POLYMORPH,
    IDSTATION_MONSTER,
    IDSEAL_PCGUARD,
    IDSEAL_PCGUARD_SCENE,
    IDSEAL_BOSS,
    IDSEAL_BOSS_SCENE,
    IDSEAL_BOSS_OBEY,
    IDSEAL_BOSS_SUMMON,
    IDSEAL_SEALGUARD,
    IDSEAL_SEALGUARD_SKILL,
    IDSEAL_BOSS_SKILL_01,
    IDSEAL_BOSS_SKILL_02,
    IDSEAL_BOSS_SKILL_03,
    IDSEAL_BOSS_SKILL_04,
    IDSEAL_BOSS_SKILL_05,
    IDSEAL_WAVE_DEALER,
    IDSEAL_WAVE_TANKER,
    IDSEAL_WAVE_HEALER,
    IDSEAL_WAVELEADER,
    IDSEAL_WAVETARGET,
    IDSEAL_GROUPMONSTER_1,
    IDSEAL_GROUPMONSTER_2,
    IDSEAL_GROUPMONSTER_3,
    IDSEAL_GROUPLEADER_1,
    IDSEAL_GROUPLEADER_2,
    IDSEAL_GROUPLEADER_3,
    IDSEAL_MONSTER,
    IDLDF5RE_SOLO_VRITRA_01,
    IDLDF5RE_SOLO_CRISTAL_01,
    DF5_FUNGY,
    DF5_MERMAN,
    DF5_FRILLFAIMAM,
    DF5_DUMMY1,
    DF5_DUMMY2,
    DF5_DUMMY1_DGUARD,
    DF5_DUMMY2_DGUARD,
    DF5_FRILLFAIMAM_BABY,
    DF5_MERMAN_MURATUN,
    LF5_DUMMY1,
    LF5_DUMMY2,
    LF5_DUMMY1_LGUARD,
    LF5_DUMMY2_LGUARD,
    DF5_VRITRA,
    DF5_GUARD_SCENE,
    DF5_VRITRA_SCENE,
    LF5_GUARD_01_LIGHT,
    LF5_GUARD_02_LIGHT,
    LF5_GUARD_03_LIGHT,
    LF5_GUARD_04_LIGHT,
    DF5_GUARD_01_DARK,
    DF5_GUARD_02_DARK,
    DF5_GUARD_03_DARK,
    DF5_GUARD_04_DARK,
    LF5_GUARD_TRAP,
    DF5_GUARD_TRAP,
    FIELD_OBJECT_LIGHT(true),
    FIELD_OBJECT_DARK(true),
    USEALL(true),
    NONE(true),
    NPC(true),
    IDKAMAR_PROTECTGUARD(true),
    ASIST_D(true),
    /* New 4.9 */
    AB1_AGGRESSIVESINGLEMONSTER,
    AB1_AGGRESSIVESUPPORTMONSTER,
    AB1_BOSS,
    ERESUKIGAL,
    IDDF3_DRAGON_T_BOSS,
    IDELEMENTAL_2_E_BOSS,
    IDELEMENTAL_2_E_NPC,
    IDSEAL_Q_BOSS,
    IDSEAL_Q_GUARD,
    IDSEAL_Q_GUARD_PRIEST,
    IDSEAL_Q_KEYNAMED,
    IDSEAL_Q_MOB,
    IDSEAL_Q_MOB_A,
    IDSEAL_Q_NPC,
    IDSEAL_Q_SKILL_01,
    IDSEAL_Q_SKILL_02,
    IDSEAL_Q_SKILL_03,
    IDSEAL_Q_SKILL_04,
    IDSEAL_Q_WAVE,
    PROTECTGUARD_LIGHT_F2A,
    PROTECTGUARD_LIGHT_HERO,
    PROTECTGUARD_DARK_F2A,
    PROTECTGUARD_DARK_HERO,
    /* New 4.9.1 */
    GRANDRVR,
    GRANDRVR_DARK,
    RVR_DGUARD_01,
    RVR_DGUARD_02,
    RVR_DGUARD_03,
    RVR_DGUARD_04,
    RVR_DGUARD_05,
    RVR_DGUARD_06,
    RVR_DGUARD_07,
    RVR_DGUARD_08,
    RVR_DGUARD_09,
    RVR_LGUARD_01,
    RVR_LGUARD_02,
    RVR_LGUARD_03,
    RVR_LGUARD_04,
    RVR_LGUARD_05,
    RVR_LGUARD_06,
    RVR_LGUARD_07,
    RVR_LGUARD_08,
    RVR_LGUARD_09,
    RVR_LIZARD_GUARD_01,
    RVR_LIZARD_GUARD_02,
    RVR_LIZARD_GUARD_03,
    RVR_LIZARD_GUARD_04,
    RVR_LIZARD_GUARD_05,
    RVR_LIZARD_GUARD_06,
    RVR_LIZARD_GUARD_07,
    RVR_LIZARD_GUARD_08,
    RVR_LIZARD_GUARD_09,
    WORLDRAID_EVENT,
    WORLDRAID_EVENT_AGGRESSIVE;

    private Race guardRace;
    private boolean isBasic;
    private boolean isUsed = true;

    private TribeClass() {
    }

    private TribeClass(Race guardRace) {
        this.guardRace = guardRace;
    }

    private TribeClass(Race guardRace, boolean isBasic) {
        this.guardRace = guardRace;
        this.isBasic = isBasic;
    }

    private TribeClass(boolean isBasic) {
        this.isBasic = isBasic;
    }

    public boolean isGuard() {
        return guardRace != null;
    }

    public boolean isBasicClass() {
        return isBasic;
    }

    public boolean isLightGuard() {
        return guardRace == Race.ELYOS;
    }

    public boolean isDarkGuard() {
        return guardRace == Race.ASMODIANS;
    }

    public boolean isDrakanGuard() {
        return guardRace == Race.DRAGON;
    }

    public boolean isPC() {
        return this == TribeClass.PC || this == TribeClass.PC_DARK;
    }

    /**
     * @return true if tribe is used for any npc
     */
    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }
}