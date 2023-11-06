public class BubbleSort {


        public int[] array;

        public BubbleSort(){
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
            array = new int[8];
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
            boolean madeSwap = false;
            for(int j=1; j<array.length; j++) {
                madeSwap=false;
                for (int i = 1; i < array.length-(j-1); i++) {
                    if (array[i - 1] > array[i]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        madeSwap=true;
                    }

                }
                if(madeSwap==false){
                    break;
                }
                printArray();
            }
        }







        public static void main(String[] args) {
            BubbleSort bubbles = new BubbleSort();
        }

    }

