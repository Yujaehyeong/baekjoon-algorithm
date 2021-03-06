package p2021.p07.p07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11663 {

    static int n;
    static int m;
    static long[] points;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        points = new long[n];
        s = br.readLine();
        st = new StringTokenizer(s, " ");

        for (int i = 0; i < n; i++) {
            points[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(points);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            int result = binarySearch(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            sb.append(result).append('\n');
        }

        System.out.println(sb.toString().trim());

    }

    static int binarySearch(int start, int end) {
        int left = 0;
        int right = points.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (points[mid] > end) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        int endIndex = right + 1;

        left = 0;
        right = points.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (points[mid] < start) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        int startIndex = left;

        return endIndex - startIndex;
    }
}
