package com.google.android.apps.gsa.p8889z.p8893c.p8901h;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57988g;
import com.google.p4449cd.p4456g.p4458b.C57989h;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.z.c.h.q */
/* compiled from: PG */
public final class C118934q extends C57989h {

    /* renamed from: a */
    public final C57981b f331708a;

    /* renamed from: b */
    private final Executor f331709b;

    /* renamed from: c */
    private final C60870cx f331710c;

    public C118934q(Executor executor, C60870cx cxVar, C57981b bVar) {
        this.f331709b = executor;
        this.f331710c = cxVar;
        this.f331708a = bVar;
    }

    /* renamed from: c */
    public final void mo104074c(Throwable th) {
        mo54590g(th);
        this.f331708a.mo20388jK();
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        synchronized (this.f155059g) {
            C57988g gVar = new C57988g(this, aVar);
            aVar.mo20338d(gVar);
            if (gVar.f155044c.get()) {
                if (!this.f155061i || !this.f155060h.isEmpty()) {
                    Throwable th = this.f155062j;
                    if (th == null) {
                        gVar.mo54584d(true);
                        C57979e eVar = gVar.f155043b;
                        return eVar;
                    }
                    gVar.mo54585e(th);
                    C57979e eVar2 = gVar.f155043b;
                    return eVar2;
                }
                this.f155060h.add(gVar);
            }
            C57979e eVar3 = gVar.f155043b;
            C60856cj.m92911t(this.f331710c, new C118932o(this), this.f331709b);
            return eVar3;
        }
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        this.f331710c.cancel(true);
        this.f331708a.mo20388jK();
        mo54589f(true);
    }
}
