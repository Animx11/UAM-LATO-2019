import org.junit.jupiter.api.Test;
import pl.wizard.software.economy.CreatureEcoDomain;
import pl.wizard.software.economy.CreatureEcoDomainAbstractFactory;
import pl.wizard.software.economy.CreatureEcoDomainFacade;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FastTest {

    @Test
    void fastTest(){
        CreatureEcoDomainFacade facade = new CreatureEcoDomainFacade();
        CreatureEcoDomainAbstractFactory factory = facade.getCreatureFactory(CreatureEcoDomainFacade.CODE);

        CreatureEcoDomain c = factory.createLevel1Creature();

        assertEquals("Code_L1", c.getName());
    }

    @Test
    void fastDatabaseTest(){
        CreatureEcoDomainFacade facade = new CreatureEcoDomainFacade();
        CreatureEcoDomainAbstractFactory factory = facade.getCreatureFactory(CreatureEcoDomainFacade.DATABASE);

        CreatureEcoDomain c = factory.createLevel1Creature();

        assertEquals("Level1", c.getName());
    }

}
