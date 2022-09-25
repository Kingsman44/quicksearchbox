package com.google.common.p4522b;

/* renamed from: com.google.common.b.dv */
/* compiled from: PG */
public final class C58405dv extends C58406dw {
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    public final Comparable mo55177c(C58419ei eiVar) {
        return ((C58418eh) eiVar).mo55221b((Integer) this.f156004b);
    }

    /* renamed from: d */
    public final Comparable mo55179d(C58419ei eiVar) {
        return this.f156004b;
    }

    /* renamed from: e */
    public final void mo55180e(StringBuilder sb) {
        sb.append('[');
        sb.append(this.f156004b);
    }

    /* renamed from: f */
    public final void mo55181f(StringBuilder sb) {
        sb.append(this.f156004b);
        sb.append(')');
    }

    /* renamed from: g */
    public final boolean mo55182g(Comparable comparable) {
        return C58714pg.m90499b(this.f156004b, comparable) <= 0;
    }

    /* renamed from: h */
    public final C58406dw mo55183h(C58419ei eiVar) {
        return this;
    }

    public final int hashCode() {
        return this.f156004b.hashCode();
    }

    /* renamed from: i */
    public final C58406dw mo55185i(C58419ei eiVar) {
        Integer b = ((C58418eh) eiVar).mo55221b((Integer) this.f156004b);
        if (b == null) {
            return C58402ds.f156002a;
        }
        return new C58403dt(b);
    }

    public final String toString() {
        return "\\" + this.f156004b + "/";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58405dv(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }
}
