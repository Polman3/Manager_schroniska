import java.util.Scanner;
import java.io.IOException;

public class Manager {

    public static void addAnimal(){
        String nazwa, typ, rasa, stan_zdrowia, plec;
        int wiek;
        System.out.println("Podaj imie zwierzątka: ");
        Scanner odczyt_danych = new Scanner(System.in);
        nazwa = odczyt_danych.nextLine();
        System.out.println("Podaj typ zwierzątka: ");
        typ = odczyt_danych.nextLine();
        System.out.println("Podaj rase zwierzątka: ");
        rasa = odczyt_danych.nextLine();
        System.out.println("Podaj stan zdrowia zwierzątka: ");
        stan_zdrowia = odczyt_danych.nextLine();
        System.out.println("Podaj plec zwierzątka: ");
        plec = odczyt_danych.nextLine();
        System.out.println("Podaj wiek zwierzątka: ");
        wiek = odczyt_danych.nextInt();

        Animal zwierzatko = new Animal(nazwa,typ,rasa,stan_zdrowia,plec,wiek);
        System.out.println(zwierzatko.getName() + zwierzatko.getType() + zwierzatko.getRace() + zwierzatko.getHealth() + zwierzatko.getSex() + zwierzatko.getAge());
    }

    public static void main(String[] args) {

        int quantity = 20;

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
                        addAnimal();
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
