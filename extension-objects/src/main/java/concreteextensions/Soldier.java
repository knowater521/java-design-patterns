package concreteextensions;

import abstractextensions.SoldierExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import units.SoldierUnit;

/**
 * Created by Srdjan on 26-Apr-17.
 */
public class Soldier implements SoldierExtension {

  private SoldierUnit unit;

  public Soldier(SoldierUnit soldierUnit) {
    this.unit = soldierUnit;
  }

  final Logger logger = LoggerFactory.getLogger(Soldier.class);

  @Override
  public void soldierReady() {
    logger.info("[Solider] " + unit.getName() + "  is ready!");
  }
}
