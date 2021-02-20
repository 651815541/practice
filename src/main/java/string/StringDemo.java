package string;

public class StringDemo {
    /**
     * 返回当前字符串长度（字符个数）
     */
    void lengthDemo(){
        String str = "我爱java！";
        System.out.println(str.length());//7
    }

    /**
     * 检索并返回给定在当前字符串中的位置，如果当前字符串
     * 不包含给定内容，返回值为-1
     */
    void indexOfDemo(){
        String str="thinking in java";
        //检索“in"第一次出现的位置
        int index = str.indexOf("in");
        System.out.println(index);//2
        //检索 in 在str中从第四个字符开始后第一次出现的位置
        index=str.indexOf("in",3);
        System.out.println(index);//5
        //检索in在str中最后一次出现的位置
        index=str.lastIndexOf("in");
        System.out.println(index);//9
    }

    /**
     * 截取当前字符串指定范围的字符串，截取时含头不含尾
     * 只有一个参数时是从该位置截取到末尾
     */
    void substringDemo(){
        String str = "www.baidu.com";

        String sub = str.substring(4,9);
        System.out.println(sub);//baidu

        sub=str.substring(4);
        System.out.println(sub);//baidu.com
    }

    /**
     * 返回当前字符串中指定位置的字符
     */
    void charAtDemo(){
        String str = "hello world";

        char c = str.charAt(7);
        System.out.println(c);//o
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    /**
     * 去除字符串两端的空白字符
     */
    void trimDemo(){
        String str = "   hello  dhgfahg    ";
                                //括号内为输出值
        System.out.println(str);//(   hello  dhgfahg    )
        String trim = str.trim();
        System.out.println(trim);//(hello  dhgfahg)
    }

    /**
     * 将当前字符串英文部分转换为全大写或全小写
     */
    void toUpperCase_toLowerCase(){
        String str = "你好Java";

        String upper = str.toUpperCase();
        System.out.println(upper);//你好JAVA

        String lower = str.toLowerCase();
        System.out.println(lower);//你好java

        //验证码比对
        String code = "As45h";
        String input = "aS45H";

//        String c = code.toUpperCase();
//        String i = code.toUpperCase();

        String c = code.toLowerCase();
        String i = code.toLowerCase();

        if(i.equals(c)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }

    /**
     * 判断当前字符串是否是以给定的内容开始的或者结束的
     */
    void startsWith_endsWithDemo(){
        String str = "http://www.tedu.cn";

        boolean starts = str.startsWith("http//");
        System.out.println(starts);//false

        boolean ends = str.endsWith(".cn");
        System.out.println(ends);//true
    }

    /**
     * 将给定的类型转换为字符串
     */
    void valueOfDemo(){
        int i = 155;
        double d = 16.64453;
        float f = 1.544554f;
        int[] arr = new int[]{115,8454,5454,1245,1535,315,2153,51451,132153,13135,135135,353354};

        String str = String.valueOf(i);
        System.out.println(str);
        str = String.valueOf(d);
        System.out.println(str);
        str = String.valueOf(f);
        System.out.println(str);
        str = String.valueOf(arr[0]);
        System.out.println(str);


    }

    public static void main(String[] args) {
            StringDemo string = new StringDemo();
            string.lengthDemo();
            string.indexOfDemo();
            string.substringDemo();
            string.charAtDemo();
            string.trimDemo();
            string.toUpperCase_toLowerCase();
            string.startsWith_endsWithDemo();
            string.valueOfDemo();
    }
}


