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
public class Cine {
    private int N;
    private int posicion;
    private int count;
    private Pelicula[] peliculas;

    public Cine(int N) {
        this.N = N;
        this.peliculas= new Pelicula[N];
    }
    public boolean empty(){
        return count<=0;
    }
    public boolean full(){
        return count>=this.N;
    }
    public boolean eliminar(String nombre){
        boolean deleted= false;
        if(!empty()){
            if (search(nombre)){
                for(int u=posicion;u<count-1;u++){
                    peliculas[u]=peliculas[u+1];
                }
                    count--;
                    deleted=true;
                
            }
        }
        else System.out.println("Inventario de peliculas vacio");
        return deleted;
    }
public boolean insertar(Pelicula peli){
    boolean inserted=false;
    if(!full()){
        if(!search(peli.getNombre())){
            for(int e=count;e>posicion;e--){
                peliculas[e]=peliculas[e-1];
            }
            peliculas[posicion]=peli;
            count++;
            inserted=true;
        }
        else{
            System.out.println("Pelicula repetida");
        }
    }
    else System.out.println("Inventario de peliculas lleno");
    return inserted;
}
private boolean search(String nombre){
    boolean found=false;
    boolean stop=false;
    posicion=0;
    while(posicion<count && !stop){
        
            if(peliculas[posicion].getNombre()==nombre){
                found=true;
            }
        else{
        posicion++;
    }
    }
    return found;
}
public void output(){
    System.out.print("Lista: ");
    int g=0;
    while(g!=count){
        System.out.print(peliculas[g]);
        System.out.print(" ");
        g++;
    }
    System.out.println();
    
}

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

}

