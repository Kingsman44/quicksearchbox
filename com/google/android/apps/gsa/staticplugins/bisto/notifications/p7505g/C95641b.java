package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7505g;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.g.b */
/* compiled from: PG */
public final /* synthetic */ class C95641b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95642c f267682a;

    public /* synthetic */ C95641b(C95642c cVar) {
        this.f267682a = cVar;
    }

    public final void run() {
        C95642c cVar = this.f267682a;
        synchronized (cVar) {
            if (!cVar.f267684a) {
                cVar.mo89603b();
                cVar.mo89605c();
            }
        }
    }
}
