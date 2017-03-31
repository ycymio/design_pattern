package pers.ycymio.adapter.implement;

public class Client {
    public static void main(String[] args) {
//         Target adapter = new ClassAdapter(); 
    	Target adapter = new ComponentAdapter(new Adaptee());
         //通过适配器调用特殊功能
         adapter.request();  
    }
}