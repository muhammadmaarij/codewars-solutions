public class Square {    
    public static boolean isSquare(int n) {    
      int x;
      if(n < 0){
        return false;
      }
      for(int i = 0; i<= n/2; i++){
        x = i*i;
        if(x == n && x<=n){
          return true;
        }
        else{
          continue;
        }
      }
        return false; // fix me!
    }
}
