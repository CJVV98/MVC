/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Estudiantes;
import Vista.ListarEstudiantes;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.DefaultListModel;

/**
 * Clase encargada de manejar la vista Listar Estudiante
 * @author Corin V
 */
public class ListaEstudiantes implements ActionListener, KeyListener{
    /**
     * listarEstudiantes vista
     * estudiante Clase encargada de la logica
     * modelo es el modelo para llenar el JList
     */
    private ListarEstudiantes listarEstudiantes;
    private Estudiantes estudiante;
    private DefaultListModel modelo;
    /**
     * Constructor de la clase ListaEstudiantes
     * @param listado vista 
     */
    public ListaEstudiantes(ListarEstudiantes listado) {
        modelo=new DefaultListModel();
        this.listarEstudiantes = listado;
        this.estudiante = new Estudiantes();
        listarEstudiantes.getB_registrar().addActionListener(this);
        listarEstudiantes.getTb_nombres().addKeyListener(this);
    }
    /**
     * Metodo que se ejecuta cuando el boton genera una accion se envia infromacion para almacenar a una lista
     * @param e evento
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Registrar")){
            String dato=estudiante.llenarLista(listarEstudiantes.getTb_nombres().getText());
            modelo=estudiante.imprimir();
            listarEstudiantes.getL_nombres().setModel(modelo);
            listarEstudiantes.getTb_nombres().setText(dato);
        }
    }
    /**
     * Metodo cuando presiona un boton, aqui valida si el caracter ingresado es correcto
     * @param e evento
     */
    @Override
    public void keyTyped(KeyEvent e) {  
        //Validar el tipo de letra
        if(!(Character.isAlphabetic(e.getKeyChar()) || Character.isISOControl(e.getKeyChar())) )
            e.consume();
        //Validar el tamaño
        if(listarEstudiantes.getTb_nombres().getText().length()==9)
            e.consume();
    }
     /**
     * Metodo cuando mantiene presionado el boton
     * @param e evento
     */
    @Override
    public void keyPressed(KeyEvent e) {}
    /**
     * Metodo para leer la tecla seleccionada
     * @param e 
     */
    @Override
    public void keyReleased(KeyEvent e) { }

    
    
}
