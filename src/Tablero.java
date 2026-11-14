import java.util.LinkedList;
import java.util.List;

public class Tablero {

    public void Region() {
        int[][] region = new int[3][3];
        List<Integer> l = new LinkedList<>();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                int numero = aleatorio();
                if (vacio()){
                    while (l.contains(numero)) {
                        numero = aleatorio();
                    }
                    region[i][j] = numero;
                    l.add(numero);
                }
            }
        }

        System.out.println(" ━━━━━━━━━━━━━━━");
        for (int i = 0; i < 3; i++){
            System.out.print("┃\t");
            for (int j = 0; j < 3; j++){
                System.out.print(region[i][j] + "\t");
            }
            System.out.println("┃");
        }
        System.out.println(" ━━━━━━━━━━━━━━━");
    }

    public int aleatorio() {
        int aleatorio;
        return aleatorio = (int) (Math.random() * 9) + 1;
    }

    public boolean vacio() {
        int ceroOUno = (int) (Math.random() * 2); // Genera 0 o 1
        boolean vacio;
        if (ceroOUno == 0) {
            return vacio = false;
        }
        return vacio = true;
    }

    public void llenarRegion(){

    }
}
