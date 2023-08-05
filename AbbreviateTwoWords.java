public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String [] arr = name.split(" ");
    char a = arr[0].charAt(0);
    char b = arr[1].charAt(0);
    String c = a+"."+b;
    return c.toUpperCase();
  }
}
