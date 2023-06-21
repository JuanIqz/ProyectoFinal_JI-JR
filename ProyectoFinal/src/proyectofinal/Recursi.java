/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author User
 */
public class Recursi {
        int contD;
    int entero;
   
   public void def(){
       this.contD=0;
   } 

    public Recursi(int entero) {
        this.entero = entero;
    }
    
      public int recursivo1(){//inicio metodos recursivos
    if (contD<entero) {
        contD++;
        return contD+recursivo1();
    }
        return 1 ;
    }
      
    public int recursivo2(){
    if (contD<entero) {
        contD++;
        return contD+recursivo2();
    }
        return 2 ;
    }
    
    public int recursivo3(){
    if (contD<entero) {
        contD++;
        return contD+recursivo3();
    }
        return 3 ;
    }//fin metodos recursivos
}
