import java.util.Scanner;
public class others {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number of rows: ");
        int row = scanner.nextInt();
        System.out.println("please enter number of columns: ");
        int columns = scanner.nextInt();

        for(int i =1; i<=row; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    }

