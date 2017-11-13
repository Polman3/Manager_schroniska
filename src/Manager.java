import java.util.Scanner;
import java.io.IOException;

public class Manager {

    public static void main(String[] args) {

        int quantity = 0;

        while(1==1) {
            System.out.println("Witaj w programie: Manager schroniska");
            System.out.println("1. Doddaj zwierzątko");
            System.out.println("2. Usun zwierzątko");
            System.out.println("3. Edytuj dane");
            System.out.println("4. Status schroniska");
            System.out.println("5. Wyjście");
            Scanner odczyt = new Scanner(System.in);
            char answer;
            answer = odczyt.next().charAt(0);

            switch (answer) {
                case '1':
                    if(quantity>0){
                        quantity--;
                    }
                    else{
                        System.out.println("Brak wolnych miejsc w schronisku");
                        System.out.println("Ilosc miejsc: "+ quantity + "/20 \n");
                    }
                    break;
                case '2':
                    if(quantity<20){
                        quantity++;
                    }
                    else{
                        System.out.println("Schronisko jest puste");
                        System.out.println("Ilosc miejsc: "+ quantity + "/20 \n");
                    }
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '5':
                    System.exit(0);
            }
        }
    }
}
