import java.util.Arrays;

public class App00 {public static void main (String[] args){
        int[] data = {70,60,50,110,40,10,100,30,20,80,90};
for (int barrier=data.length-1;barrier>=0; barrier-- ) {
    for (int index=0; index<barrier; index++){
        if (data[index]>data[index+1]){
        swap (data,index);}
        System.out.print(index);
        }
        System.out.println();
    }
    System.out.println(Arrays.toString(data));
}

    private static void ConditionalSwap(int[] array, int k) {
        if (array[k]>array[k+1]){
            swap(array, k);
        }
    }

    private static void swap(int[] array, int k) {
        int tmp = array[k];
        array[k]=array[(k+1)];
        array[(k+1)]=tmp;
    }
}