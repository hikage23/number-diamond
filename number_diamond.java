import java.util.Scanner;

public class number_diamond {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = scan.nextInt();

        for (int j=1 ; j<n; j++) {

            for (int k=0; k<n-j; k++){
                System.out.print("  ");
            }

            for (int i=0; i<=j+j-2; i++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int j=n ; j>0; j--) {
            //System.out.println();

            for (int k=n-j; k>0; k--){
                System.out.print("  ");
            }

            for (int i=j+j-2; i>=0; i--){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
