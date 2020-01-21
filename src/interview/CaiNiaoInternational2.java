package interview;


/**
 * 一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 求第30位数是多少， 用递归算法实现。
 *
 * 规则为 所求项为前两项之和 初始条件为 第一项和第二项为1
 * */
public class CaiNiaoInternational2 {

    public int getNumber(int n){
        if (n < 1){
            throw new RuntimeException("n must be a natural number!");
        }else if(n < 3){
            return 1;
        }else{
            return getNumber(n - 1) + getNumber(n - 2);
        }
    }

}
