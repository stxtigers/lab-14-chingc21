import java.util.ArrayList;

public class Tester
{
  public static void main(String[] args)
  {
    ArrayList<String> a = new ArrayList();
    a.add("cat");
    a.add("horse");
    a.add("desk");
    a.add("school");
    a.add("fauci");
    a.add("java");
    a.add("computer");

    ArrayList<Integer> b = new ArrayList();
    b.add(4);
    b.add(12);
    b.add(15);
    b.add(6);
    b.add(6);

    ArrayList<Integer> d = new ArrayList();
    b.add(4);
    b.add(12);
    b.add(15);
    b.add(6);
    b.add(2);

    ArrayList<Double> c = new ArrayList();
    c.add(4.3);
    c.add(5.6);
    c.add(1.5);
    c.add(9.9);
    c.add(5.42);

    System.out.println(findLargest(c));
    System.out.println(indexOfLargest(c));
    System.out.println(indexOfInt(b), 4);
    System.out.println(hasSameElements(b, d));
    System.out.println(removeEvenLength(a));
    System.out.println(removeDuplicates(a));
    System.out.println(swapPairs(a));
    System.out.println(doubleList(a));
    System.out.println(removeShorterStrings(a));
  }
}