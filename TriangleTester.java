class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    if(a<1 || b<1 ||c <1){
      return false;
    }
    if((a+b >c) && (b+c > a) && (a+c > b)){
      return true;
    }
    return false;
  }
}
