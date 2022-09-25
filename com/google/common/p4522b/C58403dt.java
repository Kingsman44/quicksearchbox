package com.google.common.p4522b;

/* renamed from: com.google.common.b.dt */
/* compiled from: PG */
final class C58403dt extends C58406dw {
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    public final Comparable mo55177c(C58419ei eiVar) {
        return this.f156004b;
    }

    /* renamed from: d */
    public final Comparable mo55179d(C58419ei eiVar) {
        return ((C58418eh) eiVar).mo55220a((Integer) this.f156004b);
    }

    /* renamed from: e */
    public final void mo55180e(StringBuilder sb) {
        sb.append('(');
        sb.append(this.f156004b);
    }

    /* renamed from: f */
    public final void mo55181f(StringBuilder sb) {
        sb.append(this.f156004b);
        sb.append(']');
    }

    /* renamed from: g */
    public final boolean mo55182g(Comparable comparable) {
        return C58714pg.m90499b(this.f156004b, comparable) < 0;
    }

    /* renamed from: h */
    public final C58406dw mo55183h(C58419ei eiVar) {
        Integer a = ((C58418eh) eiVar).mo55220a((Integer) this.f156004b);
        if (a == null) {
            return C58404du.f156003a;
        }
        return new C58405dv(a);
    }

    public final int hashCode() {
        return this.f156004b.hashCode() ^ -1;
    }

    /* renamed from: i */
    public final C58406dw mo55185i(C58419ei eiVar) {
        return this;
    }

    public final String toString() {
        return "/" + this.f156004b + "\\";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58403dt(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }
}
