import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numb = scanner.nextInt();

        if (numb < 2) {
            System.out.println(numb + " NOT is Prime!");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(numb)){
                if(numb % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(numb + " is Prime!");
            }else {
                System.out.println(numb + " NOT is Prime!");
            }
        }
    }
}
