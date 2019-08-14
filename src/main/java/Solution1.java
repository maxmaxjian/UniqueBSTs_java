import java.util.HashMap;
import java.util.Map;

public class Solution1 implements Solution {
    private Map<Integer,Integer> map = new HashMap<>();
    @Override
    public int numTrees(int n) {

        if (!map.containsKey(n)) {
            int result;
            if (n == 0) {
                result = 1;
            } else if (n == 1) {
                result = 1;
            } else if (n == 2) {
                result = 2;
            } else {
                int res = 0;
                for (int i = 1; i <= n; i++) {
                    res += numTrees(n - i) * numTrees(i - 1);
                }
                result = res;
            }
            map.put(n, result);
        }
        return map.get(n);
    }
}
