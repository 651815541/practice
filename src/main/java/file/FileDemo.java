package file;

import java.io.File;

public class FileDemo {

    void getNameDemo(){
        File file = new File("./getname.txt");

        String name = file.getName();
        System.out.println(name);//getname.txt

        long length = file.length();
        System.out.println(length);//0

        boolean cr = file.canRead();
        System.out.println("可读:"+cr);
        boolean cw = file.canWrite();
        System.out.println("可写:"+cw);

        boolean ih = file.isHidden();
        System.out.println("隐藏文件:"+ih);

    }

    public static void main(String[] args) {

        FileDemo file = new FileDemo();
        file.getNameDemo();

    }
}
