package com.google.android.libraries.lens.sdk.p2038a;

import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.android.libraries.lens.sdk.a.g */
/* compiled from: PG */
public final /* synthetic */ class C24832g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24838m f67865a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f67866b;

    public /* synthetic */ C24832g(C24838m mVar, Bundle bundle) {
        this.f67865a = mVar;
        this.f67866b = bundle;
    }

    public final void run() {
        C24838m mVar = this.f67865a;
        Bundle bundle = this.f67866b;
        int i = mVar.f67877d;
        if (!C24838m.m45963e(i) || C24838m.m45965g(i)) {
            Log.w("LensSdk", "ServiceEvent received after connection disposed.");
            return;
        }
        for (C24839n nVar : mVar.f67875b) {
            nVar.f67881a.mo30044b(bundle);
        }
    }
}
