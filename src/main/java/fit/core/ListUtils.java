package fit.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListUtils {

    public static <T> List<T> sort(List<T> items, Comparator<T> comp){
        var sorted = new ArrayList<T>(List.copyOf(items));
        sorted.sort(comp);
        return sorted;
    }
}
