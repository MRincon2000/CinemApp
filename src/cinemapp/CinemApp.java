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
 CineLinked cinepolis=new CineLinked();      
   PeliculaLinked p= new PeliculaLinked("Narutin","Sala 1") ;
 cinepolis.insert(p);

try{
    System.out.println(cinepolis.BuscarPeli("Narut").getSala());
}catch(NullPointerException e){
    System.out.println("No se ecuentra la peli");
}
    System.out.println(cinepolis.BuscarPeli("Narutin").getSala());

  
    
    try{  
    
    cinepolis.BuscarPeli("Narutin").BuscarHorario(15).ComprarSilla("Ronalt el Killa", 9);
    cinepolis.BuscarPeli("Narutin").BuscarHorario(15).MostrarDisponibles();
    cinepolis.BuscarPeli("Narutin").BuscarHorario(15).MostrarTodas();
    
  }catch(NullPointerException l){
      System.out.println("No se ecuentra el horario");
  }
   
   
   
   
}
}
