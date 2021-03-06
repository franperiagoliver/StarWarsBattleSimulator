package com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant;

import com.cdprojectblue.alicante.starwarsbattlesimulator.constants.BattleConstants;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClasses.EarthMachine;
import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Faction;

public class TurboTank extends EarthMachine{
	public TurboTank () {
		super();
		
		this.setHealth(BattleConstants.EARTH_HEALTH);
		this.setPower(BattleConstants.EARTH_POWER);
		this.setPointCost(BattleConstants.EARTH_COST);
		this.setFaction(Faction.REBELS);
		
	}
}
