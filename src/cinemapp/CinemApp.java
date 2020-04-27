/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemapp;

import java.util.*;


/**
 *
 * @author MSI PC
 */
public class CinemApp {

    /**
     * @param args the command line arguments
     */
   public static Random aleatorio = new Random(System.currentTimeMillis());
    public static void main(String[] args) {
        // TODO code application logic here

    CineLinked cineco=new CineLinked();


    
 
     for(int i=0;i<10;i++){
     boolean logrado=false;
     PeliculaLinked P=new PeliculaLinked(NombrePelicula());
     logrado=cineco.insert(P);
     
     if(logrado){
     int hora=9;
    for(int p=0;p<7;p++){
        for(int m=0;m<100;m++){
        P.BuscarHorario(hora).ComprarSilla(NombrePersona(),m);
        }
        hora=hora+2;
    }
    }
    }
     cineco.print();
     /*for(int b=0;b<200;b++){
         cineco.delete(cineco.getHead().getNext().getNext().getNext().getNombre());
     }*/
     
     
     PeliculaLinked ptrP1=cineco.getHead();
     for(int w=0;w<5;w++){
     HorarioLinked ptrH1=ptrP1.getHead();
     while(ptrH1!=null){
         for(int y=0;y<100;y++){
            ptrH1.CancelarCompra(y); 
         }
         ptrH1=ptrH1.getNext();
     }
     ptrP1=ptrP1.getNext();
     }
     
    
     PeliculaLinked ptrP=cineco.getHead();
     int contadorP=0;
     while(ptrP!=null){
         System.out.print("Pelicula ");
         System.out.println(contadorP+1);
        HorarioLinked ptrH=ptrP.getHead();
        int contador1=0;
        while(ptrH!=null){
            System.out.print("Horario ");
            System.out.println(contador1+1);
            ptrH.MostrarTodas();
            ptrH=ptrH.getNext();
            contador1++;
        }
        ptrP=ptrP.getNext();
        contadorP++;    
     }
        
     
        
        
        
        
        /*   Cine cineco=new Cine(14286);
    
 int contador=0;
      
 for(int i=0;i<14286;i++){
     boolean logrado=false;
Pelicula P=new Pelicula(NombrePelicula());
System.out.println(P.getNombre());
logrado=cineco.insertar(P);
if(logrado){
    contador++;
for(int u=0;u<7;u++){
    for (int o=0;o<100;o++){
        cineco.getPeliculas()[contador-1].getHorarios()[u].ComprarSilla(NombrePersona(), o);
    }
}
 }
 }
      
cineco.output();
   
for(int h=0;h<5000;h++){
   for(int s=0;s<7;s++){
    for (int d=0;d<100;d++){
        cineco.getPeliculas()[h].getHorarios()[s].CancelarCompra(d); 
}     
   }
}
  
int numeroP=1;

for(int i=0;i<cineco.getCount();i++){
    System.out.print("Pelicula ");
    System.out.println(numeroP);
    numeroP++;
for(int u=0;u<7;u++){
    System.out.print("Sala ");
    System.out.println(u+1);
  cineco.getPeliculas()[i].getHorarios()[u].MostrarTodas();
}
}      
    
 cineco.output();*/
    
    
    
    
    
    
    }
    
   public static String NombrePersona(){
String[] Nombre={"Miguel","Nicolas","Rodrigo","Angel","Deolan","Julian","Andres","Juan","Jose","Luis","Maria","Guadalupe","Francisco","Juana","Antonio","Jesus","Pedro","Alejandro","Manuel","Margarita","Carlos","Roberto","Fernando","Daniel","Jorge","Ricardo","Eduardo","Javier","Rafael","Martin","Raul","David","Marco","Arturo","Veronica"};
//35
String[] Apellido={"Gonzales","Rodriguez","Gomez","Fernandez","Lopez","Diaz","Martines","Perez","Garcia","Sanchez","Romero","Torres","Alvarez","Ruiz","Ramirez","Florez","Benitez","Acosta","Medina","Herrera","Suarez","Aguirre","Jimenez","Gutierrez","Pereira","Rojas","Molina","Castro","Ortiz","Silva","Nunez","Cabrera","Morales","Moreno","Vera"};   
 


int intaleatorio = aleatorio.nextInt(Nombre.length);
int intaleatorio1 = aleatorio.nextInt(Nombre.length);


String resultado=Nombre[intaleatorio]+" "+Apellido[intaleatorio1];


aleatorio.setSeed(aleatorio.nextLong());


 return   resultado; 
}
 
 

public static String NombrePelicula(){
     
     
     String[] Sustantivos = {"Amor","Lobo","Camino","Edificio","Elevador","Paso","Hombre","Barco","Piano","Policia","Soldado","Tigre","Leon","Coyote","Carro","Tren","Avion","Ingeniero","Doctor","Presidente","Violin","Sacerdote","Globo","Payaso","Saxofon","Nino","Motociclista","Espectro","Angel","Fotografo","Pintor","Orfanato","Abogado","Capitan","Zapato"};
     
     String[] Adjetivos ={"Nocturno","Esquizofrenico","Rojo","Embrujado","Millonario","Mentiroso","Asustadizo","Enamorado","Corrupto","Paraco","Mamerto","Guerrillo","Veneco","Valiente","Magico","Barato","Invisible","Genio","Malvado","Azul","Negro","Asesino","Bonito","Feo","Futbolista","Borracho","Estafador","Apostador","Sonador","Triste","Feliz","Decapitado"};
 
 int intaleatorio = aleatorio.nextInt(Sustantivos.length);
int intaleatorio1 = aleatorio.nextInt(Adjetivos.length);


String resultado="El " + Sustantivos[intaleatorio]+" "+Adjetivos[intaleatorio1];


aleatorio.setSeed(aleatorio.nextLong());


 return   resultado; 
 
 
 
}
    
    
    
    
}
