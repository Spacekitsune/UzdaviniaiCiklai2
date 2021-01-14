package UzdaviniaiCiklai2;
//4.	SKAIČIŲ SEKA
//Parašykite programą, kuri atspausdintų tik tiek skaičių, pradedant nuo 1, iki Jūsų įvesto.
//-----------------------------------------------------------
//Įvesta: 7
//Gauta: 1 2 3 4 5 6 7
import java.util.Scanner;
public class CiklaiUzd017 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a,b;

        System.out.print("Iveskite skaiciu a: ");
        a = reader.nextInt();

        for (b = 1; b <=a; b++) {
            System.out.print(b + " ");
        }

        reader.close();
    }
}
