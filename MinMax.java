class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
      int [] s = new int[2];
      int max = arr[0];
      int min = arr[0];
      for(int i = 0; i<arr.length; i++){
        if(arr[i]>max){
          max = arr[i];
        }
        if(arr[i]<min){
          min = arr[i];
        }
      }
      s[0] = min;
      s[1] = max;
      return s;
    }
}
