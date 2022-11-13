public class Hwork1 {
        public static void main(String[] arg) {
            String str = "123";
            String str1 = "123";
            String str2 = new String("123");
            System.out.println(str == str1);
            System.out.println(str == str2);
            int[] clear;
        }
}
//String str = "123";
//String str1 = "123";str和str1储存的值相同,所以System.out.println(str == str1)输出结果为ture
//String str2 = new String("123");在堆空间开辟一个新的空间,创建两个对象,一个是堆空间的new结构,二是常量池中的数据
//                                但str2种储存的是堆中的地址,所以System.out.println(str == str2)输出结果为false