package pl.wizard.software.economy;

import entities.CreatureEntity;

import javax.persistence.*;

class DataBaseCreatureEcoDomainFactory extends CreatureEcoDomainAbstractFactory {
    @Override
    public CreatureEcoDomain createLevel1Creature() {
        return createCreature(1);
    }

    @Override
    public CreatureEcoDomain createLeve12Creature() {
        return createCreature(2);
    }

    @Override
    public CreatureEcoDomain createLeve13Creature() {
        return createCreature(3);
    }

    @Override
    public CreatureEcoDomain createLeve14Creature() {
        return createCreature(4);
    }

    @Override
    public CreatureEcoDomain createLeve15Creature() {
        return createCreature(5);
    }

    private CreatureEcoDomain createCreature(int aLevel) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("heroes-demo");
        EntityManager em = emf.createEntityManager();
        TypedQuery<CreatureEntity> query = em.createQuery("select c from FractionEntity f join fetch CreatureEntity c where f.name = 'F1' AND c.level=:lvl", CreatureEntity.class);
        query.setParameter("lvl",aLevel);
        CreatureEntity ent = query.getSingleResult();
        em.close();
        emf.close();
        return new CreatureEcoDomain(ent);
    }
}
