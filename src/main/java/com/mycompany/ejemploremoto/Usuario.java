/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemploremoto;

import java.util.ArrayList;
import static java.util.Collections.unmodifiableList;
import java.util.List;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author formacion
 */
class Usuario {

    private static final Logger LOG = getLogger(Usuario.class.getName());
    List<Pelicula> peliculas = new ArrayList<>();
    
    List<Pelicula> listaPeliculas() {
        return unmodifiableList(peliculas);
    }    
}
