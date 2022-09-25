package com.google.p4449cd.p4456g.p4458b;

import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;

/* renamed from: com.google.cd.g.b.a */
/* compiled from: PG */
public class C57982a extends C57989h {
    /* renamed from: jJ */
    public C60870cx mo20440jJ(C57974a aVar) {
        C57979e eVar;
        synchronized (this.f155059g) {
            C57988g gVar = new C57988g(this, aVar);
            aVar.mo20338d(gVar);
            if (gVar.f155044c.get()) {
                if (this.f155061i) {
                    this.f155060h.add(gVar);
                } else {
                    Throwable th = this.f155062j;
                    if (th == null) {
                        Boolean bool = this.f155063k;
                        bool.getClass();
                        gVar.mo54584d(bool.booleanValue());
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
