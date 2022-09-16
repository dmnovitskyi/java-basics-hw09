import java.util.HashSet;
import java.util.Set;


public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        Set<String> result = new HashSet<>();
        for (String x : array1) {
            for (String y :array2) {
                if (x.contains(y)) {
                    result.add(x);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}