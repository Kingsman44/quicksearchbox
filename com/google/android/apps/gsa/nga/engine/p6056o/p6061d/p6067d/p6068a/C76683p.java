package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.p6068a;

import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.d.a.p */
/* compiled from: PG */
final class C76683p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60870cx f211970a;

    /* renamed from: b */
    final /* synthetic */ Runnable f211971b;

    public C76683p(C60870cx cxVar, Runnable runnable) {
        this.f211970a = cxVar;
        this.f211971b = runnable;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (this.f211970a.isCancelled()) {
            this.f211971b.run();
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
    }
}
