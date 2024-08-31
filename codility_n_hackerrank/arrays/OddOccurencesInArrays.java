package codility_n_hackerrank.arrays;

import java.util.HashMap;

public class OddOccurencesInArrays {
    /**
     * A non-empty array A consisting of N integers is given
     * N is odd
     * and each element of the array can be paired
     * with another element that has the same value
     * except for one element that is left unpaired
     */
    public int solution(int[] A) {
        int N, ptr, itr;
        HashMap<Integer, Boolean> found_pairs = new HashMap<Integer, Boolean>();

        ptr = 0;
        itr = 1;
        N = A.length;
        while (itr < N) {
            if (found_pairs.containsKey(A[ptr])) {
                ptr += 1;
                itr = ptr + 1;
                continue;
            }
            if (A[ptr] == A[itr]) {
                found_pairs.put(A[ptr], true);
                ptr += 1;
                itr = ptr + 1;
                continue;
            }
            if (itr == (N - 1)) {
                return (A[ptr]);
            }
            itr += 1;
        }

        return (A[ptr]);
    }
}
