public class TH {
    /**
     * A
     */
    static class A {
        int arraySum(int[] array){
            int sum = 0;
            for(int i = 0; i < array.length; i++){
                sum += i;
            }
            return sum;
        }
        
    }

    public static void main(String[] args) {
        A a =new A();
        int[] data1 = new int[]{1,2,3};
        int[] data2 ={1,2,3};

        System.out.println(a.arraySum((data1)));
        System.out.println(a.arraySum((data2)));
        System.out.println(a.arraySum(new int[]{1,2,3}));
        System.out.println(a.arraySum({1,2,3}));
    }
}
