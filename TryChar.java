public class TryChar {
  public static void main(String[] args) {
     char tryChar1 = 'A';
     System.out.print("tryChar1 char value: ");
     System.out.println(tryChar1);
     System.out.print("tryChar1 ascii code: ");
     System.out.println((int) tryChar1);

     char tryChar2 = 'ß';
     System.out.print("tryChar2 value: ");
     System.out.println(tryChar2);
     System.out.print("tryChar2 ascii code: ");
     System.out.println((int) tryChar2);

     char tryChar3 = 124;
     System.out.print("tryChar3 value: ");
     System.out.println(tryChar3);
     System.out.print("tryChar3 ascii code: ");
     System.out.println((int) tryChar3);

     char tryChar4 = '\u2142';
     System.out.print("tryChar4 value: ");
     System.out.println(tryChar4);
     System.out.print("tryChar4 Unicode code: ");
     System.out.println((int) tryChar4);
  }
}
