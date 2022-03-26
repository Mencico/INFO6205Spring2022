import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q1 {
    class Solution {
        public List<String> findMissingRanges(int[] nums, int lower, int upper) {
            List<String> result = new ArrayList<>();
            int prev = lower - 1;
            for (int i = 0; i <= nums.length; i++) {
                int curr = (i < nums.length) ? nums[i] : upper + 1;
                if (prev + 1 <= curr - 1) {
                    result.add(formatRange(prev + 1, curr - 1));
                }
                prev = curr;
            }
            return result;
        }

        private String formatRange(int lower, int upper) {
            if (lower == upper) {
                return String.valueOf(lower);
            }
            return lower + "->" + upper;
        }
    }

    }





