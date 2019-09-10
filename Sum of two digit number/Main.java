import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc =new Scanner(System.in);
      
      int a = sc.nextInt();
      int sd= a%10;
      int fd=a/10;
      fd=sd+fd;
      System.out.println(fd);
      
	}
}