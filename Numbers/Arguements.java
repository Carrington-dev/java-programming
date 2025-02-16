public class Arguements {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Out of index");
        }
    }
    
}
