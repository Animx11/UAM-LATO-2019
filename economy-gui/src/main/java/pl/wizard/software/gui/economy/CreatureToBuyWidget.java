package pl.wizard.software.gui.economy;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import pl.wizard.software.economy.CreatureEcoDomain;

class CreatureToBuyWidget extends HBox {

    private final CreatureEcoDomain creature;

    CreatureToBuyWidget(CreatureEcoDomain aCreature){
        creature = aCreature;
        getChildren().add(new Label(creature.getName()));
        Slider slider = new Slider();
        slider.setMax(10);
        slider.setMin(0);
        slider.setBlockIncrement(1);
        slider.setMajorTickUnit(1);
        slider.setMinorTickCount(0);
        slider.setShowTickLabels(true);
        slider.setSnapToTicks(true);
        getChildren().add(slider);
        Label creatureCount = new Label("0");
        getChildren().add(new Label("Creature count: "));
        getChildren().add(creatureCount);
        Label goldCost = new Label("0");
        getChildren().add(new Label(" Creature cost: "));
        getChildren().add(goldCost);
        slider.valueProperty().addListener((aObs, aOld, aNew) ->{
            creatureCount.setText(String.valueOf(aNew.intValue()));
            goldCost.setText(String.valueOf(aNew.intValue() * creature.getGoldCost()));
        });
    }


}
