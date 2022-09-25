package com.google.android.libraries.lens.p1995c.p1996a;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.C84205e;
import com.google.android.apps.gsa.publicsearch.C84209i;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.c.a.n */
/* compiled from: PG */
public final /* synthetic */ class C24086n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24091s f65784a;

    /* renamed from: b */
    public final /* synthetic */ C84205e f65785b;

    public /* synthetic */ C24086n(C24091s sVar, C84205e eVar) {
        this.f65784a = sVar;
        this.f65785b = eVar;
    }

    public final void run() {
        C24091s sVar = this.f65784a;
        try {
            C84209i f = this.f65785b.mo77678f("LENS_SERVICE_SESSION", sVar);
            Executor executor = sVar.f65792a;
            ((C24090r) executor).f65791a.post(new C24084l(sVar, f));
        } catch (RemoteException e) {
            Log.w("LensServiceConnImpl", "Failed to create a Lens service session.", e);
            Executor executor2 = sVar.f65792a;
            ((C24090r) executor2).f65791a.post(new C24085m(sVar));
        }
    }
}
