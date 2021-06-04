package org.example;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.sourceLab6.MainThread;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField aX;

    @FXML
    private TextField aY;

    @FXML
    private TextField aZ;

    @FXML
    private TextField bX;

    @FXML
    private TextField bY;

    @FXML
    private TextField bZ;

    @FXML
    private TextField cX;

    @FXML
    private TextField cY;

    @FXML
    private TextField cZ;

    @FXML
    void buttonCalculate(ActionEvent event) throws InterruptedException {
        Util u;
        if(checkingEnteredValues()) {
            ArrayList<Integer> vectorA = new ArrayList<Integer>();
            ArrayList<Integer> vectorB = new ArrayList<Integer>();
            ArrayList<Integer> vectorC;
            vectorA.add(Integer.parseInt(aX.getText()));
            vectorA.add(Integer.parseInt(aY.getText()));
            vectorA.add(Integer.parseInt(aZ.getText()));

            vectorB.add(Integer.parseInt(bX.getText()));
            vectorB.add(Integer.parseInt(bY.getText()));
            vectorB.add(Integer.parseInt(bZ.getText()));
            MainThread thread = new MainThread();
            vectorC = thread.arraySum(vectorA, vectorB);
            cX.setText(Integer.toString(vectorC.get(0)));
            cY.setText(Integer.toString(vectorC.get(1)));
            cZ.setText(Integer.toString(vectorC.get(2)));
        }
        else {
            Util.messageBox("Ошибка", "Заполните вектрора числами!");
        }
    }

    @FXML
    void initialize() { }

    boolean checkingEnteredValues (){

        try {
            Integer.parseInt(aX.getText());
            Integer.parseInt(aY.getText());
            Integer.parseInt(aZ.getText());
            Integer.parseInt(bX.getText());
            Integer.parseInt(bY.getText());
            Integer.parseInt(bZ.getText());
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
}