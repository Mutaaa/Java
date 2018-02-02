import java.util.Scanner;
public class Josephus
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("The number of people in the initial circle? :");
    int n = scan.nextInt();
    System.out.print("The count for each step? :");
    int k = scan.nextInt();
    int winner = g(n,k);
    System.out.println("The winner is position "+(winner+1)+".");
    }
  public static int g (int n, int k)
  {
    if(n==1)
    {
      return 0;
    }
    return ((g(n-1,k)+k)%n);
  }
}