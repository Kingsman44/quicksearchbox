package com.google.common.p4535g;

import com.google.common.base.C58817ah;
import com.google.common.p4575r.C60763t;
import java.util.List;

/* renamed from: com.google.common.g.as */
/* compiled from: PG */
public final class C59126as {

    /* renamed from: a */
    public final List f157129a;

    /* renamed from: b */
    public int f157130b;

    /* renamed from: c */
    private final C58817ah f157131c;

    public C59126as(List list) {
        this.f157129a = list;
        this.f157131c = new C59124aq(list);
    }

    public C59126as(List list, C58817ah ahVar) {
        this.f157129a = list;
        this.f157131c = ahVar;
    }

    /* renamed from: a */
    public final int mo56439a(C59226t tVar) {
        return C60763t.m92764a(mo56441c().mo56438a(), tVar.f157334b);
    }

    /* renamed from: b */
    public final C59226t mo56440b() {
        return new C59226t(mo56441c().mo56438a());
    }

    /* renamed from: c */
    public final C59125ar mo56441c() {
        return (C59125ar) this.f157129a.get(this.f157130b);
    }

    /* renamed from: d */
    public final C59126as mo56442d() {
        C59126as asVar = new C59126as(this.f157129a, this.f157131c);
        asVar.f157130b = this.f157130b;
        return asVar;
    }

    /* renamed from: e */
    public final void mo56443e(C59226t tVar) {
        this.f157130b = ((Integer) this.f157131c.apply(tVar)).intValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C59126as) && mo56447h((C59126as) obj);
    }

    /* renamed from: f */
    public final boolean mo56445f() {
        return this.f157130b == 0;
    }

    /* renamed from: g */
    public final boolean mo56446g() {
        return this.f157130b == this.f157129a.size();
    }

    /* renamed from: h */
    public final boolean mo56447h(C59126as asVar) {
        return this.f157129a == asVar.f157129a && this.f157130b == asVar.f157130b;
    }

    public final int hashCode() {
        return (this.f157130b * 31) + this.f157129a.hashCode();
    }

    /* renamed from: i */
    public final boolean mo56449i(C59136bb bbVar) {
        C59226t t = C59226t.m91939t(bbVar);
        mo56443e(t);
        if (!mo56446g() && mo56440b().mo56678y().mo56662H(t)) {
            return true;
        }
        if (mo56445f()) {
            return false;
        }
        mo56451k();
        if (mo56440b().mo56677x().mo56658D(t)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo56450j() {
        if (this.f157130b < this.f157129a.size()) {
            this.f157130b++;
        }
    }

    /* renamed from: k */
    public final void mo56451k() {
        int i = this.f157130b;
        if (i > 0) {
            this.f157130b = i - 1;
        }
    }
}
