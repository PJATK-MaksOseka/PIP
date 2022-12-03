import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

        Scanner cyfra = new Scanner(System.in);
        int x = cyfra.nextInt();
        int y = cyfra.nextInt();

        Scanner op = new Scanner(System.in);
        String operacja = op.next();

        switch(operacja){
            case "add": add(x,y);
                break;
            case "sub": sub(x,y);
                break;
            case "div": div(x,y);
                break;
            case "mul": mul(x,y);
                break;
            default:
                System.out.println("Brak takiej operacji");
                break;


        }


    }
    public static void add(int x, int y){
        System.out.println("Wynik: " + (x+y));
    }
    public static void sub(int x, int y){
        System.out.println("Wynik:" + (x-y));
    }
    public static void div(int x, int y){
        System.out.println("Wynik: " + (x/y));
    }
    public static void mul(int x, int y){
        System.out.println("Wynik: " + (x*y));
    }

}





