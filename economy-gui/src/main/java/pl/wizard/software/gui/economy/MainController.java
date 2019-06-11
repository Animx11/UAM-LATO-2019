package pl.wizard.software.gui.economy;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import pl.wizard.software.economy.CreatureEcoDomainAbstractFactory;
import pl.wizard.software.economy.CreatureEcoDomainFacade;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainController {


    @FXML
    ComboBox<String> p1FractionCombo;
    @FXML
    VBox p1Creatures;
    @FXML
    ComboBox<String> p2FractionCombo;
    @FXML
    VBox p2Creatures;
    private CreatureEcoDomainFacade facade;

    @FXML
    public void initialize() {
        facade = new CreatureEcoDomainFacade();
        Set<String> fractionNames = facade.getFractionNames();
        initCombos(fractionNames);
    }

    private void initCombos(Set<String> aFractionNames) {
        Map<ComboBox<String>, VBox> playerMap = new HashMap<>();
        playerMap.put(p1FractionCombo,p1Creatures);
        playerMap.put(p2FractionCombo,p2Creatures);
        playerMap.keySet().forEach(combo -> {
            combo.setItems(FXCollections.observableArrayList(aFractionNames));
            combo.getSelectionModel().selectedItemProperty().
                    addListener((aObs, aOld, aNew) -> {
                        playerMap.get(combo).getChildren().clear();
                        CreatureEcoDomainAbstractFactory factory = facade.getCreatureFactory(aNew);
                        playerMap.get(combo).getChildren().add(new CreatureToBuyWidget(factory.createLevel1Creature()));
                        playerMap.get(combo).getChildren().add(new CreatureToBuyWidget(factory.createLeve12Creature()));
                        playerMap.get(combo).getChildren().add(new CreatureToBuyWidget(factory.createLeve15Creature()));
                        playerMap.get(combo).getChildren().add(new CreatureToBuyWidget(factory.createLeve13Creature()));
                        playerMap.get(combo).getChildren().add(new CreatureToBuyWidget(factory.createLeve14Creature()));
                    });
        });


    }
}
