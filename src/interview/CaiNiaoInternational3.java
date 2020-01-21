package interview;


import common.RandomUtil;

/**
 * N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉。
 * 然后再把这些数从小到大排序。
 * */
public class CaiNiaoInternational3 {

    public void sortArray(int n){
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++){
            int index = RandomUtil.getRandomSingle(n);
            array[index] = index;
        }
        for (int j = 0; j < array.length; j++){
            if (array[j] == null){
                continue;
            }
            System.out.println(array[j]);
        }
    }

}
