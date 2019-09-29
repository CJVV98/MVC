/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 * Clase encargada del llenado de la lista
 * @author Corin V
 */
public class Estudiantes {
    /**
     * listadoNombres, almacena la lista de los nombres
     * modelo, modelo para llenar la lista
     */
    private List<String> listadoNombres;
    private DefaultListModel modelo;
    /**
     * Constructor de la clase Estudiantes
     */
    public Estudiantes() {
        modelo=new DefaultListModel();
        listadoNombres=new ArrayList();
       
    }
    /**
     * Metodo encargado de llenar la lista de nombres, valida si la informacion es correcta
     * @param nombre de la persona
     * @return el nombre ingresado
     */
    public String llenarLista(String nombre){
        boolean auxiliar=true;
        for(int i=0; i<nombre.length(); i++){
            if(Character.isDigit(nombre.charAt(i))){
                auxiliar=false;
                break;
            }
        }
        if(auxiliar && nombre.length()>0){
            listadoNombres.add(nombre);
            return "";
        }else
            return nombre;   
        
    }
    /**
     * Añade la lista a un modelo
     * @return el modelo
     */
    public DefaultListModel imprimir(){  
        modelo.removeAllElements();
        for (String nombre : listadoNombres) {
            modelo.addElement(nombre);
        }
        return modelo;
    }
    /**
     * Obtiene el listado de nombres
     * @return lista de nombres
     */
    public List<String> getListadoNombres() {
        return listadoNombres;
    }
    /**
     * Asigna el valor de la lista
     * @param listadoNombres lista de nombres
     */
    public void setListadoNombres(List<String> listadoNombres) {
        this.listadoNombres = listadoNombres;
    }
    
}
