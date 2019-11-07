public class Triangle {

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
