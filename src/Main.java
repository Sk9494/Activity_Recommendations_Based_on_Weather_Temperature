import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter teprature");
        heat = input.nextInt();

        if (heat<5) {
            System.out.println("You can go skiing");
        } else if (heat >= 5 && heat <=15){
                System.out.println("You can go to the cinema");
        } else if (heat <=25){
                System.out.println("You can go picnic");

        } else if(heat >=25 && heat<=35) {

                System.out.println("You can go swimming");
        } else if (heat >35) {
            System.out.println("Stay at home and open air conditions");

        }
    }
}