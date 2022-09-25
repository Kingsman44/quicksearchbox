package com.google.android.libraries.lens.sdk.p2038a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.libraries.lens.sdk.p2047d.C24933c;

/* renamed from: com.google.android.libraries.lens.sdk.a.e */
/* compiled from: PG */
public final /* synthetic */ class C24830e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24838m f67861a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f67862b;

    public /* synthetic */ C24830e(C24838m mVar, Bundle bundle) {
        this.f67861a = mVar;
        this.f67862b = bundle;
    }

    public final void run() {
        C24838m mVar = this.f67861a;
        Bundle bundle = this.f67862b;
        try {
            if (C24838m.m45964f(mVar.f67877d)) {
                C24933c cVar = mVar.f67878e;
                cVar.getClass();
                cVar.mo30148c(bundle);
                return;
            }
            mVar.f67874a.add(new C24831f(mVar, bundle));
        } catch (RemoteException unused) {
            mVar.mo30039b();
        }
    }
}
