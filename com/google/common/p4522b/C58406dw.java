package com.google.common.p4522b;

import com.google.common.p4575r.C60745b;
import java.io.Serializable;

/* renamed from: com.google.common.b.dw */
/* compiled from: PG */
public abstract class C58406dw implements Comparable, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final Comparable f156004b;

    public C58406dw(Comparable comparable) {
        this.f156004b = comparable;
    }

    /* renamed from: a */
    public int compareTo(C58406dw dwVar) {
        if (dwVar == C58404du.f156003a) {
            return 1;
        }
        if (dwVar == C58402ds.f156002a) {
            return -1;
        }
        int b = C58714pg.m90499b(this.f156004b, dwVar.f156004b);
        if (b != 0) {
            return b;
        }
        return C60745b.m92716a(this instanceof C58403dt, dwVar instanceof C58403dt);
    }

    /* renamed from: b */
    public Comparable mo55176b() {
        return this.f156004b;
    }

    /* renamed from: c */
    public abstract Comparable mo55177c(C58419ei eiVar);

    /* renamed from: d */
    public abstract Comparable mo55179d(C58419ei eiVar);

    /* renamed from: e */
    public abstract void mo55180e(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof C58406dw) {
            try {
                if (compareTo((C58406dw) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* renamed from: f */
    public abstract void mo55181f(StringBuilder sb);

    /* renamed from: g */
    public abstract boolean mo55182g(Comparable comparable);

    /* renamed from: h */
    public abstract C58406dw mo55183h(C58419ei eiVar);

    public abstract int hashCode();

    /* renamed from: i */
    public abstract C58406dw mo55185i(C58419ei eiVar);
}
