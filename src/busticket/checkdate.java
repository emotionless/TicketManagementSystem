/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package busticket;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author emotionless
 */
public class checkdate {

    public int isPossible(Date takenDate) {
        Date pickerDate = takenDate;
        Date currDate = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        if (dateFormatter.format(pickerDate).compareTo(dateFormatter.format(currDate)) < 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
