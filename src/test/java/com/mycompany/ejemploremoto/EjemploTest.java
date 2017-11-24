
package com.mycompany.ejemploremoto;

import java.util.List;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author formacion
 */
public class EjemploTest {
    
    private static final Logger LOG = getLogger(EjemploTest.class.getName());
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     *
     */
    public EjemploTest() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

/*
    Como un usuario, quiero poder añadir una película
	a mi lista de películas
*/

    /**
     *
     */

     @Test
     public void annadirPeliculaTest() {
         Usuario u = new Usuario();
         Pelicula p = new Pelicula();
         List<Pelicula> l = u.listaPeliculas();
         l.add(p);
     }
}
