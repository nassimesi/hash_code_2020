import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file=new File("a_example.txt");
        int numberBook = 0;
        int numberLibray = 0;
        int numberDays = 0;
        int cost[];
        List<Integer> bookByLibrary[];
        try(Scanner sc=new Scanner(file, StandardCharsets.US_ASCII.name())) {
            if (sc.hasNextInt()) numberBook=sc.nextInt();
            if (sc.hasNextInt()) numberLibray=sc.nextInt();
            if (sc.hasNextInt()) numberDays=sc.nextInt();
            cost = new int[numberBook];
            bookByLibrary = new List[numberLibray];
            for (int i=0;i<numberBook;i++){
                cost[i]=sc.nextInt();
            }
            for (int i=0;i<numberLibray;i++){
                int numberBookByLibrary=sc.nextInt();
                int signupByLibrary=sc.nextInt();
                int numberBookByDay=sc.nextInt();
                bookByLibrary[i]=new ArrayList<Integer>();
                bookByLibrary[i].add(signupByLibrary);
                bookByLibrary[i].add(numberBookByDay);
                for (int j=0;j<numberBookByLibrary;j++){
                    bookByLibrary[i].add(sc.nextInt());
                }
            }
            System.out.println(bookByLibrary[0]);
            System.out.println(bookByLibrary[1]);
        }
    catch (IOException e) {
            e.printStackTrace();
        }
    }
}
