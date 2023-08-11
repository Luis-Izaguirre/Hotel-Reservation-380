import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderPrint 
{
    public void PrintReservations()
    {
        String line = "";
        String splitBy = ",";
        boolean firstLineSkipped = false; 

        try {
            
            BufferedReader br = new BufferedReader(new FileReader("Reservations.csv"));

            while ((line = br.readLine()) != null) { //skips first line in the csv file
                if (!firstLineSkipped) {
                    firstLineSkipped = true;
                    continue; 
                }

                String[] reservation = line.split(splitBy);
                System.out.println("Customer's Name: " + reservation[0] + ", Contact: " + reservation[1] + ", Guest(s): " + reservation[2] + ", Room Number: " + reservation[3] + ", Room Type: " + reservation[4] + ", Check In Date: " + reservation[5] + ", Check In Time: " + reservation[6] + ", Check Out Date: " + reservation[7] + ", Check Out Time: " + reservation[8] + ", Fees: " + reservation[9] + ", Discount: " + reservation[10] + ", Total: " + reservation[11] + ", Check in/out status: " + reservation[12]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
