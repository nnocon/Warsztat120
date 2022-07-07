package collections.exceptions;

public class ExceptionsDemo {
    public static void main(String[] args) {

        System.out.println("Start");
        String text = "abs";
        try{
      String result = text.toUpperCase();
            System.out.println(result);
           // System.out.println(text.charAt(100));
            System.out.println(10/0);
        //}catch(NullPointerException e ) {
          //  System.out.println("Wystapil NullPointer");

        }catch(StringIndexOutOfBoundsException  | NullPointerException e ) {
            System.out.println("oj oj oj...");
        }catch (Exception e){
            System.out.println("Jakis nieprzewidziany wyjatek");
            e.printStackTrace();
        }finally{
            System.out.println("Zawsze wystapi");
        }

        System.out.println(".....");
    }
}
