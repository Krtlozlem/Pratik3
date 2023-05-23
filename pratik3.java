import java.util.Scanner;

public class pratik3 {
    public static void main(String[] args) {
        int km;
        double perKm =2.20,total = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Km'yi giriniz: ");
        km = input.nextInt();

        total = (total < 20)? 20: total;
        total += (km * perKm);
        System.out.print(total);
    }

}
