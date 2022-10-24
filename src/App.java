import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("int:");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        console.close();
        System.out.println(x + 1);
    }
}
