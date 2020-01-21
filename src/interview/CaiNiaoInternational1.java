package interview;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (storeMap.containsKey(s.charAt(i))){
                storeMap.put(c,storeMap.get(c) + 1);
            }else{
                storeMap.put(c,1);
            }
            if (storeMap.get(c) > appearMost){
                appearMost = storeMap.get(c);
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

    /**
     * 使用jdk8的新特性
     * */
    public void  filterCharAppearMost1(String targetStr){
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < targetStr.length(); i++) {
            char c = targetStr.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        Integer max = map.values().stream().reduce(Integer::max).get();
        List<Character> list = map.keySet()
                .stream()
                .filter(key -> map.get(key).equals(max))
                .collect(Collectors.toList());
        for (Character character : list) {
            targetStr = targetStr.replace(character.toString(),"");
        }
        System.out.println(targetStr);
    }
}
