import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado = 0;
        int area = 0;
        Scanner llegir = new Scanner(System.in);

        lado = llegir.nextInt();

        area = lado * lado;

        System.out.println(area);
        
    }
}


