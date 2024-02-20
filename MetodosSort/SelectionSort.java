public class SelectionSort {
    /**
     * Funcion para ordenar un array por el metodo de seleccion
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            // Buscamos el indice mas bajo
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
 
    public static void main(String a[]) {
        int[] arr1 = {40, 10, -30, 45, 39, 32};
 
        System.out.println("Array original");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
 
        selectionSort(arr1);
 
        System.out.println("Array ordenado");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
