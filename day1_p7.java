import java.util.Scanner;
public class day1_p7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        int year=sc.nextInt();

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year +  " It is a leap Year");

        }
        else
        {
            System.out.println(year + " It is not a Leap Year");
        }
    }
}
