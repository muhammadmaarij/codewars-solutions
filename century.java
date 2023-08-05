public class Solution {
  public static int century(int number) {
    // your code goes here
//     double x = number/100;
//     double z = number%100;
//     int y = (int) Math.floor(x);
//     if(z%10 >=1 && z%10<=99){
//       return y+1;
//     }
//     else{
//       return (y);
      
//     }
    return (number + 99)/100;
  }
}
