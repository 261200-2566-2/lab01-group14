//reference = ChatGPT

//import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void Rearrange(int [] number){
//        Arrays.sort(number);
        int n = number.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    // swap temp and arr[i]
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of nonnegative number :");
        int n = s.nextInt();
        System.out.println("Enter number :");
        int [] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = s.nextInt();
        }
        Rearrange(number);
        System.out.println("Outputs :");
        for (int num : number) {
            System.out.println(num);
        }
    }
}