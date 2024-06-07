import java.util.Scanner;
public class array_crud
{
    static Scanner scanner = new Scanner(System.in);
    static final int MAX_SIZE =10;

    static void displayArray(int []arr,int size)
    {
        System.out.println("Array elements :");
        for (int i =0;i<size; i++)
        {
            System.out.println(arr[i] +"");
        }
        System.out.println();
    }
}

static void insertElements(int[] aee, int size , int index , int element)
{
    if (size ==MAX_SIZE)
    {
        System.out.println("Array is full cannot insert element");
        return;

    }
    if (index< 0 || index > size)
    {
         System.out.println("invalid index cannot insert element");
    }
    for(int i =size -1;i>=index; i==)
    {
        aee[i+1] =aee[i];
    }
    aee[index] =element;
     System.out.println("element insert succesfully");
}
public static void main(String args[])
{
    int[] arr =new int[MAX_SIZE];
    int size=0;
    int choice;

    do
    {
         System.out.println("\nMenu:");
         System.out.println("1.Display Array");
         System.out.println("2.search by element:");
         System.out.println("3.search by value");
         System.out.println("4.insert elements");
         System.out.println("5.delete elements");   
         System.out.println("6.update elements");
         System.out.println("0.xit");

         System.out.println("Enter your choice : ");
         choice =Scanner.nextInt();

         switch(choice){
            case 1:
                displayArray(arr,size);
                break;
            case 2:
                System.out.println("Enter element to search :");
                int searchElement = Scanner.nextInt();
                int elementsIndex = searchByElement(arr,size,searchElement);
                if (elementsIndex !=-1){
                    System.out.println("Elements found at index" +element)
                } else {
                    System.out.println("Element not found in the array");
                }

                break;

            case 4:
                System.out.println("Enter Index to insert element:");
                int insertIndex = Scanner.nextInt();
                System.out.println("Enter element to insert :");
                int insertElement =  Scanner.nextInt();
                insertElement(arr,size,insertIndex,insertElement);
                size++;
                break;

            case 5:
                System.out.println("Enter index to delete element :");
                int deleteIndex = Scanner.nextInt();
                deleteElement(arr,size,deleteIndex);
                size--;
                break;

            case 6:
                System.out.println("enter index to update element :");
                int updateIndex = Scanner.nextInt();
                System.out.println("enter new value")
                break;

               
            

            
         }
    }
}