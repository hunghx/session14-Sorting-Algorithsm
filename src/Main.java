import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Bubble Sort
        int[] arr = {3,6,9,4,6,2};
        // vòng lặp để chọn phần tưr lớn nhất và đưa nó đến cuối cùng
//        for (int i = 1; i < arr.length; i++) {
//            // thuật toán so sánh giá trị của 2 phần liền kề để đưa giá trị lớn nhất về cuối
//            // lần 1 : i=0
//            // lần 2 : i=1
//            // lần 2 : i=2
//            for (int j = 0; j < arr.length-i; j++) {
//                // kiểm tra điều kiện và đổi đỗ nếu cần
//                if(arr[j]<  arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        // selection sort
        //   [2,4,5,6,8,9] [] - hien hanh /min=, indexMin=4 / i=5
        // tốn length -1 lần lặp
//        for (int i = 0; i < arr.length-1; i++) {
//            // tìm min/max tỏng danh sách hiện hành
//            int max = arr[i];
//            int indexMax = i;
            // i = 0 - length
            // i = 1 - length -1
            // i = 2 - length -2
            // ...
            // i = length-2  -  2
            // chỉ còn 1 phần tử trong mảng
//            for (int j = i+1; j < arr.length; j++) {
//                // tìm ra giá trị nhỏ nhất trong mảng
//                if(max < arr[j]){
//                    max = arr[j];
//                    indexMax= j;
//                }
//            }
//            // đổi chỗ với phần tử đầu của danh sách hiện hành
//            if(indexMax != i){
//                // khác vị trí min thì mới cho đổi chỗ
//                arr[indexMax] = arr[i];
//                arr[i] = max;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        //  {2,3,4,6,6,9};
        // Insertion sort
        for (int i = 1; i < arr.length; i++) {
            // thiết lập giá trị hiện tại cần chèn
            int current = arr[i];
            int j =0;
            for (j = i-1; j >=0 && arr[j]< current ; j--) {
                    arr[j+1]= arr[j];
            }
            arr[j+1] = current;
        }
        System.out.println(Arrays.toString(arr));
        // C *(ax+b) = dx+e
        // (ax+b) O(x)  (ax2+bx+c) O(x2)  = ax2+bx+c
    }
}