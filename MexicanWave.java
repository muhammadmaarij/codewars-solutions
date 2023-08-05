public class MexicanWave {

    public static String[] wave(String str) {
        // Your code here
      int c = 0;
      for(int i = 0; i< str.length(); i++){
        if(str.charAt(i) == ' '){
          continue;
        }
        else{
          c += 1;
        }
      }
      String[] s = new String[c];
      int d = 0;
      for(int i = 0; i< str.length(); i++){
        if(str.charAt(i) == ' '){
          continue;
        }
        str = str.toLowerCase();
        char x = Character.toUpperCase(str.charAt(i));
        str = str.substring(0,i) + x +str.substring(i+1,str.length());
//         s[d] = str.replace(str.charAt(i), x);
          s[d] = str;
        d++;
      }
        return s;
    }
    
}
