package interview;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 删除一个字符串中出现次数最多的字符，如果多个字符出现次数一样，则都删除。要求字符顺序不变。
 * */
public class CaiNiaoInternational1 {

    /** 解题思路
     * 1、遍历字符串 存入到linkedHashMap中 并计算出现的字符串
     * 2、存储一个哨兵 记录字符串出现次数最多的数值
     * 3、遍历HashMap 与哨兵比较 若相等 则过滤掉该字符
     *
     * */

    public void  filterCharAppearMost(String s){
        System.out.println("before filter character : " + s);
        System.out.println(" ============================================ ");
        int appearMost = 0;
        Map<Character,Integer> storeMap = new LinkedHashMap<>();
        Integer temp;
        for (int i = 0; i < s.length(); i++){
            temp = storeMap.get(s.charAt(i));
            if (temp == null){
                temp = 1;
            }else{
                ++temp;
            }
            storeMap.put(s.charAt(i),++temp);
            if (temp > appearMost){
                appearMost = temp;
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character key : storeMap.keySet()){
            if (storeMap.get(key) >= appearMost){
                s = s.replaceAll("" + key ,"");
                continue;
            }
            result.append(key);
        }
        System.out.println("after filter character : " + s);
    }
}
