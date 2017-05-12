import java.rmi.Naming;

public class MyRMIServer{

    public static void main(String[] args) throws Exception{
        MyRMIObject obj = new MyRMIObjectImpl();
        
        Naming.rebind("root", obj);
    }
}