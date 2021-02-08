package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendenceHelper {
  public static Map<String, Boolean> random(int students, int percentage){
    Map<String, Boolean> attendanceList = new HashMap<>(); 

  int totalPresence = (int)Math.ceil(students * (percentage/100.00));

  for(int i = 0; i < students; i++) {
    boolean present = i < totalPresence;
    attendanceList.put("" + i, present);
  }

    return attendanceList;

  }
}