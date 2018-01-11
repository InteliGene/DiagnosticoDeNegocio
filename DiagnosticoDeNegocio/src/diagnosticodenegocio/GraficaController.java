/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnosticodenegocio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author InteliGeneMacbook1
 */
public class GraficaController implements Initializable {

    
    @FXML
	private StackedBarChart<String, Number> grafica3;
    @FXML
    private Label promedio;
    @FXML
    private PieChart GraficaPie;
    private ObservableList data;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        data = FXCollections.observableArrayList();
        double sum=0, redondeado=0, PromedioMarketing=0; 
        int resultado=0;
        
        grafica3.getYAxis().setTickLabelRotation(270);
        grafica3.getXAxis().setTickLabelRotation(270);
         XYChart.Series series1 = new XYChart.Series();
         XYChart.Series series2 = new XYChart.Series();
         XYChart.Series series3 = new XYChart.Series();
         XYChart.Series series4 = new XYChart.Series();
         XYChart.Series series5 = new XYChart.Series();
         
         
         
        DiagnosticoDeNegocio.ListaMarketing.add(DiagnosticoDeNegocio.opc1);
        DiagnosticoDeNegocio.ListaMarketing.add(DiagnosticoDeNegocio.opc2);
        
        for(int i=0; i<DiagnosticoDeNegocio.ListaMarketing.size(); i++){
          
             DiagnosticoDeNegocio.PromedioMarketing+= (DiagnosticoDeNegocio.ListaMarketing.get(i)/DiagnosticoDeNegocio.ListaMarketing.size());
        }
        System.out.println(DiagnosticoDeNegocio.PromedioMarketing);
       
        
//                  DiagnosticoDeNegocio.PromedioMarketing+=(DiagnosticoDeNegocio.ListaMarketing.get(i)/DiagnosticoDeNegocio.ListaMarketing.size());

//        DiagnosticoDeNegocio.ListaGeneral.add(DiagnosticoDeNegocio.opc1);
//        DiagnosticoDeNegocio.ListaGeneral.add(DiagnosticoDeNegocio.opc2);
        DiagnosticoDeNegocio.ListaGeneral.add(DiagnosticoDeNegocio.PromedioMarketing);
        DiagnosticoDeNegocio.ListaGeneral.add(DiagnosticoDeNegocio.opc3);
        DiagnosticoDeNegocio.ListaGeneral.add(DiagnosticoDeNegocio.opc4);
        
        DiagnosticoDeNegocio.nombres.add("Marketing");
        DiagnosticoDeNegocio.nombres.add("Sistemas");
        DiagnosticoDeNegocio.nombres.add("Procesos");
        DiagnosticoDeNegocio.nombres.add("Imagen");
        DiagnosticoDeNegocio.nombres.add("Legal");
        
        
         System.out.println(DiagnosticoDeNegocio.ListaGeneral);
        
        

       for(int i=0 ; i<DiagnosticoDeNegocio.ListaGeneral.size(); i++){
        
           if(DiagnosticoDeNegocio.ListaGeneral.get(i)<25){
        series1.getData().add(new XYChart.Data(DiagnosticoDeNegocio.nombres.get(i),DiagnosticoDeNegocio.ListaGeneral.get(i)));

           }
           else
               if(DiagnosticoDeNegocio.ListaGeneral.get(i)>25 && DiagnosticoDeNegocio.ListaGeneral.get(i)<50){
                   series2.getData().add(new XYChart.Data(DiagnosticoDeNegocio.nombres.get(i),DiagnosticoDeNegocio.ListaGeneral.get(i)));
               }
           else
                   if(DiagnosticoDeNegocio.ListaGeneral.get(i)>=50 && DiagnosticoDeNegocio.ListaGeneral.get(i)<75){
                       series3.getData().add(new XYChart.Data(DiagnosticoDeNegocio.nombres.get(i),DiagnosticoDeNegocio.ListaGeneral.get(i)));
                   }
           else
                       if(DiagnosticoDeNegocio.ListaGeneral.get(i)>=75 && DiagnosticoDeNegocio.ListaGeneral.get(i)<95){
                            series4.getData().add(new XYChart.Data(DiagnosticoDeNegocio.nombres.get(i),DiagnosticoDeNegocio.ListaGeneral.get(i)));

                       }
           else
                           if(DiagnosticoDeNegocio.ListaGeneral.get(i)==100){
                                    series5.getData().add(new XYChart.Data(DiagnosticoDeNegocio.nombres.get(i),DiagnosticoDeNegocio.ListaGeneral.get(i)));

                           }
           
           
           
           sum+= (DiagnosticoDeNegocio.ListaGeneral.get(i)/DiagnosticoDeNegocio.ListaGeneral.size());
           
           resultado = (int) sum;



       
       }
      
        promedio.setText(Integer.toString(resultado)+"%");
        grafica3.getData().addAll(series1, series2, series3, series4, series5);
        
        
        data.add(new PieChart.Data(" ", sum));
        data.add(new PieChart.Data(" ", 100-sum));
        
        GraficaPie.setData(data);
        
        
        
        
        
        
        
//       series1.getData().add(new XYChart.Data("Pregunta 1",DiagnosticoDeNegocio.opc1));
//       series1.getData().add(new XYChart.Data("Pregunta 2",DiagnosticoDeNegocio.opc2));
//       series1.getData().add(new XYChart.Data("Pregunta 3",DiagnosticoDeNegocio.opc3));
//       series1.getData().add(new XYChart.Data("Pregunta 4",DiagnosticoDeNegocio.opc4));
//       series1.getData().add(new XYChart.Data("Alan2",80));
//       series1.getData().add(new XYChart.Data("prueba",60));
       
       
        
//       double prom;
//       prom= DiagnosticoDeNegocio.promediof;
       
//       prom= Math.round(DiagnosticoDeNegocio.promediof);
//      DiagnosticoDeNegocio.promediof= (DiagnosticoDeNegocio.opc1+DiagnosticoDeNegocio.opc2+DiagnosticoDeNegocio.opc3+DiagnosticoDeNegocio.opc4)/4;
//      promedio.setText(Double.toString(DiagnosticoDeNegocio.promediof)+"%");
      



      
    }    
   
    
}
