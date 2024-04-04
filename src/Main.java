import javax.swing.text.BadLocationException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String userName ;
    public static void main(String[] args) throws IOException, BadLocationException {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your username");
        userName = scanner.nextLine();
 Remove remove1 =new Remove() ;
 remove1.remove(userName);
    }
}