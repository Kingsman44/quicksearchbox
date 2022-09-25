package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* compiled from: PG */
public abstract class C143818g {

    /* renamed from: c */
    public final int f389875c;

    public C143818g(int i) {
        this.f389875c = i;
    }

    /* renamed from: h */
    public static Status m233739h(RemoteException remoteException) {
        return new Status(1, 19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), (PendingIntent) null, (ConnectionResult) null);
    }

    /* renamed from: d */
    public abstract void mo119169d(Status status);

    /* renamed from: e */
    public abstract void mo119170e(Exception exc);

    /* renamed from: f */
    public abstract void mo119171f(C143763bk bkVar);

    /* renamed from: g */
    public abstract void mo119172g(C143729ad adVar, boolean z);
}
