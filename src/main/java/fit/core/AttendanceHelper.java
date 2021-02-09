package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {
    public static Map<String, Boolean> random2(int amount, int percentage) {
        int result = (amount * percentage) / 100;

        Map<String, Boolean> listUser = new HashMap<>();

        for (int i = 0; i < result; i++) {
            listUser.put("user" + i, true);
        }

        for (int i = 0; i < amount - result; i++) {
            listUser.put("userTotal" + i, false);
        }


        return listUser;
    }

    public static Map<String, Boolean> random(int students, int presentPercentile) {
        Map<String, Boolean> attendanceList = new HashMap<>();

        int totalPresence = (int)Math.ceil(students * (presentPercentile / 100.00));

        for (int i = 0; i < totalPresence; i++) {
            boolean present = i < totalPresence;
            attendanceList.put("" + i, present);
        }

        return attendanceList;
    }
}
