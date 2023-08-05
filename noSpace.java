public class Kata {
    public static String noSpace(final String x) {
      String y = "";
      for(int i = 0; i< x.length(); i++){
        if(x.charAt(i) == ' '){
          continue;
        }
        else{
          y += x.charAt(i);
        }
      }
        return y;
    }
}
