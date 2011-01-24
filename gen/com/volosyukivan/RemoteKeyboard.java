/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/jan/projects/opensource/wifikeyboard/src/com/volosyukivan/RemoteKeyboard.aidl
 */
package com.volosyukivan;
// Declare the interface.

public interface RemoteKeyboard extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.volosyukivan.RemoteKeyboard
{
private static final java.lang.String DESCRIPTOR = "com.volosyukivan.RemoteKeyboard";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.volosyukivan.RemoteKeyboard interface,
 * generating a proxy if needed.
 */
public static com.volosyukivan.RemoteKeyboard asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.volosyukivan.RemoteKeyboard))) {
return ((com.volosyukivan.RemoteKeyboard)iin);
}
return new com.volosyukivan.RemoteKeyboard.Stub.Proxy(obj);
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
case TRANSACTION_registerKeyListener:
{
data.enforceInterface(DESCRIPTOR);
com.volosyukivan.RemoteKeyListener _arg0;
_arg0 = com.volosyukivan.RemoteKeyListener.Stub.asInterface(data.readStrongBinder());
this.registerKeyListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterKeyListener:
{
data.enforceInterface(DESCRIPTOR);
com.volosyukivan.RemoteKeyListener _arg0;
_arg0 = com.volosyukivan.RemoteKeyListener.Stub.asInterface(data.readStrongBinder());
this.unregisterKeyListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setPortUpdateListener:
{
data.enforceInterface(DESCRIPTOR);
com.volosyukivan.PortUpdateListener _arg0;
_arg0 = com.volosyukivan.PortUpdateListener.Stub.asInterface(data.readStrongBinder());
this.setPortUpdateListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startTextEdit:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.startTextEdit(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_stopTextEdit:
{
data.enforceInterface(DESCRIPTOR);
this.stopTextEdit();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.volosyukivan.RemoteKeyboard
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
public void registerKeyListener(com.volosyukivan.RemoteKeyListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerKeyListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void unregisterKeyListener(com.volosyukivan.RemoteKeyListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterKeyListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setPortUpdateListener(com.volosyukivan.PortUpdateListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setPortUpdateListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void startTextEdit(java.lang.String content) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(content);
mRemote.transact(Stub.TRANSACTION_startTextEdit, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void stopTextEdit() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopTextEdit, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerKeyListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterKeyListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setPortUpdateListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startTextEdit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_stopTextEdit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void registerKeyListener(com.volosyukivan.RemoteKeyListener listener) throws android.os.RemoteException;
public void unregisterKeyListener(com.volosyukivan.RemoteKeyListener listener) throws android.os.RemoteException;
public void setPortUpdateListener(com.volosyukivan.PortUpdateListener listener) throws android.os.RemoteException;
public void startTextEdit(java.lang.String content) throws android.os.RemoteException;
public void stopTextEdit() throws android.os.RemoteException;
}
