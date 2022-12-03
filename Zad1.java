public class Zad1 {
            public static void main(String[] args) {
                boolean czyPada = false;
                boolean czySwieciSlonce = true;


                if (czyPada && czySwieciSlonce) {
                    System.out.println("Tecza");
                }
                if (!czyPada && czySwieciSlonce) {
                    System.out.println("Slonecznie");
                }
                if (czyPada && !czySwieciSlonce) {
                    System.out.println("Plucha");
                }
                if (!czyPada && !czySwieciSlonce) {
                    System.out.println("Pochmurno");
                }
            }


        }
