/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemapp;

/**
 *
 * @author MSI PC
 */
public class CinemApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cine cinepolis=new Cine(10);
        Pelicula p =new Pelicula("Narutico","Sala 1");
        cinepolis.insertar(p);
        System.out.println(cinepolis.getPeliculas()[0].getNombre());
        cinepolis.getPeliculas()[0].mostrar();
        cinepolis.getPeliculas()[0].getHorarios()[0].MostrarDisponibles();
        
        for(int e=0;e<7;e++){
        for (int i=0;i<99;i++){
        cinepolis.getPeliculas()[0].getHorarios()[e].ComprarSilla("El Papi chulo",i);
        }
        }
        
        cinepolis.getPeliculas()[0].getHorarios()[0].MostrarTodas();
        cinepolis.getPeliculas()[0].getHorarios()[0].MostrarDisponibles();
        
        
        
    }
    
}