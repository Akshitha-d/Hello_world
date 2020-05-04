import java.util.Scanner;
public class SwapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the two number");
       Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       System.out.println("Numbers before swapping "+a+" and "+b);
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("Numbers after swapping "+a+" and "+b);
	}

}
