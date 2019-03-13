package sort;

public class MaoPao {
    private int[] array ;
    public MaoPao(int[] array){
        this.array = array;
    }
    public int[] mysort(){
        if(array.length == 0){
            return array;
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
               if(array[j+1]<array[j]){
                   int temp = array[j+1];
                   array[j+1] = array [i];
                   array[i] = temp;
               }
            }

        }
        return array;
    }
    public static void main(String[] args){
        int[] narray = {6,4,8,3,8,0,9};
        MaoPao maoPao = new MaoPao(narray);
        for (int i : maoPao.mysort()){
            System.out.println(i);
        }
    }

}
