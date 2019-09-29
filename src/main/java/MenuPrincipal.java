
import Controlador.ListaEstudiantes;
import Vista.ListarEstudiantes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase principal del programa 
 * @author Corin V
 */
public class MenuPrincipal {

    /**
     * @param args the command line arguments
     */
    /**
     * En esta clase se instancia la vista y el controler
     */
    public MenuPrincipal(){
        ListarEstudiantes vista=new ListarEstudiantes();
        ListaEstudiantes controler=new ListaEstudiantes(vista);
    }
    /**
     * MEnu Principal del programa
     * @param args 
     */
     public static void main(String args[]) {
         MenuPrincipal menu=new MenuPrincipal();
    }
    
}
