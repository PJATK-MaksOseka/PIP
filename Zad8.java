import java.util.Scanner;

class Zad8 {
    public static void main(String[] args) {

        System.out.println("Witamy w kantorze!" + "\n" + "Wybierz walutę:" + "\n" + " 1 - PLN" + "\n" + " 2 - JPY");
        Scanner scan = new Scanner(System.in);

        int wybor = scan.nextInt();
        if (wybor != 1 && wybor != 2) {
            System.out.println("Error.");
        } else {
            System.out.println("Wprowadź kwotę:");
            double kwota = scan.nextDouble();

            switch (wybor) {
                case 1:
                    PLN_na_JPY(kwota);
                    break;

                case 2:
                    JPY_na_PLN(kwota);
                    break;

                default:
                    System.out.println("Error.");
            }

        }
    }
    //: Kurs z dnia 03.12.2022
public static void PLN_na_JPY(double kwota){
    System.out.println(kwota + " zł" + " => " + kwota*30.27 + " ¥");
    }
    public static void JPY_na_PLN(double kwota){
        System.out.println(kwota + " ¥" + " => " + kwota/30.27 + " zł");
    }
}
