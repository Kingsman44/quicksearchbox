package com.google.android.gms.learning.dynamite.proxy;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143773bu;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.b */
/* compiled from: PG */
public final /* synthetic */ class C144632b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143773bu f391340a;

    public /* synthetic */ C144632b(C143773bu buVar) {
        this.f391340a = buVar;
    }

    public final void run() {
        try {
            this.f391340a.mo117762a(new Status(1, 0, (String) null, (PendingIntent) null, (ConnectionResult) null));
        } catch (RemoteException e) {
            Log.w("ExmplStrChkngIterator", "Failed to call close IStatusCallback", e);
        }
    }
}
