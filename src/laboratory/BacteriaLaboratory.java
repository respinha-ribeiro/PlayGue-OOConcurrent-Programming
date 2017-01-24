package laboratory;

import common.Infection;
import common.Specification;
import entities.Bacteria;
import entities.BiologicalEntity;
import worldregion.Continent;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by rui on 1/24/17.
 */
public class BacteriaLaboratory extends Laboratory {

    public BacteriaLaboratory(Continent continent) {
        super(continent);
    }

    @Override
    public synchronized void develop(BiologicalEntity entity) {

        assert entity != null;
        assert entity.getProductionTime() > 0;

        Bacteria bacteria = (Bacteria) entity;

        assert bacteria.getInfection() != null;


        Infection infection = bacteria.getInfection();
        int infectionTime = bacteria.getProductionTime();
        int severity = infection.getSeverity() + ThreadLocalRandom.current().nextInt(infectionTime);
        infection.updateSeverity(severity);

        bacteria.setInfection(infection);
    }


    public synchronized void createBacteria(Specification specification) {

        assert specification != null;


    }

    public synchronized void evolveBacteria(Bacteria bacteria) {


    }

    public synchronized void spreadBacteria(Bacteria bacteria) {

    }
}
