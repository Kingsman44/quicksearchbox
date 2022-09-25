package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.b */
/* compiled from: PG */
final class C100148b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f280037a;

    /* renamed from: b */
    final /* synthetic */ C100175c f280038b;

    public C100148b(C100175c cVar, C60870cx cxVar) {
        this.f280038b = cVar;
        this.f280037a = cxVar;
    }

    public final void run() {
        if (!this.f280037a.isCancelled()) {
            this.f280038b.f280113a.clear();
            return;
        }
        for (Runnable run : this.f280038b.f280113a) {
            run.run();
        }
        this.f280038b.f280113a.clear();
    }
}
