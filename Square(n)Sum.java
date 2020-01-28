public class Kata
 {
  public static int squareSum(int[] n)
  { 
  
  int one = 0;
  
  for(int num : n){
    one += num * num;
  }
  
  return one;
  }
 }
