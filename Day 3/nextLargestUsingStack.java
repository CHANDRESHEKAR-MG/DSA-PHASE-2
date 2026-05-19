import java.util.Stack; 
class nextLargestUsingStack {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        int[] ans = nextLargest(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(ans[i]  + " ");
        }
    }

    public static int[] nextLargest(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] =-1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}