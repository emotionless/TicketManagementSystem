/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package busticket;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Vector;


public class printMessage implements Printable {

    public void print_message() {
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(new printMessage());
        if (pj.printDialog()) {
            try {
                pj.print();
            } catch (PrinterException e) {
                System.out.println(e);
            }
        }
    }

    public int print(Graphics g, PageFormat pf, int pageIndex) {
        if (pageIndex != 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("Times New Roman", Font.PLAIN, 36));
        g2.setPaint(Color.black);
        int cnt = 50;
        for (int i = 0; i < busSeatPlan.paper.size(); i++) {
            
            g2.drawString(busSeatPlan.paper.elementAt(i).toString(), 30, cnt += 50);
        }
        return PAGE_EXISTS;
    }
}
