
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Music m1 = new Music("cruel Summer", 3, "pop", "lover", new Date(3, 4, 2023), new Artist("taylor", "american", 5));
        Music m2 = new Music("cold as you", 3, "jazz", "folklore", new Date(5, 6, 2022), new Artist("taylor", "American", 4));
        Music m3 = new Music("emotions", 4, "pop", "box of puzzles", new Date(3, 6, 2021), new Artist("deep focus", "canadian", 4));
        Music m4 = new Music("evening stars", 2, "jazz", "lover", new Date(7, 9, 2020), new Artist("ariana", "canadian", 4));

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);


        if (m2.equals(m1)) {
            System.out.println("Equal");
        } else {
            System.out.println("not equal");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("enter title");
        String title = input.next();
        Scanner textInput = new Scanner(System.in);

        System.out.println("enter duration");
        int duration = textInput.nextInt();
        System.out.println("enter genre");
        String genre = input.next();
        System.out.println("enter album name");
        String albumName = input.next();
        System.out.println("enter day");
        int day = textInput.nextInt();
        System.out.println("enter month");
        int month = textInput.nextInt();
        System.out.println("enter year");
        int year = textInput.nextInt();
       Date dateInput = new Date(day,month,year);
        System.out.println("enter artist name");
        String artistName = input.next();
        System.out.println("enter nationality of artist");
        String nationality = input.next();
        System.out.println("enter rating of music");
        int rating = textInput.nextInt();

     Artist artistInput = new Artist(artistName,nationality,rating);
     Music m5 = new Music(title,duration,genre,albumName,dateInput,artistInput);
     System.out.println(m5);

    //Music[] list = new Music[20];





    }
}

