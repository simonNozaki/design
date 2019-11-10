import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Integer> selectionSort(List<Integer> list) {

        for (int i=0; i < list.size(); i++) {
            int min = list.get(i);
            int counter = 0;

            // n-1個の中から最小値を発見し、カウンターに反映する
            for(int j=i+1; j < list.size(); j++) {
                // i番目より右で最小値があれば、値と番号を更新する
                if (list.get(j) < min) {
                    min = list.get(j);
                    counter = j;
                }
            }

            // n-1個の中の最小値とi番目の値を入れ替え
            int tmp = list.get(i);
            list.set(i, min);
            list.set(counter, tmp);
        }

        return list;
    }

    /**
     * 挿入ソート
     */
    public static List<Integer> insertionSort(List<Integer> list) {
        
        for(int j=1; j < list.size(); j++) {
            int key = list.get(j);
            int i = j-1;

            while(i > 0 && list.get(i) < key) {
                int tmp = list.get(i);
                list.set(i, list.get(i+1));
                list.set(i+1, tmp);

                i -= 1;
            }

            // 最後先頭要素のみ入れ替え
            if(list.get(0) < list.get(1)) {
                int tmp = list.get(0);
                list.set(i, list.get(1));
                list.set(i+1, tmp);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = insertionSort(Arrays.asList(5, 2, 4, 6, 1, 3));
        System.out.println(list.toString());

        List<Integer> list2 = selectionSort(Arrays.asList(9, 4, 0, 3, 7, 2, 6));
        System.out.println(list2.toString());
    }
}