package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.i */
/* compiled from: PG */
public final /* synthetic */ class C95613i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95615k f267583a;

    /* renamed from: b */
    public final /* synthetic */ int f267584b;

    public /* synthetic */ C95613i(C95615k kVar, int i) {
        this.f267583a = kVar;
        this.f267584b = i;
    }

    public final void run() {
        boolean z;
        C95615k kVar = this.f267583a;
        int i = this.f267584b;
        if (!kVar.f267596i.get()) {
            synchronized (kVar.f267588a) {
                z = false;
                if (kVar.f267590c && (i & 2) != 2) {
                    z = true;
                }
            }
            if (z) {
                kVar.mo89568h();
            }
        }
    }
}
