import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter values for x, y and z");
        Scanner in = new Scanner(System.in);
        x= in.nextInt();
        y= in.nextInt();
        z= in.nextInt();
        if ((x>y)&&(x>z))
            System.out.println("First number is the largest");
        else if (y > x && y > z) {
                System.out.println("Second number is the largest");
            } else if (z > x && z > y) {
                System.out.println("Third number is the largest");
            } else
                System.out.println("System error");


        }

    }


