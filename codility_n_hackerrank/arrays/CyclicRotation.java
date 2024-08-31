package codility_n_hackerrank.arrays;

public class CyclicRotation {
    /**
     * Rotation of the array means that each element is shifted right by one index,
     * and the last element of the array is moved to the first place
     *
     * @param A: an array of N integers
     * @param K: number of times to rotate the array
     * @return: the array A after undergoing rotation
     */
    public int [] solution(int A[], int K) {
        int N, last_elem, itr, temp;

        N = A.length;
        itr = 0;
        while (itr < K) {
            last_elem = A[N - 1];
            for (int i = 0; i < (N - 1); i ++) {
                temp = N - i - 1;
                A[temp] = A[temp - 1];
            }
            A[0] = last_elem;
            itr += 1;
        }

        return (A);
    }

}
