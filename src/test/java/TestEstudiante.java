/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Corin V
 */
public class TestEstudiante {
    List<String> listaNombres;
    public TestEstudiante() {
        listaNombres=new ArrayList();
        testLlenarLista();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    public void testLlenarLista(){
        String nombre="Sara2";
        listaNombres.add(nombre);
        assertEquals(Character.isDigit(nombre.charAt(4)),true);
        assertEquals(nombre.length(),5);
        assertEquals(listaNombres.size(),1);
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
