package org.p5633c.p5634a.p5638d;

import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;

/* renamed from: org.c.a.d.m */
/* compiled from: PG */
public class C72223m extends C72224n {

    /* renamed from: b */
    private final int f192194b;

    /* renamed from: c */
    private final C72291o f192195c;

    public C72223m(C72283g gVar, C72291o oVar, C72291o oVar2) {
        super(gVar, oVar);
        if (oVar2.mo63489h()) {
            int e = (int) (oVar2.mo63488e() / this.f192196a);
            this.f192194b = e;
            if (e >= 2) {
                this.f192195c = oVar2;
                return;
            }
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        throw new IllegalArgumentException("Range duration field must be precise");
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return this.f192195c;
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        if (j >= 0) {
            return (int) ((j / this.f192196a) % ((long) this.f192194b));
        }
        int i = this.f192194b;
        return (i - 1) + ((int) (((j + 1) / this.f192196a) % ((long) i)));
    }

    /* renamed from: d */
    public final int mo63446d() {
        return this.f192194b - 1;
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        C72218h.m106360f(this, i, mo63447h(), this.f192194b - 1);
        return j + (((long) (i - mo63444a(j))) * this.f192196a);
    }
}
