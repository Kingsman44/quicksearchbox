package com.google.frameworks.client.data.android.p4641h;

import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.C70898m;

/* renamed from: com.google.frameworks.client.data.android.h.l */
/* compiled from: PG */
public final /* synthetic */ class C61491l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61471ad f166246a;

    /* renamed from: b */
    public final /* synthetic */ String f166247b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f166248c;

    public /* synthetic */ C61491l(C61471ad adVar, String str, Throwable th) {
        this.f166246a = adVar;
        this.f166247b = str;
        this.f166248c = th;
    }

    public final void run() {
        C61471ad adVar = this.f166246a;
        String str = this.f166247b;
        Throwable th = this.f166248c;
        for (C60870cx cancel : adVar.f166186b) {
            cancel.cancel(true);
        }
        C70898m mVar = adVar.f166194j;
        if (mVar != null) {
            mVar.mo27480d(str, th);
        }
    }
}
