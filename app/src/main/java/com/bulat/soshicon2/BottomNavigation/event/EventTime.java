package com.bulat.soshicon2.BottomNavigation.event;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Years;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EventTime {
    public String handle(String eventTime) throws ParseException {

        String[] eventTimeArr = eventTime.split("-");
        String time = "";
        String pattern = "yyyy-MM-dd-HH-mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String clientTime = simpleDateFormat.format(new Date());

        Date d1 = simpleDateFormat.parse(eventTime);
        Date d2 = simpleDateFormat.parse(clientTime);

        DateTime dt1 = new DateTime(d1);
        DateTime dt2 = new DateTime(d2);

        int year = Years.yearsBetween(dt1, dt2).getYears();
        int month = Months.monthsBetween(dt1, dt2).getMonths();
        int day = Days.daysBetween(dt1, dt2).getDays();
        int hour = Hours.hoursBetween(dt1, dt2).getHours();
        int min = Minutes.minutesBetween(dt1, dt2).getMinutes();


        if (eventTime == ""){
            time = "";
        }
        else if (eventTime.equals(clientTime)) {
            time = "������ ���";
        }
        else if(year == 0 && month == 0 && day == 0 && hour  == 0){
            if (min <= 5){
                time = "������ ���";
            }
            if (min > 5 && min < 21 || min > 24 && min < 31 || min > 34 && min < 41 || min > 44 && min < 51 || min > 54 && min < 60) {
                time = min + " ����� �����";
            }
            if (min  == 21 || min  == 31 || min  == 41 ||min  == 51){
                time = min + " ������ �����";
            }
            if (min > 21 && min < 25 || min > 31 && min < 35 || min > 41 && min < 45 || min > 51 && min < 55){
                time = min + " ������ �����";
            }
        }
        else if (year == 0 && month == 0 && day == 0){
            if (hour == 1 || hour == 21){
                time = hour + " ��� �����";
            }
            if (hour > 1 && hour < 5 || hour > 21){
                time = hour + " ���� �����";
            }
            if (hour > 4 && hour < 21){
                time = hour + " ����� �����";
            }
        }
        else if (year == 0 && month == 0){
            if (day == 1){
                time = "����� � " + eventTimeArr[3] + ":" + eventTimeArr[4] ;
            }
            if (day == 31 || day == 21){
                time = day + " ���� �����";
            }
            if (day > 1 && day < 5 ||  day > 21 && day < 25){
                time = day + " ��� �����";
            }
            if (day > 4 &&  day < 21 || day > 24 &&  day < 31 ){
                time = day + " ���� �����";
            }
        }
        System.out.println(time);
        return time;
    }
}
