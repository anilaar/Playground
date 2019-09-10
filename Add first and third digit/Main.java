import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int fd,td;
      fd = a/100;
      td = a%10;
      fd =fd+td;
      System.out.println(fd);
	}
}