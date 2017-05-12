import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRMIObjectImpl extends UnicastRemoteObject implements MyRMIObject{

    // private num

    // requier
    public MyRMIObjectImpl() throws RemoteException{}

    //
    @Override
    public String getLowerCase(String str) throws RemoteException{
        return str.toLowerCase();
    }
}