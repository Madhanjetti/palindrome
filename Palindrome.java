import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 int i;
int n=1201;
      int temp=n;
      int rem,rev=0;
      while(n!=0){
          rem=n%10;
          rev=rev*10+rem;
          n=n/10;
      }
       System.out.println(rev);
    //   int c=rev;
      if(rev==temp){
    System.out.println("is palindrome");}
    else{
     System.out.println("is not a palindrome");}
     String c;
     Scanner sc=new Scanner(System.in);
     c=sc.next();
     String z="";
     for(int k=c.length()-1;k>=0;k--){
         z=z+c.charAt(k);
     }
     System.out.println(c.uppercase);
     System.out.println(z);
       if(c.equals(z)){
    System.out.println("is palindrome");}
    else{
     System.out.println("is not a palindrome");}
	}
}
