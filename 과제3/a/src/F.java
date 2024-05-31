public class F {
    /**
     * SUR
     */
    static class SUR {
    
        String name;
        int ban, no, kor, eng, math;

       int gettotal(){
        return kor+eng+math;
       }
        float getAverage(){
            float a;
            a = (kor+eng+math)/3;
            
            return (float)(Math.round(a*10)/10.0);
        }
    }


    public static void main(String[] args) {
        SUR a = new SUR();
        a.name = "홍";
        a.ban = 1;
        a.no = 1;
        a.kor = 100;
        a.eng=60;
        a.math=76;

        System.out.println("name : "+a.name);
        System.out.println("total : "+a.gettotal());
        System.out.println("avg : "+a.getAverage());

    }
}
