package org.p5633c.p5634a.p5638d;

import org.p5633c.p5634a.C72293q;

/* renamed from: org.c.a.d.o */
/* compiled from: PG */
public final class C72225o extends C72213c {
    private static final long serialVersionUID = -8346152187724495365L;

    /* renamed from: a */
    private final long f192198a;

    public C72225o(C72293q qVar, long j) {
        super(qVar);
        this.f192198a = j;
    }

    /* renamed from: b */
    public final long mo63474b(long j, int i) {
        return C72218h.m106356b(j, ((long) i) * this.f192198a);
    }

    /* renamed from: c */
    public final long mo63475c(long j, long j2) {
        return C72218h.m106356b(j, C72218h.m106358d(j2, this.f192198a));
    }

    /* renamed from: d */
    public final long mo63476d(long j, long j2) {
        return C72218h.m106359e(j, j2) / this.f192198a;
    }

    /* renamed from: e */
    public final long mo63488e() {
        return this.f192198a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72225o) {
            C72225o oVar = (C72225o) obj;
            return this.f192178d == oVar.f192178d && this.f192198a == oVar.f192198a;
        }
    }

    /* renamed from: h */
    public final boolean mo63489h() {
        return true;
    }

    public final int hashCode() {
        return ((int) this.f192198a) + this.f192178d.hashCode();
    }
}
