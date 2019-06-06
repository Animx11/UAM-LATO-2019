package pl.wizard.software.economy;

import com.google.common.collect.Range;
import entities.CreatureEntity;

public class CreatureEcoDomain {

    private final String name;
    private final int maxHp;
    private final Range<Integer> attack;
    private final int defence;
    private int speed;
    private int goldCost;

    CreatureEcoDomain(String aName, int aMaxHp, Range<Integer> aAttack, int aDefence, int aSpeed, int aGoldCost) {
        name = aName;
        maxHp = aMaxHp;
        attack = aAttack;
        defence = aDefence;
        speed = aSpeed;
        goldCost = aGoldCost;
    }

    CreatureEcoDomain(CreatureEntity aEntity) {
        name = aEntity.getName();
        maxHp = aEntity.getMaxHp();
        attack = Range.closed(aEntity.getMinAttack(), aEntity.getMaxAttack());
        defence = aEntity.getDefence();
        speed = aEntity.getSpeed();
        goldCost = aEntity.getGoldCost();
    }

    public String getName() {
        return name;
    }

    public int getGoldCost() {
        return goldCost;
    }
}
