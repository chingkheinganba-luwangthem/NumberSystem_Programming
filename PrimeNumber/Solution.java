public class CheckPrime{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check a number is prime or not");
    int num = sc.nextInt();
    System.out.println(num + (isPrime(num)? "is prime" : "is not prime"));
  }

  public static boolean isPrime(int num){
    for(int i=2;i<=Math.sqrt(num);i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
}
