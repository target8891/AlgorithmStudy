package sort;

public class XuanZhe {
    private int[] array;
    public XuanZhe(int[] array){
        this.array = array;
    }
    public int[] mySort(){
        if(array.length <= 1){
            return array;
        }
        for(int i=0 ; i < array.length; i++){
            //
            int minPos = i;
            for(int j=i; j < array.length; j++){
               if(array[minPos] > array[j]){
                   minPos = j;
               }
            }//得到了最小的索引

            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
