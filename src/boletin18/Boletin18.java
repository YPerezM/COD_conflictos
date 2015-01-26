

package boletin18;

/**
 *Prueba Cod de conflictos
 * @author yperezmartinez
 */
public class Boletin18 {

    public static void main(String[] args) {
        int[] numeros= new int[6];
        
        for (int i = 0; i <= 5; i++) {
            numeros[i]=(int)(Math.random()*50);
            System.out.println(numeros[i]);
            
        }
        System.out.println("***Al reves***");
        for (int i = 5; i >=0; i--) {
            System.out.println(numeros[i]);
            
        }
        
    }

}
