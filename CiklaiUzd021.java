package UzdaviniaiCiklai2;
//8.	FUNKCIJA
//Parašykite programą, skaičiuojančią funkcijos y = 7x2 + 5x – 3 reikšmes, kai x kinta [-10; 10].
//-----------------------------------------------------------
//Gauta:
//Kai x = -10, tai y = 647
//Kai x = -9, tai y = 519
//...
//Kai x = 10, tai y = 747

public class CiklaiUzd021 {
    public static void main(String[] args) {

        for(int x=-10; x<=10; x++) {
            double y=7*(Math.pow(x,2))+(5*x)-3;
            System.out.println("Kai x = "+x+" , tai y = "+ y);
        }

    }
}
