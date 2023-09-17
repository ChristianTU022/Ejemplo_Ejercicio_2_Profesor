/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.util.ArrayList;
import java.util.List;
import modelo.SesionDTO;

/**
 *
 * @author ESTUDIANTE
 */
public class ListaBD {
    
     public static List<SesionDTO> lista = new ArrayList<SesionDTO>();
     
     public static void cargarDatos(){
     
         SesionDTO d1 = new SesionDTO("algo@yahoo.com", 
                 "123456", "noe arcos", "7778596");
         SesionDTO d2 = new SesionDTO("mora@yahoo.com", 
                 "123456", "andres jose", "8596745");
         SesionDTO d3 = new SesionDTO("azucar@yahoo.com", 
                 "123456", "Diana diaz", "7875896");
         lista.add(d1);
         lista.add(d2);
         lista.add(d3);
     }
}
