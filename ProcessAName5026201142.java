import java.util.*;

public class ProcessAName5026201142 {
    public static void main(String[] args) {
        Scanner procName = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = procName.nextLine();
        String LastName = name.substring(name.indexOf(" ") +1);

        String FirstName = name.substring(0, 1);
        String FullName = LastName + ", " + FirstName + ".";
        System.out.println(FullName);
    }
}