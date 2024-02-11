import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Context context=new Context();
        boolean fin=false;
        Scanner scanner=new Scanner(System.in);
        while (!fin){
            System.out.println("Donner la strategie");
            String strategyClassName=scanner.nextLine();
            IStrategy iStrategy= (IStrategy) Class.forName(strategyClassName).newInstance();
            context.setiStrategy(iStrategy);
            context.processe();

        }

    }
}
