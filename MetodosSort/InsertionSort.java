public class InsertionSort {
    /*funcion de ordenamiento por insercion*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int clave = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = clave;
        }
    }
 
    //Imprimir cadena
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = { 20, 18, 30, 10, 15 };
 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
 
        printArray(arr);
    }
};
 
 
