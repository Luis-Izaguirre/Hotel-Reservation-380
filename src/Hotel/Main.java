package Hotel;
import HotelControllers.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
        int cnt = args.length;
        String inf;

        inf = args[0];
        Reservation reserve = new Reservation();

        reserve.Initialize(inf);
        }

}