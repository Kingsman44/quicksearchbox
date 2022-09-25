package com.google.android.libraries.lens.sdk.p2038a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.libraries.lens.sdk.p2047d.C24933c;

/* renamed from: com.google.android.libraries.lens.sdk.a.f */
/* compiled from: PG */
public final /* synthetic */ class C24831f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24838m f67863a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f67864b;

    public /* synthetic */ C24831f(C24838m mVar, Bundle bundle) {
        this.f67863a = mVar;
        this.f67864b = bundle;
    }

    public final void run() {
        C24838m mVar = this.f67863a;
        Bundle bundle = this.f67864b;
        try {
            C24933c cVar = mVar.f67878e;
            cVar.getClass();
            cVar.mo30148c(bundle);
        } catch (RemoteException unused) {
            mVar.mo30039b();
        }
    }
}
