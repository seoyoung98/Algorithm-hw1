public class Nearest {
    public static void cal_distance(int x[], int y[]) {
        int dis[] = new int [(x.length*(x.length-1))/2];
        int n = 0;
        for(int i = 0; i < x.length-1; i++) {
            for(int j = i+1; j<x.length;j++) {
                int result = (x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]);
                System.out.println(i + " , " + j + " -> " + result);
                dis[n++] = result;
            }
        }
        Nearest.find_closest(dis);
    }
    public static void find_closest(int A[]) {
        double min = A[0];
        for(int i = 1; i < A.length; i++) {
            if(min > A[i]) min = A[i];
        }
        System.out.println("가장 가까운 점들의 거리(제곱상태)는 "+ min);
    }
    public static void main(String args[]) {
        int x[] = {1,8,4,6,3};
        int y[] = {10,3,8,22,16};

        Nearest.cal_distance(x,y);
    }
}
