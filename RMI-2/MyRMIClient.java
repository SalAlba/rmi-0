import java.rmi.Naming;


public class MyRMIClient{

    public static void main(String[] args) throws Exception{
        System.setProperty("java.security.policy", "client.policy");
        if(System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());

        String url = "rmi://localhost/";
        MyRMIObject  obj = (MyRMIObject)Naming.lookup(url+"root");
        System.out.println(obj.getLowerCase("sAleM"));
    }
}