public class Sequence{

  public static int[] reverse(int n){
    int [] s = new int[n];
    int x =0;
    for(int i = n; i> 0; i--){
      s[x] = i;
      x++;
    }
    return s;
  }

}
