package com.google.common.p4535g;

import java.io.Serializable;

/* renamed from: com.google.common.g.aw */
/* compiled from: PG */
public abstract class C59130aw implements Serializable, C59165cd {

    /* renamed from: a */
    public final C59214h f157134a;

    /* renamed from: b */
    public final C59220n f157135b;

    public C59130aw() {
        this.f157134a = C59214h.m91849b();
        this.f157135b = C59220n.m91881c();
    }

    public C59130aw(C59214h hVar, C59220n nVar) {
        this.f157134a = hVar;
        this.f157135b = nVar;
    }

    /* renamed from: a */
    public abstract C59214h mo56458a();

    /* renamed from: b */
    public abstract C59220n mo56459b();

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            C59130aw awVar = (C59130aw) obj;
            if (!mo56458a().equals(awVar.mo56458a()) || !mo56459b().equals(awVar.mo56459b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo56467g(C59225s sVar) {
        throw null;
    }

    public final int hashCode() {
        return ((this.f157134a.hashCode() + 629) * 37) + this.f157135b.hashCode();
    }

    /* renamed from: j */
    public final double mo56469j() {
        return this.f157134a.mo56592h() ? C59203do.f157270a : mo56459b().mo56625a() * Math.abs(Math.sin(mo56470k().f157299c) - Math.sin(mo56471l().f157299c));
    }

    /* renamed from: k */
    public final C59218l mo56470k() {
        return new C59218l(this.f157134a.f157290b);
    }

    /* renamed from: l */
    public final C59218l mo56471l() {
        return new C59218l(this.f157134a.f157289a);
    }

    /* renamed from: m */
    public final C59127at mo56472m() {
        return new C59127at(mo56470k(), new C59218l(this.f157135b.f157307b));
    }

    /* renamed from: n */
    public final C59127at mo56473n() {
        return new C59127at(mo56471l(), new C59218l(this.f157135b.f157306a));
    }

    /* renamed from: o */
    public final boolean mo56474o(C59136bb bbVar) {
        C59127at atVar = new C59127at(bbVar);
        if (!this.f157134a.mo56591g(atVar.f157132a)) {
            return false;
        }
        C59220n nVar = this.f157135b;
        double d = atVar.f157133b;
        if (d == -3.141592653589793d) {
            d = 3.141592653589793d;
        }
        return nVar.mo56634k(d);
    }

    public final String toString() {
        return "[Lo=" + mo56473n() + ", Hi=" + mo56472m() + "]";
    }

    public C59130aw(C59127at atVar, C59127at atVar2) {
        this.f157134a = new C59214h(new C59218l(atVar.f157132a).f157299c, new C59218l(atVar2.f157132a).f157299c);
        this.f157135b = new C59220n(new C59218l(atVar.f157133b).f157299c, new C59218l(atVar2.f157133b).f157299c);
    }
}
