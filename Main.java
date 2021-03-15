import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main
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
    d.add(4);
    d.add(12);
    d.add(15);
    d.add(6);
    d.add(8);

    ArrayList<Double> c = new ArrayList();
    c.add(4.3);
    c.add(15.0);
    c.add(1.5);
    c.add(9.9);
    c.add(10.23);

    System.out.println(findLargest(c));
    System.out.println(indexOfLargest(c));
    System.out.println(indexOfInt(b, 4));
    /*System.out.println(hasSameElements(b, d));*/
    System.out.println(hasSameElements(b, d));
    //ArrayList<String> e = new ArrayList();
    removeEvenLength(a);
    //System.out.println(e);
    //ArrayList<Integer> f = 
    removeDuplicates(b);
    //System.out.println(f);
    //ArrayList<String> g = 
    swapPairs(a);
    //System.out.println(g);
    //ArrayList<String> h = 
    doubleList(a);
    //System.out.println(h);
    //ArrayList<String> i = 
    removeShorterStrings(a);
    //System.out.println(i);
  }

  public static double findLargest(ArrayList<Double> a)
  {
    Collections.sort(a);
    double largest = a.get(a.size() - 1);
    return largest;
  }

  public static int indexOfLargest(ArrayList<Double> a)
  {
    double largest = findLargest(a); //This line works
    int index = a.indexOf(largest); //There is a problem with this line where index always equals 4
    return index;
  }
  
  public static int indexOfInt(ArrayList<Integer> a, int target)
  {
    int index = a.indexOf(target);
    return index;
  }
  
  public static boolean hasSameElements(ArrayList<Integer> a, ArrayList<Integer> b) 
  {
    Collections.sort(a);
    Collections.sort(b);
    int i = 0;
    while(i < b.size())
    {
      if(a.get(i) != b.get(i))
      {
        return false;
      }
      i++;
    } 
    return true; //this always returns true, I think it skips the loop, also, a.size has an out of bounds exception
  }

  public static void removeEvenLength(ArrayList<String> a)
  {
    Iterator<String> iter = a.iterator();

    while(iter.hasNext())
    {
      String str = iter.next();
      if (str.length() % 2 == 0)
      {
        iter.remove();
      }
    }
  }

  public static void removeDuplicates(ArrayList<Integer> a)
  {
    int i = 0;
    while(i < a.size() - 1)
    {
      if(a.get(i) == a.get(i+1))
      {
        a.remove(i+1);
      }
      else
      {
        i++;
      }
    }
  }

  public static void swapPairs(ArrayList<String> a) 
  {
    int i = 0;
    while(i < a.size() - 1)
    {
      String s1 = a.get(i);
      String s2 = a.get(i + 1);
      a.set(i, s2);
      a.set(i + 1, s1);
      i = i + 2;
    }
  }

  public static void doubleList(ArrayList<String> a)
  {
    a.ensureCapacity(a.size() * 2);
    int i = a.size() - 1;
    int n = a.size() / 2 - 1;
    while(i > 0)
    {
      a.set(i, a.get(n));
      a.set(i - 1, a.get(n));
      i = i - 2;
      n--;
    }
  }

  public static void removeShorterStrings(ArrayList<String> a)
  {
    int i = 0;
    while(i < a.size() - 1)
    {
      if(a.get(i).length() < a.get(i + 1).length())
      {
        a.remove(i);
      }
      else if(a.get(i).length() > a.get(i + 1).length())
      {
        a.remove(i + 1);
      }
      else
      {
        a.remove(i);
      }
      i++;
    }
  }

  //Replace all occurences of character c with * in the string
  //For example, if s="happy birthday" and c = 'h'
  //would return "*appy birthday"
  public static String censor(String s, char c)
  {
    //Option 1
    //return s.replace(c, '*');

    //Option 2
    String str = "";
    for(int i = 0; i < s.length(); i++)
    {
      if(s.charAt(i) == c)
      {
        str = str + "*";
      }
      else
      {
        str = str + s.charAt(i);
      }
    }
    return str;
  }
}
