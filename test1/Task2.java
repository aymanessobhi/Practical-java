package test1;

public class Task2 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n){
        for (int i = 1; i<=n;i++){
            //print spaces
            for (int j = 1;j <=n-i;j++){
                System.out.print(" ");
            }
            //print asterisks,
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
