package section2.exercise2;

public class Something {
    public static void main(String[] args) {
        int[] arr = new int[1];
        arr[0] = 11;

        int [] arr2 = new int[arr.length + 1];

        for (int i = 0; i < arr.length ; i++){
            arr2[i] = arr[i];
        }

        arr2[1] = 22;

        arr = arr2;

        //11 22 33
        //22




        System.out.println(arr2[1]);
    }
}
