public class App {
    
    public static class A {
        boolean a;
        int b;
        double c;
        String d;
    
        void adc(){
            System.out.println(b + c);
            System.out.println(c + d);
            System.out.println(d + a);
        }
        
    };

    
    public static void main(String[] args) throws Exception {
        A a = new A();
        
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
        System.out.println();
        a.adc();
    }
}
