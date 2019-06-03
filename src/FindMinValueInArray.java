public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] arr={3,12,7,-1,8,1,6,9};
        int index=minValue(arr);
        System.out.println("The smallest element in array is "+arr[index]);
    }
    public static int minValue(int[] arr){
        int min =arr[0];
        int index=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
}
