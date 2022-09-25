package com.google.android.libraries.gsa.conversation.clientop.p1845e;

import com.google.android.libraries.gsa.conversation.p1837a.C22327h;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.e.k */
/* compiled from: PG */
final class C22445k implements C22327h {

    /* renamed from: a */
    private final C22720x f61977a;

    /* renamed from: b */
    private final AtomicBoolean f61978b = new AtomicBoolean(false);

    public C22445k(C22720x xVar) {
        this.f61977a = xVar;
    }

    /* renamed from: a */
    public final void mo27553a() {
        if (this.f61978b.getAndSet(false)) {
            this.f61977a.mo27828u();
        }
    }

    /* renamed from: b */
    public final void mo27554b() {
        if (this.f61978b.getAndSet(false)) {
            this.f61977a.mo27828u();
        }
    }

    /* renamed from: c */
    public final void mo27555c(Throwable th) {
        if (this.f61978b.getAndSet(false)) {
            this.f61977a.mo27828u();
        }
    }

    /* renamed from: d */
    public final void mo27556d() {
        if (!this.f61978b.getAndSet(true)) {
            this.f61977a.mo27819g();
        }
    }
}
