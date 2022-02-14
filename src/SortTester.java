import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};
    // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};
    // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
