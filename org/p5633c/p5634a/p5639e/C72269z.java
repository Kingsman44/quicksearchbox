package org.p5633c.p5634a.p5639e;

import org.p5633c.p5634a.C72144ab;
import org.p5633c.p5634a.C72146ad;

/* renamed from: org.c.a.e.z */
/* compiled from: PG */
public final class C72269z {

    /* renamed from: a */
    public final C72244aj f192347a;

    /* renamed from: b */
    public final C72243ai f192348b;

    /* renamed from: c */
    private final C72146ad f192349c;

    public C72269z(C72244aj ajVar, C72243ai aiVar) {
        this.f192347a = ajVar;
        this.f192348b = aiVar;
        this.f192349c = null;
    }

    private C72269z(C72244aj ajVar, C72243ai aiVar, C72146ad adVar) {
        this.f192347a = ajVar;
        this.f192348b = aiVar;
        this.f192349c = adVar;
    }

    /* renamed from: a */
    public final C72144ab mo63643a(String str) {
        mo63645c();
        C72144ab abVar = new C72144ab(this.f192349c);
        int c = this.f192348b.mo63584c(abVar, str, 0);
        if (c < 0) {
            c ^= -1;
        } else if (c >= str.length()) {
            return abVar;
        }
        throw new IllegalArgumentException(C72266w.m106675c(str, c));
    }

    /* renamed from: b */
    public final C72269z mo63644b(C72146ad adVar) {
        return adVar == this.f192349c ? this : new C72269z(this.f192347a, this.f192348b, adVar);
    }

    /* renamed from: c */
    public final void mo63645c() {
        if (this.f192348b == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
    }
}
