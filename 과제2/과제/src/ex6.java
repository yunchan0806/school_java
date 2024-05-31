public class ex6 {
    public static void main(String [] args){
        int [] arr = {10,20,30,40,50};
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            num += arr[i];
        }
        System.out.println("sum = " + num);
    }
}
