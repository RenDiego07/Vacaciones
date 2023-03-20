/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.hilos;


/**
 * FXML Controller class
 *
 * @author diego
 */
import java.io.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import java.util.*;
import javafx.geometry.Insets;
import javafx.scene.control.Button;


public class HolaController implements Initializable {

    @FXML
    private ComboBox<Rutina> options;
    @FXML
    private VBox VBoxbuttons;
    @FXML
    private ImageView portada;
    private ArrayList<Rutina> rutinas;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rutinas = new ArrayList<>();
        rutinas.add(new Rutina("abdomen",Ejercicio.generarEjercicio()));
        // TODO
        options.getItems().addAll(rutinas);
    }    

    @FXML
    private void showRutine(ActionEvent event) {
        int indice = rutinas.indexOf(options.getValue());
        ArrayList<Ejercicio> lista = rutinas.get(indice).getEjercicios();
        
        for(Ejercicio ej: lista){
            
            Button b1 = new Button(ej.getRepeticiones()+" "+ej.getNombre().toString());
            VBox.setMargin(b1, new Insets(20));
            b1.setOnAction((w)->{
                Thread hilo = new Thread(()->{
                    
                    ArrayList<String> lEX = ej.getImagenes();
                    for(int x = 0; x<ej.getRepeticiones();++x){
                        for(String stream: lEX){
                        
                        try{
                            portada.setImage(new Image(new FileInputStream(Constantes.RUTAIMG+stream)));
                            Thread.sleep(500);
                        }catch(InterruptedException r ){
                            r.printStackTrace();
                        }catch(IOException f){
                            f.printStackTrace();
                        }
                    }
                }
                });hilo.start();
               
                
            });
           VBoxbuttons.getChildren().add(b1);
        }
        
        
        
    }
    public void fillComboBox(){
       
    }
    
    
    
}
