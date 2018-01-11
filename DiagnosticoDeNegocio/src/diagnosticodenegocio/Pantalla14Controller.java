/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnosticodenegocio;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author InteliGeneMacbook1
 */
public class Pantalla14Controller implements Initializable {

    @FXML
    private Button siguiente14;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void siguiente14(ActionEvent event) {
        try {
        System.out.println("You clicked me!");
        Stage stage2 = new Stage() ;

		
			VBox mainPane2;


        
            mainPane2 = (VBox) FXMLLoader.load( getClass().getResource("/diagnosticodenegocio/Pantalla15.fxml" ) );
        
		

			//stage2.setTitle("MaGiEi 1.1 powered by InteliGene");
		
			//stage2.setMaximized(false);    
			//stage2.setResizable(false);/

			Scene scene2 = new Scene(mainPane2);
			stage2.setScene(scene2);

		

			stage2.show(); 
			((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                        } catch (IOException ex) {
            Logger.getLogger(Pantalla14Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
