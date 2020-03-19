package com.exercises.algoritmos;

public class TimeConvertion {
	
	
	static String convert12To24(String s) {
		String [] time = s.split(":");       
        int hour = Integer.parseInt(time[0]);        
        
        String period = time[2].substring(2,4);
        time[2]=time[2].substring(0,2);
        
        switch(period){
            case "AM":
                if(time[0].equals("12")) {
                    time[0]="00";
                }else{
                    if (hour>=1 && hour<10){
                        time[0]= "0" + hour;
                    }
                }   
                break;
            case "PM":
                 if (hour >= 1 && hour<12){
                     hour += 12;
                     time[0]= Integer.toString(hour);
                 }
                break;
            default:
                System.out.println("This is not a time in 12 hrs format");    
        }

        //String time24 = time[0] + ":" + time[1] + ":" + time[2];
        //return time24;
        
        return String.join(":", time);
	}
}
