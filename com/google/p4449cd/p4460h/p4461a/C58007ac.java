package com.google.p4449cd.p4460h.p4461a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;

/* renamed from: com.google.cd.h.a.ac */
/* compiled from: PG */
final class C58007ac implements C57974a {

    /* renamed from: a */
    private final C58038y f155085a;

    public C58007ac(C58038y yVar) {
        this.f155085a = yVar;
    }

    /* renamed from: c */
    public final void mo20337c(Object obj) {
        this.f155085a.mo54613d(new C58039z(2, (C57996c) null, C58833ax.m90834k(obj), (Boolean) null, (Throwable) null));
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        boolean z;
        C58038y yVar = this.f155085a;
        yVar.mo54613d(new C58039z(1, yVar, C58836b.f156633a, (Boolean) null, (Throwable) null));
        C58038y yVar2 = this.f155085a;
        synchronized (yVar2.f155159a) {
            z = yVar2.f155162d;
            if (!z) {
                yVar2.f155163e = cVar;
            }
        }
        if (z) {
            cVar.mo21018g();
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        this.f155085a.mo54612c();
        this.f155085a.mo54613d(new C58039z(3, (C57996c) null, C58836b.f156633a, Boolean.valueOf(z), (Throwable) null));
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        this.f155085a.mo54612c();
        this.f155085a.mo54613d(new C58039z(4, (C57996c) null, C58836b.f156633a, (Boolean) null, th));
    }
}
