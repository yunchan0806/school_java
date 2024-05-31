public class type {
    /**
     * Innertype
     */
    static class A {
        void averageScore(int... a){
          
            double b = 0.0;
            double i = 0;
            for (int num : a) {
                i++;
                b += num;
            }
   
            double avg = b  /  i;
            System.out.println(avg);
            

        }
        
        
    }

    public static void main(String[] args) {
        A a = new A();
        a.averageScore(1);
        a.averageScore(1,2);
        a.averageScore(1,2,3);
        a.averageScore(1,2,3,4);
    }
}
