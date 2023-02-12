package com.example.dbformula1fx;

import business_logic.BlFacade;
import business_logic.BlFacadeImpl;
import domain.Pilot;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class F1Controller {

    BlFacade bl = new BlFacadeImpl();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> natBox;

    @FXML
    private ListView<Pilot> pilotView;

    @FXML
    private Label numLabel;

    public void setUpInputComponents() {

        String[] nats = {"All", "Australian", "British", "Canadian", "Dutch", "Finnish", "French",
                "German", "Italian", "Monegasque", "Mexican", "Spanish"};

        natBox.getItems().addAll(nats);

        pilotView.getItems().clear();
        pilotView.getItems().addAll(bl.getAllPilots());

        numLabel.setText("Total number of pilots in the DB: " + bl.getAllPilots().size());

        //bl.storePilot("Lewis Hamilton", "British", 380);
        //bl.storePilot("Valtteri Bottas", "Finnish", 280);
        //bl.storePilot("Max Verstappen", "Dutch", 250);
        //bl.storePilot("Charles Leclerc", "Monegasque", 200);
        //bl.storePilot("Lando Norris", "British", 100);
        //bl.storePilot("Carlos Sainz", "Spanish", 100);
        //bl.storePilot("Pierre Gasly", "French", 50);
        //bl.storePilot("Fernando Alonso", "Spanish", 400);
        //bl.storePilot("Sebastian Vettel", "German", 300);
        //bl.storePilot("Daniel Ricciardo", "Australian", 200);
        //bl.storePilot("Esteban Ocon", "French", 100);
        //bl.storePilot("Sergio Perez", "Mexican", 100);
        //bl.storePilot("Lance Stroll", "Canadian", 50);
        //bl.storePilot("Kimi Raikkonen", "Finnish", 400);
        //bl.storePilot("Antonio Giovinazzi", "Italian", 50);
    }

    @FXML
    void selectedNat(ActionEvent event) {
        String nat = natBox.getValue();
        if (nat == "All") {
            pilotView.getItems().clear();
            pilotView.getItems().addAll(bl.getAllPilots());
        } else {
            pilotView.getItems().clear();
            pilotView.getItems().addAll(bl.getPilotsByNationality(nat));
        }
    }

    public void setBusinessLogic(BlFacadeImpl g) { bl = g; }

    @FXML
    void initialize() {
        assert natBox != null : "fx:id=\"natBox\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert pilotView != null : "fx:id=\"pilotView\" was not injected: check your FXML file 'hello-view.fxml'.";

        setUpInputComponents();
        setBusinessLogic(new BlFacadeImpl());
    }
}