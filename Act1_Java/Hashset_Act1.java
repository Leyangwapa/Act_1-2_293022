import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hashset_Act1 {

    public static void main(String[] args) {
        HashSet<String> favorites = new HashSet<String>();

       
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your favorite travel color?");
        String color= sc.nextLine();
        System.out.println("What is your favorite song?");
        String song = sc.nextLine();
        System.out.println("Who is your favorite artist?");
        String artist = sc.nextLine();
        System.out.println("What is the biggest mistake in life that you've encountered?");
        String mistake = sc.nextLine();

        favorites.add(name);
        favorites.add(color);
        favorites.add(song);
        favorites.add(artist);
        favorites.add(mistake);
    
        Iterator it =  favorites.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}