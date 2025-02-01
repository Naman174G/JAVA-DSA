


/*public class arr {
  public static void main(String[] args) {
    int [] age = new int[]{12, 32 , 12};
    System.out.println(age[0]);

    int[] []num = new int[3][3];
      
      
  }
}

 //int [] arr ;
 //arr = new int [5];

 //int arr [] = new int [5];
 int arr[] = {1,2,3,4,5};
 System.out.println(arr[0]);

 for (int i=0; i < arr2.length ; i++ ){
  system.out.println(arr[i] + "");
 }*/


 public class Main {
 
  public static void main(String[] args) {
    int arr [] = {4,1,2,5,7};
    int max = arr[0] , min = arr[0];

    for(int i =1; i <arr.length; i++);{

    if(arr[i] > max) max = arr[i];
    if(arr[i] < min) min = arr[i];
    }
    System.out.println("Max:" + max);
    System.out.println("Min:" + min);
  }
 

 }