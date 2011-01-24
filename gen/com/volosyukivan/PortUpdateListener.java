/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/jan/projects/opensource/wifikeyboard/src/com/volosyukivan/PortUpdateListener.aidl
 */
package com.volosyukivan;
public interface PortUpdateListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.volosyukivan.PortUpdateListener
{
private static final java.lang.String DESCRIPTOR = "com.volosyukivan.PortUpdateListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.volosyukivan.PortUpdateListener interface,
 * generating a proxy if needed.
 */
public static com.volosyukivan.PortUpdateListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.volosyukivan.PortUpdateListener))) {
return ((com.volosyukivan.PortUpdateListener)iin);
}
return new com.volosyukivan.PortUpdateListener.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_portUpdated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.portUpdated(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.volosyukivan.PortUpdateListener
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public void portUpdated(int port) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(port);
mRemote.transact(Stub.TRANSACTION_portUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_portUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void portUpdated(int port) throws android.os.RemoteException;
}
