public class Triangle {

    public static List<Integer> selectionSort(List<Integer> list) {

        for (int i=1; i < list.size(); i++) {
            int min = list.get(0);
            int counter = i-1;

            // n-1個の中から最小値を発見し、カウンターに反映する
            // counter番目がn-1個の中で最小となる
            while (counter < list.size()) {
                if (list.get(counter) < min) {
                    min = list.get(counter);
                }
                counter++;
            }

            // n-1個の中の最小値とi番目の値を入れ替え
            int tmp = list.get(i-1);
            list.set(i, min);
            list.set(counter-1, tmp);

            System.out.println(min);
        }

        return list;
    }

    public static long factorial(long number) {
        if(number != 1) {
            number *= factorial(number - 1);
            return number;
        }

        return number;
    }

    /**
     * 渡された数字の2の指数を求める
     * @param target
     * @return
     */
    public static int defactor(int target) {
        if (target > 65535) {
            return 0;
        }

        // 2^0
        if (target == 1) {
            return target;
        }

        // 2^2以上
        if (target % 2 == 0) {
            System.out.println(target);
            target = defactor(target / 2);
            return target;
        }

        return target;
    }

    public static void main(String[] args) throws Exception{
        
        try {
            System.out.println(defactor(1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
