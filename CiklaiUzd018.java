package UzdaviniaiCiklai2;
//5.	INTERVALAS
//Parašykite programą, kuri atspausdintų skaičius iš jūsų nurodyto intervalo [a, b].
//-----------------------------------------------------------
//Įvesta: 5 ir 10
//Gauta: 5 6 7 8 9 10

import java.util.Scanner;
public class CiklaiUzd018 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a,b;

        System.out.print("Iveskite intervalo pradžią: ");
        a = reader.nextInt();
        System.out.print("Iveskite intervalo pabaigą: ");
        b = reader.nextInt();

        for (int i = a;i<=b; i++) {
            System.out.print(i+" ");
        }

        reader.close();
    }
}
