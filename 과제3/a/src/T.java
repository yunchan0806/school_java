public class T {
    /**
     * A
     */
    static class A {

        
        void print(){
            System.out.println("입력값 없음");
        }
        void print(int a){
            System.out.println(a);
        }
        void print(double a){
            System.out.println(a);
        }
        void print(String a){
            System.out.println(a);
        }
        
    };

    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.print(3);
        a.print(5.8);
        a.print("안녕");
        
    }
    
    
}
