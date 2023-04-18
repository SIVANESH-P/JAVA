import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers= new int[4];
        numbers[0] = 2;
        numbers[3] = 1;
        System.out.println(Arrays.toString(numbers));

        int[] numberlist = {23,21,20,29};
        int length = numberlist.length;
        System.out.println(length);
        Arrays.sort(numberlist);
        System.out.println(Arrays.toString(numberlist));
        //Multidimensional arrays
        int[][][] numbers1 = new int[5][2][2];
        numbers1[0][1][1]= 2;
        numbers1[1][1][1]= 2;
        System.out.println(Arrays.deepToString(numbers1));
        double result= 10/3;
        System.out.println(result);

        int x= 1;
        x=x+2;
        x+=2;
        System.out.println(x);
    }
}