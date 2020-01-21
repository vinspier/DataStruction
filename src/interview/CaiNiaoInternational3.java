package interview;


import common.RandomUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    /**
     * 使用jdk8的新特性
     * */
    public void sortArray1(int n){
        List<Integer> targetList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int x=(int)(Math.random()*1000);
            targetList.add(x);
        }
        System.out.println("before filter :" + targetList);
        List<Integer> resultList = targetList.stream()
                .distinct().sorted().collect(Collectors.toList());
        System.out.println("after filter :" + resultList);
    }

}
