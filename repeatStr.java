public class Solution {
    public static String repeatStr(final int repeat, final String string) {
      if(repeat == 0){
        return "";
      }
      String s2 = string;
      for(int i = 1; i<repeat; i++){
        s2 += string;
      }
        return s2;
    }
}
