/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolate.spreadsheet;

import java.util.Calendar;
import java.util.Date;



/**
 *
 * @author RUWAN
 */
public class MyDate {
    private String MyDateString=null;
    private Date  myDate;
    private String MonthLong[]="January,Febuary,March,April,May,June,July,August,September,October,November.December".split(",");
    private String MonthShort[]="Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec".split(",");
    private int year, month, date;
    
    public void setMyDateString(String newString){
        MyDateString=newString;
    }
    
    public String getMyDateString(){
        return MyDateString;
    }
    
    public Date getmyDate(){
        return myDate;
    }
    
    public boolean isDate(){
        
        return true;
    }
    
    public static String getWeekDay(Date newDate){
        String WeekD[]="Son,Mon,Tues,Wednes,Thurs,Fri,atur".split(",");
        Calendar c= Calendar.getInstance();
        c.setTime(newDate);
        int D= c.get(Calendar.DAY_OF_WEEK);
        return WeekD[D-1]+"day";
    }
    
    public boolean isvalidInt(String str){
        if(str==null){
            return false;
        }
        int i=0;
        int length=str.length();
        while(i<length){
            char temp=str.charAt(i);
            if(temp<'0' || temp>'9'){
                return false;
            }
            i++;
        }
        return true;
    }
}
