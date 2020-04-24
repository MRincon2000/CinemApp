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
public class CineLinked {
     private PeliculaLinked head;

    public CineLinked() {
   this.head=null;
    }
public boolean insert(PeliculaLinked peli) {
boolean inserted;
PeliculaLinked ptr;
PeliculaLinked prev;
inserted = false;
ptr = head;
prev = null;
boolean repetido= false;
while(ptr!=null){
    if(ptr.getNombre()==peli.getNombre()){
        repetido=true;
        break;
    }   
    prev=ptr;
    ptr=ptr.getNext();
}
if(!repetido){

    inserted=true;
 if(prev!=null){
    prev.setNext(peli);
 }
 else if(prev==null){
     head.setNext(peli);
 }
}else{
    System.out.println("La pelicula ya se encuentra en el inventario");
}
return inserted;
}
public boolean delete(String nombre){
    boolean deleted=false;
    PeliculaLinked ptr=head;
    PeliculaLinked prev=null;
    boolean found=false;
while(ptr!=null){
   if(ptr.getNombre().equals(nombre)){
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
    System.out.println("La pelicula no se encuentra en el inventario");
}

return deleted;
}

public void printRecursive() {
System.out.print("List Recursive: ");
printR(head);
System.out.println();
}

private void printR(PeliculaLinked p) {
if(p != null) {
System.out.print(p.getNombre()+" ");
printR(p.getNext());
}
}
}