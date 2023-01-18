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
    /* your code goes here */

    return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    /* your code goes here */
    
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    /* your code goes here */
    
    return doubleList;
  }

}