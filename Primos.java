public class Primos {

  public static void main (String args[]){
  
    numerosPrimosEjemploWeb();
    
  }
  
  private static void numerosPrimosEjemploWeb() {
        //int[] numeros = {11, 19, 20, 50, 61, 100};
        int numeros = 100;
        int suma = 0;
        for (int i = 0; i < numeros; i++) {
            if (esPrimo(i)) {
                System.out.println("El número " + i + " es primo");
                numeros--;
                suma = suma + i;
            } else {
                System.out.println("El número " + i + " no es primo");
            }
        }
        System.out.println("suma = " + suma);
    }


    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        int contador = 0;
        //bucle que cuenta los numeros divisibles
        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador < 1;
    }

}
