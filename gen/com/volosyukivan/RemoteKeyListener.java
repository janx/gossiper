/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/jan/projects/opensource/wifikeyboard/src/com/volosyukivan/RemoteKeyListener.aidl
 */
package com.volosyukivan;
public interface RemoteKeyListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.volosyukivan.RemoteKeyListener
{
private static final java.lang.String DESCRIPTOR = "com.volosyukivan.RemoteKeyListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.volosyukivan.RemoteKeyListener interface,
 * generating a proxy if needed.
 */
public static com.volosyukivan.RemoteKeyListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.volosyukivan.RemoteKeyListener))) {
return ((com.volosyukivan.RemoteKeyListener)iin);
}
return new com.volosyukivan.RemoteKeyListener.Stub.Proxy(obj);
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
case TRANSACTION_keyEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.keyEvent(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_charEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.charEvent(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setText:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.setText(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getText:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getText();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.volosyukivan.RemoteKeyListener
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
public void keyEvent(int code, boolean pressed) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
_data.writeInt(((pressed)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_keyEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void charEvent(int code) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(code);
mRemote.transact(Stub.TRANSACTION_charEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean setText(java.lang.String text) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(text);
mRemote.transact(Stub.TRANSACTION_setText, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getText() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getText, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_keyEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_charEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void keyEvent(int code, boolean pressed) throws android.os.RemoteException;
public void charEvent(int code) throws android.os.RemoteException;
public boolean setText(java.lang.String text) throws android.os.RemoteException;
public java.lang.String getText() throws android.os.RemoteException;
}
