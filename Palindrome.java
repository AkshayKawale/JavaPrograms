class Palindrome{
 public static void main(String args[]){
  int remainder,sum=0,temp;
  int number=121;

  temp=number;
  while(number>0){
   remainder=number%10;
   sum=(sum*10)+r;
   n=n/10;
  }
  if(temp==sum)
   System.out.println("palindrome ");
  else
   System.out.println("not palindrome");
}
}