/**
 * @project hackerankApp
 * @Author royantonius on 26/08/19 .
 */
public class BubbleSort {


    public void PrintBubbleSort(){

        int[] arrayNotsorted = {1,5,3,2,8,10,14,32,20};


        for(int lastArrayUnsorted = arrayNotsorted.length - 1; lastArrayUnsorted > 0;
            lastArrayUnsorted--){
            for (int i =0;i<lastArrayUnsorted;i++){
                if (arrayNotsorted[i] > arrayNotsorted[i+1] ){
                    Swap(arrayNotsorted,i,i+1);
                }
            }

        }



        for(int i=0;i< arrayNotsorted.length;i++){

            System.out.print(" "+arrayNotsorted[i]+" ");
        }




    }




    public  void Swap(int[] array,int i, int j) {

        if (i==j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
