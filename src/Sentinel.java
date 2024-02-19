import java.util.Scanner;

public class Sentinel {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int SENTINEL =-1;
    int tal = 0;
    int sum = +0;

    System.out.println(" indtast de tal der skal lægges sammen, eller -1 for at stoppe ");
    while(tal !=SENTINEL) {
        sum += tal;
        tal = scanner.nextInt();
     }
    System.out.println("Summen er " + sum);
}
}
