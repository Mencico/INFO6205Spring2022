import java.util.Arrays;

public class Q3 {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);

        int i = 0;
        while (i < citations.length && citations[citations.length - 1 - i] > i) {
            i++;
        }
        return i;
    }
}

