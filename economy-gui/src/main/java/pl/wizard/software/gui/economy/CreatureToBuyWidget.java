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
        getChildren().add(slider);
    }


}
