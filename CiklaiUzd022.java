package UzdaviniaiCiklai2;
//9.	Restoranas | Kiekio skaičiavimo algoritmas
//Restorano vadybininkas sugalvojo surengti konkursą lankytojams,
//kurio metu galima laimėti marškinėlius su restorano logotipu.
//Visi lankytojai kartu su sąskaita gauna po vieną kortelę,
//ant kurios parašytas sveikasis teigiamas skaičius iš intervalo [a;b]
//(a – intervalo pradžia, b – intervalo pabaiga). Laimi tie lankytojai,
//kurių kortelėse įrašytas skaičius dalijasi iš 6.
//Parašykite programą, kuri apskaičiuotų, kiek marškinėlių reikia užsakyti restorano vadybininkui.
//-----------------------------------------------------------
//Įveskite intervalo pradžią: 5
//Įveskite intervalo pabaigą: 24
//GAUTA: Reikalingų marškinėlių skaičius: 4
//-----------------------------------------------------------
//Įveskite intervalo pradžią: 31
//Įveskite intervalo pabaigą: 62
//GAUTA: Reikalingų marškinėlių skaičius: 5
import java.util.Scanner;
public class CiklaiUzd022 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int k=0;

        System.out.print("Įveskite intervalo pradžią: ");
        int a = reader.nextInt();
        System.out.print("Įveskite intervalo pabaigą: ");
        int b = reader.nextInt();

        for( int i=a; i<=b; i++) {
            if (i%6==0) {
                k++;
            }
        }

        System.out.println("Reikalingų marškinėlių skaičius: "+ k);

        reader.close();
    }
}
