<?PHP
// ----------------------------------------------------------------------------
// Modul  : inc_modifierattrs.php                                      MODIFIER
// Version: 01.00, Mariella 02/2016
// Zweck  : definiert Vorgaben f�r die Modifier-Attribut-Namen-Umsetzung und 
//          Funktionen zur Ermittlung dieser Namen / Typen
// Hinweis: NUR F�R DIE Modifier-Attribute 
// siehe  : inc_itemattr.php  f�r die Enchant-Attribut-Namen
//          inc_bonusattr.php f�r die Bonus-Attribut-Namen
// ----------------------------------------------------------------------------
      
$tabmodifierattrs  = array(
                        "ARBLEED" => "BLEED_RESISTANCE",
                        "ARBLIND" => "BLIND_RESISTANCE",
                        "ARCHARM" => "CHARM_RESISTANCE",
                        "ARCONFUSE" => "CONFUSE_RESISTANCE",
                        "ARCURSE" => "CURSE_RESISTANCE",
                        "ARDISEASE" => "DISEASE_RESISTANCE",
                        "ARFEAR" => "FEAR_RESISTANCE",
                        "AROPENAREIAL" => "OPENAREIAL_RESISTANCE",
                        "ARPARALYZE" => "PARALYZE_RESISTANCE",
                        "ARPERIFICATION" => "PERIFICATION_RESISTANCE",
                        "ARPOISON"  => "POISON_RESISTANCE",
                        "ARROOT" => "ROOT_RESISTANCE",
                        "ARSILENCE" => "SILENCE_RESISTANCE",
                        "ARSLEEP" => "SLEEP_RESISTANCE",
                        "ARSLOW" => "SLOW_RESISTANCE",
                        "ARSNARE" => "SNARE_RESISTANCE",
                        "ARSPIN" => "SPIN_RESISTANCE",
                        "ARSTAGGER" => "STAGGER_RESISTANCE",
                        "ARSTUMBLE" => "STUMBLE_RESISTANCE",
                        "ARSTUN" => "STUN_RESISTANCE",
                        "ARSTUNLIKE" => "STUNLIKE_RESISTANCE",
                        "ATTACKDELAY" => "ATTACK_SPEED",
                        "BLEED_ARP" => "BLEED_RESISTANCE_PENETRATION",
                        "BLIND_ARP" => "BLIND_RESISTANCE_PENETRATION",
                        "BLOCK" => "BLOCK",
                        "BLOCKPENETRATION" => "BLOCK_PENETRATION",
                        "BOOSTCASTINGTIME" => "BOOST_CASTING_TIME",
                        "BOOSTHATE" => "BOOST_HATE",
                        "CHARM_ARP" => "CHARM_RESISTANCE_PENETRATION",
                        "CONCENTRATION" => "CONCENTRATION",
                        "CONFUSE_ARP" => "CONFUSE_RESISTANCE_PENETRATION",
                        "CRITICAL" => "PHYSICAL_CRITICAL",
                        "CURSE_ARP" => "CURSE_RESISTANCE_PENETRATION",
                        "DAMAGE_REDUCE" => "DAMAGE_REDUCE",
                        "DISEASE_ARP" => "DISEASE_RESISTANCE_PENETRATION",
                        "DODGE" => "EVASION",
                        "ELEMENTALDEFENDAIR" => "WIND_RESISTANCE",
                        "ELEMENTALDEFENDEARTH" => "EARTH_RESISTANCE",
                        "ELEMENTALDEFENDFIRE" => "FIRE_RESISTANCE",
                        "ELEMENTALDEFENDWATER" => "WATER_RESISTANCE",
                        "FEAR_ARP" => "FEAR_RESISTANCE_PENETRATION",
                        "FLYSPEED" => "FLY_SPEED",
                        "HEALSKILLBOOST" => "HEAL_BOOST",
                        "HITACCURACY" => "PHYSICAL_ACCURACY",
                        "MAGICALATTACK" => "MAGICAL_ATTACK",
                        "MAGICALCRITICALDAMAGEREDUCE" => "MAGICAL_CRITICAL_DAMAGE_REDUCE",
                        "MAGICALCRITICAL" => "MAGICAL_CRITICAL",
                        "MAGICALCRITICALREDUCERATE" => "MAGICAL_CRITICAL_RESIST",
                        "MAGICALDEFEND" => "MAGICAL_DEFEND",
                        "MAGICALHITACCURACY" => "MAGICAL_ACCURACY",
                        "MAGICALRESIST" => "MAGICAL_RESIST",
                        "MAGICALSKILLBOOST" => "BOOST_MAGICAL_SKILL",
                        "MAGICALSKILLBOOSTRESIST" => "MAGIC_SKILL_BOOST_RESIST",
                        "MAGICAL_DEFEND" => "MAGICAL_DEFEND",
                        "MAGICAL_RESIST" => "MAGICAL_RESIST",
                        "MAGICAL_SKILL_BOOST_RESIST" => "MAGIC_SKILL_BOOST_RESIST",
                        "MAXFP" => "FLY_TIME",
                        "MAXHP" => "MAXHP",
                        "MAXMP" => "MAXMP",
                        "MAX_HP" => "MAXHP",
                        "OPENAREIAL_ARP" => "OPENAREIAL_RESISTANCE_PENETRATION",
                        "PARALYZE_ARP" => "PARALYZE_RESISTANCE_PENETRATION",
                        "PARRY" => "PARRY",
                        "PERIFICATION_ARP" => "PERIFICATION_RESISTANCE_PENETRATION",
                        "PHYATTACK" => "PHYSICAL_ATTACK",
                        "PHYSICALCRITICALDAMAGEREDUCE" => "PHYSICAL_CRITICAL_DAMAGE_REDUCE",
                        "PHYSICALCRITICALREDUCERATE" => "PHYSICAL_CRITICAL_RESIST",
                        "PHYSICALDEFEND" => "PHYSICAL_DEFENSE",
                        "PHYSICAL_CRITICAL_REDUCE_RATE" => "PHYSICAL_CRITICAL_RESIST",
                        "PHYSICAL_DEFEND" => "PHYSICAL_DEFENSE",
                        "POISON_ARP" => "POISON_RESISTANCE_PENETRATION",
                        "PROCREDUCERATE" => "PROC_REDUCE_RATE",
                        "PVPATTACKRATIO" => "PVP_ATTACK_RATIO",
                        "PVPATTACKRATIO_MAGICAL" => "PVP_ATTACK_RATIO_MAGICAL",
                        "PVPATTACKRATIO_PHYSICAL" => "PVP_ATTACK_RATIO_PHYSICAL",
                        "PVPBLOCK" => "PVP_BLOCK",
                        "PVPDEFENDRATIO" => "PVP_DEFEND_RATIO",
                        "PVPDEFENDRATIO_MAGICAL" => "PVP_DEFEND_RATIO_MAGICAL",
                        "PVPDEFENDRATIO_PHYSICAL" => "PVP_DEFEND_RATIO_PHYSICAL",
                        "PVPDODGE" => "PVP_EVASION",
                        "PVPHITACCURACY" => "PVP_PHYSICAL_ACCURACY",
                        "PVPMAGICALHITACCURACY" => "PVP_MAGICAL_ACCURACY",
                        "PVPMAGICALRESIST" => "PVP_MAGICAL_RESIST",
                        "PVPPARRY" => "PVP_PARRY",
                        "PYSICAL_DEFEND" => "PHYSICAL_DEFENSE",
                        "ROOT_ARP" => "ROOT_RESISTANCE_PENETRATION",
                        "SILENCE_ARP" => "SILENCE_RESISTANCE_PENETRATION",
                        "SLEEP_ARP" => "SLEEP_RESISTANCE_PENETRATION",
                        "SLOW_ARP" => "SLOW_RESISTANCE_PENETRATION",
                        "SNARE_ARP" => "SNARE_RESISTANCE_PENETRATION",
                        "SPEED" => "SPEED",
                        "SPIN_ARP" => "SPIN_RESISTANCE_PENETRATION",
                        "STAGGER_ARP" => "STAGGER_RESISTANCE_PENETRATION",
                        "STUMBLE_ARP" => "STUMBLE_RESISTANCE_PENETRATION",
                        "STUN_ARP" => "STUN_RESISTANCE_PENETRATION",
                        
                        // Erg�nzungen f�r Client 5.0
                        
                        "HAGI" => "PRECISION",
                        "HDEX" => "AGILITY",
                        "HKNO" => "KNOWLEDGE",
                        "HSTR" => "POWER",
                        "HVIT" => "MAXHP",
                        "HWIL" => "WILL"
                      ); 
$tabMissedModifierAttr = array();                      
// ----------------------------------------------------------------------------
// Modifier-Attribut-Name ermitteln 
// Params:  $name       der im Client genutzte Modifier-Attribut-Name
// return:  string      umgesetzter EMU-Name oder $name, wenn nicht gefunden
// ----------------------------------------------------------------------------
function getModifierAttrName($name)
{
    global $tabmodifierattrs,$tabMissedModifierAttr;
    
    $such = strtoupper($name);
    
    if (isset($tabmodifierattrs[$such]))
        return $tabmodifierattrs[$such];
    else
    {
        if (!isset($tabMissedModifierAttr[$such]))
        {
            logLine("Modifier-Attribut fehlt",$such);
            $tabMissedModifierAttr[$such] = 1;
        }
        return $such;
    }
}
?>