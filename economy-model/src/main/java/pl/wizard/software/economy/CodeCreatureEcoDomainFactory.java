package pl.wizard.software.economy;

import com.google.common.collect.Range;

class CodeCreatureEcoDomainFactory extends CreatureEcoDomainAbstractFactory {
    @Override
    public CreatureEcoDomain createLevel1Creature() {
        return prepareCreature(1);
    }

    @Override
    public CreatureEcoDomain createLeve12Creature() {
        return prepareCreature(2);
    }

    @Override
    public CreatureEcoDomain createLeve13Creature() {
        return prepareCreature(3);
    }

    @Override
    public CreatureEcoDomain createLeve14Creature() {
        return prepareCreature(4);
    }

    @Override
    public CreatureEcoDomain createLeve15Creature() {
        return prepareCreature(5);
    }

    private CreatureEcoDomain prepareCreature(int aLevel){
        return new CreatureEcoDomain("Code_L"+aLevel,aLevel,Range.closed(aLevel,aLevel),aLevel,aLevel,aLevel);
    }
}
