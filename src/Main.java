import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                int[][] matriz = new int[10][10];

                // Inicializar matriz a 1
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        matriz[i][j] = 1;
                    }
                }

                // 2. Establecer las posiciones en 8
                matriz[0][4] = 8;
                matriz[2][6] = 8;
                matriz[3][1] = 8;
                matriz[8][6] = 8;



                for (int i = 0; i < 10; i++) {
                    System.out.print("|");
                    for (int j = 0; j < 10; j++) {
                        System.out.print(" " + matriz[i][j] + " |");
                    }
                    System.out.println();

                }
            }



            }
