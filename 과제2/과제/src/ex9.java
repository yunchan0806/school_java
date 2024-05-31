import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, m, row, n = 0;

        System.out.println("층수를 입력하게요");
        row = scanner.nextInt();

        for(int i = 0; i < row; i++){
            
            for(k = 0; k < row-i-1; k++){
                System.out.print("*");
            }
            for(m = 0; m < (2*i)+1; m++){
                System.out.print(n);
                n++;
                if(n>=10){
                    n = 0;
                }
                
            }
            for(k = 0; k < row-i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
