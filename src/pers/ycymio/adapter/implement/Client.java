package pers.ycymio.adapter.implement;

public class Client {
    public static void main(String[] args) {
//         Target adapter = new ClassAdapter(); 
    	Target adapter = new ComponentAdapter(new Adaptee());
         //ͨ���������������⹦��
         adapter.request();  
    }
}