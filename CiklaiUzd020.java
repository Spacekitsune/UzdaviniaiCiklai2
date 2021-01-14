package UzdaviniaiCiklai2;
//7.	DAUGYBOS LENTELĖ
//Parašykite programą, kuri atspausdintų įvesto skaičiaus daugybos lentelę nuo 1 iki 9.
//-----------------------------------------------------------
//Įvesta: 2
//Gauta:
//2 * 1 = 2
//2 * 2 = 4
//...
//2 * 9 = 18
import java.util.Scanner;
public class CiklaiUzd020 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Iveskite skaiciu: ");
        int a = reader.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }

        reader.close();
    }
}

