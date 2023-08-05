public class Solution {

  public static boolean validatePin(String pin) {
    // Your code here...
    
    for(int i = 0; i<pin.length(); i++){
      if(pin.charAt(i)-'0' > 9 || pin.charAt(i)-'0'<0){
        return false;
      }
    }
    if(pin.length() == 4 || pin.length() == 6){
      return true;
    }
    return false;
  }

}
