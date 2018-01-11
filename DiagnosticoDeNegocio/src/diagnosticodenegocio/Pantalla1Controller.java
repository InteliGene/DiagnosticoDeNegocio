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
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author InteliGeneMacbook1
 */
public class Pantalla1Controller implements Initializable {
    
    @FXML
    private Label label;
     @FXML
    private Button prueba ;
     @FXML
     private RadioButton rb1;
     @FXML
     private RadioButton rb2;
     @FXML
     private RadioButton rb3;
     @FXML
     private RadioButton rb4;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
        System.out.println("You clicked me!");
        label.setText("prueba");
        Stage stage = new Stage() ;

		
			VBox mainPane;


        
            mainPane = (VBox) FXMLLoader.load( getClass().getResource("/diagnosticodenegocio/Pantalla2.fxml" ) );
        
		

			//stage2.setTitle("MaGiEi 1.1 powered by InteliGene");
		
			//stage2.setMaximized(false);    
			//stage2.setResizable(false);/

			Scene scene = new Scene(mainPane);
			stage.setScene(scene);

		

			stage.show(); 
			((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                        } catch (IOException ex) {
            Logger.getLogger(Pantalla1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    


    
    
    
    
    
    @FXML
    public void Numeros(ActionEvent event){
        
        if(rb1.isSelected()){
           DiagnosticoDeNegocio.opc1=100;
        }
        if(rb2.isSelected()){
         DiagnosticoDeNegocio.opc1=66.66666;
        }
        if(rb3.isSelected()){
          DiagnosticoDeNegocio.opc1=33.33333;
        }
        if(rb4.isSelected()){
          DiagnosticoDeNegocio.opc1=0;
        }
        
     
    }
    
    
//    ToggleGroup group = new ToggleGroup();
//    RadioButton button1 = new RadioButton("select first");
//    button1.setToggleGroup(group);
//    button1.setSelected(true);
//    RadioButton button2 = new RadioButton("select second");
//    button2.setToggleGroup(group);
    
    
//ToggleGroup group = new ToggleGroup();
//
//RadioButton rb1 = new RadioButton("RadioButton1");
//rb1.setUserData("RadioButton1");
//rb1.setToggleGroup(group);
//rb1.setSelected(true);
//
//RadioButton rb2 = new RadioButton("RadioButton2");
//rb2.setUserData("RadioButton2");
//rb2.setToggleGroup(group);
//
//RadioButton rb3 = new RadioButton("RadioButton3");
//rb3.setUserData("RadioButton3");
//rb3.setToggleGroup(group);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    


}