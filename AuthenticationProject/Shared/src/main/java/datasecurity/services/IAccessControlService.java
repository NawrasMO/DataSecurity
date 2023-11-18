package datasecurity.services;

import model.Permission;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IAccessControlService extends Serializable, Remote {
     boolean checkPermission(String username, Permission operation) throws RemoteException;
}