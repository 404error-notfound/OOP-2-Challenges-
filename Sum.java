public class Sum {
    public static int sum(int n) {
        //base case: if n is 1, then sum is 1
        if(n==1){
           return 1;
        } else {
            //recursive case
           return n + sum(n-1); 
        }
    }

    public static void main(String[]args){
      int result = sum(5);
      System.out.println("Sum: " + result);
    }
}
