/**
 * Avticity 3.7.6
 */
import java.util.ArrayList;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
    for (int i = 0; i < intList.size()-1; i++) {
      int smallNum = i;
      for (int x = i+1; x < intList.size(); x++) {
        if (intList.get(x) < intList.get(smallNum)) {
          smallNum = x;
        }
      }
      int temp = intList.get(smallNum);
      intList.set(smallNum, intList.get(i));
      intList.set(i, temp);
    }
    
    return intList;
  }

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
    for (int i = 1; i < intList.size(); i++) {
      int comparing = intList.get(i);
      int compared = i-1;
      while (compared >= 0 && intList.get(compared) > comparing) {
          intList.set(compared+1, intList.get(compared));
          compared--;
      }
      intList.set(compared+1, comparing);
    }

    return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 

  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    for (int i = 0; i < doubleList.size()-1; i++) {
      int smallNum = i;
      for (int x = i+1; x < doubleList.size(); x++) {
        if (doubleList.get(x) < doubleList.get(smallNum)) {
          smallNum = x;
        }
      }
      Double temp = doubleList.get(smallNum);
      doubleList.set(smallNum, doubleList.get(i));
      doubleList.set(i, temp);
    }
    
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    for (int i = 1; i < doubleList.size(); i++) {
      double comparing = doubleList.get(i);
      int compared = i-1;
      while (compared >= 0 && doubleList.get(compared) > comparing) {
          doubleList.set(compared+1, doubleList.get(compared));
          compared--;
      }
      doubleList.set(compared+1, comparing);
    }
    
    return doubleList;
  }

}