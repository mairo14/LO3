/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author sonix
 */
public class Operaciones {

    public int sumarPar(int a, int b) {
        int resultado = a + b;
        if(resultado%2==0){
            return resultado;
        }else{
            return resultado+1;
        }
    }

    public int mayor(int a, int b) {
        if(a>b){
            return a;
        
        }if(b>a){
                return b;
        }if(a==b){
            return a;
        }else{
            return a;
        }
    }

   
    public int sumarVector(int [] numeros) {
        int sum=0;
        for (int i = 0; i < numeros.length; i++) {
            sum+=numeros[i];
        }
        return sum;
    }
    
}
