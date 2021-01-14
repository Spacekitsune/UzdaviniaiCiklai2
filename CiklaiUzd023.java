package UzdaviniaiCiklai2;
//10.	Eglutės | Sumos skaičiavimo algoritmas
//Prieš Kalėdas miško urėdijos prekiauja įvairaus aukščio eglutėmis.
//Į prekybos vietą atvežta n eglučių. Jų aukščiai yra e1, e2, …, en. Parašykite programą,
//skaičiuojančią vidutinį eglutės aukštį.
//-----------------------------------------------------------
//// sum = sum + eglutesAukstis;
//Kiek eglučių atvežta? 6
//Įveskite 1 eglutės aukštį: 167
//Įveskite 2 eglutės aukštį: 134
//Įveskite 3 eglutės aukštį: 145
//Įveskite 4 eglutės aukštį: 156
//Įveskite 5 eglutės aukštį: 155
//Įveskite 6 eglutės aukštį: 176
//GAUTA: Eglutės aukščio vidurkis: 155.5 cm
import java.util.Scanner;
public class CiklaiUzd023 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int i, a, m, sum=0;
        double vid;

        System.out.print("Kiek egluciu atvezta: ");
        a = reader.nextInt();

        for (i=1;i<=a;i++) {
            System.out.print("Iveskite eglutes auksti: ");
            m = reader.nextInt();
            sum=sum+m;
        }

        vid=(double)sum/a;
        System.out.println("Eglutės aukščio vidurkis: "+vid+" cm.");

        reader.close();
    }
}
