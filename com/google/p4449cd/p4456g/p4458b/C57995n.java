package com.google.p4449cd.p4456g.p4458b;

import com.google.common.base.C58832aw;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.cd.g.b.n */
/* compiled from: PG */
public final class C57995n extends C57989h {

    /* renamed from: a */
    private final AtomicReference f155068a;

    public C57995n(Object obj) {
        this.f155068a = new AtomicReference(obj);
    }

    /* renamed from: c */
    public final void mo54592c(Object obj) {
        synchronized (this.f155059g) {
            if (!this.f155061i) {
                return;
            }
            if (!C58832aw.m90831a(this.f155068a.getAndSet(obj), obj)) {
                mo54591h(obj);
            }
        }
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C57979e eVar;
        synchronized (this.f155059g) {
            C57988g gVar = new C57988g(this, aVar);
            aVar.mo20338d(gVar);
            gVar.mo54583c(this.f155068a.get());
            if (gVar.f155044c.get()) {
                if (this.f155061i) {
                    this.f155060h.add(gVar);
                } else {
                    Throwable th = this.f155062j;
                    if (th == null) {
                        gVar.mo54584d(false);
                    } else {
                        gVar.mo54585e(th);
                    }
                }
            }
            eVar = gVar.f155043b;
        }
        return eVar;
    }
}
