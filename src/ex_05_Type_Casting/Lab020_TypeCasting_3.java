package ex_05_Type_Casting;

public class Lab020_TypeCasting_3 {
    public static void main(String[] args) {
        int courseFee=300;
        float gst= 18.55f;
       // int total= courseFee+gst; // Implicit narrowing (Not possible)
        int total2= (int) (courseFee+gst); //Explicit narrowing
        float total3= courseFee+gst; // Imp;icit widening
        float total4= (float) courseFee+gst; // Explicit widening (Not Reqd)
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);

    }
}
