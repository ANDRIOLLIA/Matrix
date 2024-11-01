import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы: ");
        int size = new Scanner(System.in).nextInt();
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if(i ==j || i + j == size-1)
                    System.out.print("X   ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
