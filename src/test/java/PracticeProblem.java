public class PracticeProblem {

    public static void main(String[] args) {
       
    }

    public static boolean validIndex(int[] arr, int idx) {
        try {
            int ignore = arr[idx];   
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            return 0;
        }
    }

    public static int safeConvertStringtoInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return 0;
        }
    }
}
