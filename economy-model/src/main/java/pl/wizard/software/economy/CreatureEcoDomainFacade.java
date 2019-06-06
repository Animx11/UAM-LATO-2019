package pl.wizard.software.economy;

import java.util.HashSet;
import java.util.Set;

public class CreatureEcoDomainFacade {

    public static final String CODE = "code";
    public static final String DATABASE = "database";

    public CreatureEcoDomainFacade(){

    }

    public CreatureEcoDomainAbstractFactory getCreatureFactory(String aFractionName){
        if(aFractionName.equals(CODE)){
            return new CodeCreatureEcoDomainFactory();
        }else if(aFractionName.equals(DATABASE)){
            return new DataBaseCreatureEcoDomainFactory();
        }
        throw new IllegalArgumentException("You used not supported fraction!");
    }

    public Set<String> getFractionNames(){
        Set ret = new HashSet<String>();
        ret.add(CODE);
        ret.add(DATABASE);
        return ret;
    }
}
