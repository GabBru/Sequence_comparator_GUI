package com.mycompany.sequence_comparator2;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class FXMLController implements Initializable {
    
         protected static final Logger LOGGER = Logger.getLogger(FXMLController.class.getName());

    @FXML
    private Label label;
    
    @FXML
    protected TextField seq_nom_plante;
     
    @FXML
    protected TextArea seq;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    void launchBlast(MouseEvent event) throws InterruptedException {
        Blast blast = new Blast();
        LOGGER.info("ras le cul");
        blast.search(getSeq_nom_plante(),getSeq());
    }

    public String getSeq_nom_plante() {
        return seq_nom_plante.getText();
    }

        public String getSeq() {
        return seq.getText();
    }
    
}