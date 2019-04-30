/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.script.ScriptException;

/**
 *
 * @author Adyth
 */
public class Date {
     public static void main(String[] args) throws ScriptException,
            FileNotFoundException, ParseException {
        List<java.util.Date> duration = new ArrayList<java.util.Date>();


        String starting = "2019-01-01";
        String ending = "2019-02-03";

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date_st = formatter.parse(starting);
        java.util.Date date_en = formatter.parse(ending);

        int init = 0;
        Calendar start = Calendar.getInstance();
        start.setTime(date_st);
        Calendar end = Calendar.getInstance();
        end.setTime(date_en);
        end.add(Calendar.DAY_OF_YEAR, 1); // Add 1 day to endDate to make sure
                                            // endDate is included into the
                                            // final list
        while (start.before(end)) {
            duration.add(start.getTime());
            start.add(Calendar.DAY_OF_YEAR, 1);
        }

        for (java.util.Date date : duration) {
            System.out.println(date);
        }

    }
}
