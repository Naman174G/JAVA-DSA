public class linearsearch {
  // Linear Search Function
  public static int search(int[] arr, int target) {
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == target) {
              return i; // Return the index if found
          }
      }
      return -1; // Return -1 if not found
  }

  public static void main(String[] args) {
      int[] numbers = {10, 20, 30, 40, 50};
      int target = 30;

      int result = search(numbers, target);

      if (result != -1) {
          System.out.println("Element found at index: " + result);
      } else {
          System.out.println("Element not found");
      }
  }
}

