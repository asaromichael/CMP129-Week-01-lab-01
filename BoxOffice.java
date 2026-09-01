import java.util.Scanner;
public class BoxOffice {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is the name of the movie?\n");
        String name = scanner.nextLine();

        System.out.print("How many adult tickets were sold?\n");
        int aTickets = scanner.nextInt();
        
        System.out.print("How many child tickets were sold?\n");
        int cTickets = scanner.nextInt();

        double aProfit = aTickets * 10;
        double cProfit = cTickets * 6;
        double gProfit = aProfit + cProfit;
        double nProfit = gProfit * 0.2;
        double dProfit = gProfit - nProfit;

        System.out.println("Movie Name: " + name);
        System.out.println("Adult Tickets Sold: " + aTickets);
        System.out.println("Child Tickets Sold: " + cTickets);
        System.out.print("Gross Profit: $");
        System.out.printf("%.2f", gProfit);
        System.out.print("\nNet Profit: $");
        System.out.printf("%.2f", nProfit);
        System.out.print("\nDistributer Profit: $");
        System.out.printf("%.2f", dProfit);


    }
    
}
