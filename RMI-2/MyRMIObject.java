import java.rmi.Remote;
import java.rmi.RemoteException;

interface MyRMIObject extends Remote{
    public String getLowerCase(String str) throws RemoteException;
}