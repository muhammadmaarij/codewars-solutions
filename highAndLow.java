public class Kata {
  public static String highAndLow(String numbers) {
    // Code here or
    String [] str = numbers.split(" ");
    Integer [] arr = new Integer[str.length];
    
  for(int i = 0; i<str.length; i++){
    arr[i] = Integer.parseInt(str[i]);
    }
    int max = arr[0];
    int min = arr[0];
    int x;
    for(int i = 0; i<arr.length; i++){
      x = arr[i];
      if(x > max){
        max = x;
      }
      if(x < min){
        min = x;
      }
    }
      
    return (String.valueOf(max)+" "+String.valueOf(min));
}
  }
