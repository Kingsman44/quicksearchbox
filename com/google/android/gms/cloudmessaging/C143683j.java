package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.android.gms.cloudmessaging.j */
/* compiled from: PG */
final class C143683j {

    /* renamed from: a */
    public final Messenger f389538a;

    /* renamed from: b */
    public final CloudMessagingMessengerCompat f389539b;

    public C143683j(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f389538a = new Messenger(iBinder);
            this.f389539b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f389539b = new CloudMessagingMessengerCompat(iBinder);
            this.f389538a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }
}
