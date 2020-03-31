public class bubbleSort {
    public static int[] bubble(int[] number) {
        int temp = 0;
        for(int i = 0; i < number.length; i++) {
            for(int j = 0; j <  number.length - 1; j++) {
                if(number[j] > number[j + 1]) {
                    temp = number[j + 1];
                    number[j + 1] = number[j];
                    number[j] = temp;
                }
            }
        }
        return number;
    }
    public static void main(String[] args){
        int[] a = {95, 27, 90, 49, 80, 58, 6, 9, 18, 50};
        int[] b = bubble(a);
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
    }
}