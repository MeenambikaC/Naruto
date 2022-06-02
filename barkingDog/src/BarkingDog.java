public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(wakingUp(true,25));
    }
    public static boolean wakingUp(boolean barking, int hourOfDay){
        if (hourOfDay<0 || hourOfDay>23){
            return false;
        }
        else if ((hourOfDay<8 || hourOfDay>22) && barking){
            return true;
        }
        else{
            return false;
        }

    }
}
