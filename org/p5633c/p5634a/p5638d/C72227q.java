package org.p5633c.p5634a.p5638d;

import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72293q;

/* renamed from: org.c.a.d.q */
/* compiled from: PG */
public final class C72227q extends C72215e {
    private static final long serialVersionUID = -3205227092378684157L;

    /* renamed from: a */
    private final int f192200a = 100;

    public C72227q(C72291o oVar, C72293q qVar) {
        super(oVar, qVar);
    }

    /* renamed from: a */
    public final int mo63473a(long j, long j2) {
        return this.f192180b.mo63473a(j, j2) / 100;
    }

    /* renamed from: b */
    public final long mo63474b(long j, int i) {
        return this.f192180b.mo63475c(j, ((long) i) * 100);
    }

    /* renamed from: c */
    public final long mo63475c(long j, long j2) {
        return this.f192180b.mo63475c(j, C72218h.m106357c(j2, 100));
    }

    /* renamed from: d */
    public final long mo63476d(long j, long j2) {
        return this.f192180b.mo63476d(j, j2) / 100;
    }

    /* renamed from: e */
    public final long mo63488e() {
        return this.f192180b.mo63488e() * 100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72227q) {
            C72227q qVar = (C72227q) obj;
            if (this.f192180b.equals(qVar.f192180b) && this.f192178d == qVar.f192178d) {
                int i = qVar.f192200a;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f192178d.hashCode() + 100 + this.f192180b.hashCode();
    }
}
