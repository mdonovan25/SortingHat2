public class SelectionSort {
    public int[] array;

    public SelectionSort(){
        //construct random array
        makeArray();
        //print unsorted array
        printArray();
        //sort array
        sortArray();
        //print sorted array to make sure it worked
        //       printArray();
        printArray();
    }

    public void makeArray(){
        //construct array
        array = new int[20];
        for(int i=0; i<array.length; i++){
            array[i]= (int) (9*(Math.random())+1);
        }

    }

    public void printArray(){
        for(int x=0; x<array.length; x++){
            System.out.print(array[x]+" ");
        }
        System.out.println();
    }

    public void sortArray(){
        int min;
        for(int j=0; j<array.length-1; j++){
            min=j;
            for(int i =j+1; i<array.length; i++){
                if (array[i]<array[min]){
                    min = i;
                }
            }
            if(min != j){
                int temp = array[j];
                array[j]=array[min];
                array[min] = temp;
            }
        }
    }







    public static void main(String[] args) {
        SelectionSort bubbles = new SelectionSort();
    }
}
