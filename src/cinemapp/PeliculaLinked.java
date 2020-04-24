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
public class PeliculaLinked {

private PeliculaLinked next;
private double duracion;
    private String nombre;
    private String genero;
    private String sala;
    private HorarioLinked head;


    public PeliculaLinked(String nombre, String sala) {
        this.nombre = nombre;
        this.sala = sala;
        this.next=null;
        for(int i=0;i<7;i++){
           
        }
    }
    
    
    
    
    
    
 public boolean insert(HorarioLinked hora) {
boolean inserted;
HorarioLinked ptr;
HorarioLinked prev;
inserted = false;
ptr = head;
prev = null;

while(ptr!=null){
    prev=ptr;
    ptr=ptr.getNext();
}
 if(prev!=null){
    prev.setNext(hora);
    inserted=true;
 }
 else if(prev==null){
     head.setNext(hora);
     inserted=true;
 }

return inserted;
}
public boolean delete(int hora){
    boolean deleted=false;
    HorarioLinked ptr=head;
    HorarioLinked prev=null;
    boolean found=false;
while(ptr!=null){
   if(ptr.getHorario()==hora){
       found=true;
       break;
   } 
    prev=ptr;
    ptr=ptr.getNext();
}
if(found){
   deleted=true;
    if(prev!=null){
        prev.setNext(ptr.getNext());
    }
    else if(prev==null){
        head=ptr.getNext();
    }
}else{
    System.out.println("No se encuentra el horario");
}

return deleted;
}
    
    
    
    
    
    
    
    public PeliculaLinked getNext() {
        return next;
    }

    public void setNext(PeliculaLinked next) {
        this.next = next;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    
    
    
   


    }



