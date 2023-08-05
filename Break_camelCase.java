class Solution {
  public static String camelCase(String input) {
    String s = "";
    for(int i =0; i< input.length(); i++){
      if(input.charAt(i) >= 'A' && input.charAt(i)<= 'Z' ){
        char x =Character.toUpperCase(input.charAt(i));
        s = input.substring(0,i)+" "+x+input.substring(i+1,input.length());
        input = s;
        i++;
      }
      else if(!(input.charAt(i) >= 'A' && input.charAt(i)<= 'Z' )){
        s = input;
      }
    }
    return s;
  }
}
