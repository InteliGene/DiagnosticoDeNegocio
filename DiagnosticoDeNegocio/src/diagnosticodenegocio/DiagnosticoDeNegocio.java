/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnosticodenegocio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.*;

/**
 *
 * @author InteliGeneMacbook1
 */
public class DiagnosticoDeNegocio extends Application {
    Stage window;
    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        
        Parent root = FXMLLoader.load(getClass().getResource("Pantalla1.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    public static double opc1;
    public static double opc2;
    public static double opc3;
    public static double opc4;
    public static double promediof;
    public static double PromedioMarketing;
    public static ArrayList<Double>  ListaMarketing = new ArrayList<Double>();
    public static ArrayList<Double>  ListaGeneral = new ArrayList<Double>();
    public static ArrayList<String>  nombres = new ArrayList<String>();
    public static void main(String[] args) {
        
        launch(args);
    }
    
}
