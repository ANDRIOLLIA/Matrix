import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы: ");
        int size = new Scanner(System.in).nextInt();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++)
                System.out.print("X\t");
            System.out.println("\n");
        }
    }
}
