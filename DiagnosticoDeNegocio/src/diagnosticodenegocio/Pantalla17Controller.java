/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnosticodenegocio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author InteliGeneMacbook1
 */
public class Pantalla17Controller implements Initializable {
        
    @FXML
    private StackedBarChart<String, Number> prueba;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//        final NumberAxis yAxis = new NumberAxis();
//        final CategoryAxis xAxis = new CategoryAxis();
//        
////        xAxis.setTickLabelRotation(90);
//     
      prueba.getYAxis().setTickLabelRotation(270);
       prueba.getXAxis().setTickLabelRotation(270);
        
        
       XYChart.Series series1 = new XYChart.Series();
       series1.getData().add(new XYChart.Data("Ejemplo",50));
       series1.getData().add(new XYChart.Data("Ejemplo2",80));
       series1.getData().add(new XYChart.Data("Ejemplo3",60));
       
       prueba.getData().addAll(series1);
       
       
//stage.setTitle("Bar Chart Sample");
//        final NumberAxis xAxis = new NumberAxis();
//        final CategoryAxis yAxis = new CategoryAxis();
//        final BarChart<Number,String> bc = 
//            new BarChart<Number,String>(xAxis,yAxis);
//        bc.setTitle("Country Summary");
//        xAxis.setLabel("Value");  
//        xAxis.setTickLabelRotation(90);
//        yAxis.setLabel("Country");
//
//       Scene scene  = new Scene(bc,800,600);
//        bc.getData().addAll(series1, series2, series3);
//        stage.setScene(scene);
//        stage.show();
    }    
    
}
