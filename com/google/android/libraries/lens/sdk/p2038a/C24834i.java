package com.google.android.libraries.lens.sdk.p2038a;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.lens.sdk.p2047d.C24933c;

/* renamed from: com.google.android.libraries.lens.sdk.a.i */
/* compiled from: PG */
public final /* synthetic */ class C24834i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24838m f67869a;

    public /* synthetic */ C24834i(C24838m mVar) {
        this.f67869a = mVar;
    }

    public final void run() {
        C24838m mVar = this.f67869a;
        Log.d("LensSdk", "Unbinding from Lens service.");
        if (mVar.f67877d != 4) {
            Log.d("LensSdk", "Lens service isn't started.");
        } else {
            try {
                C24933c cVar = mVar.f67878e;
                cVar.getClass();
                cVar.mo30147b();
            } catch (RemoteException | SecurityException e) {
                Log.e("LensSdk", "Unable to detach.", e);
            }
            mVar.f67878e = null;
        }
        int i = mVar.f67877d;
        if (C24838m.m45963e(i)) {
            try {
                Log.d("LensSdk", String.format("Current state is %s.", new Object[]{C24838m.m45962a(i)}));
                mVar.f67876c.unbindService(mVar);
            } catch (IllegalArgumentException e2) {
                Log.e("LensSdk", "Error occurred when unbinding.", e2);
            }
            mVar.f67878e = null;
        } else {
            Log.d("LensSdk", "Lens service isn't bound.");
        }
        mVar.f67875b.clear();
        mVar.f67874a.clear();
        mVar.mo30041d(1);
    }
}
