package org.p5633c.p5634a.p5638d;

import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;

/* renamed from: org.c.a.d.n */
/* compiled from: PG */
public abstract class C72224n extends C72212b {

    /* renamed from: a */
    final long f192196a;

    /* renamed from: b */
    private final C72291o f192197b;

    public C72224n(C72283g gVar, C72291o oVar) {
        super(gVar);
        if (oVar.mo63489h()) {
            long e = oVar.mo63488e();
            this.f192196a = e;
            if (e >= 1) {
                this.f192197b = oVar;
                return;
            }
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        throw new IllegalArgumentException("Unit duration field must be precise");
    }

    /* renamed from: A */
    public final C72291o mo63464A() {
        return this.f192197b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public int mo63514F(long j, int i) {
        return mo63469e(j);
    }

    /* renamed from: h */
    public int mo63447h() {
        return 0;
    }

    /* renamed from: n */
    public long mo63451n(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = this.f192196a;
        if (i >= 0) {
            return j % j2;
        }
        return (((j + 1) % j2) + j2) - 1;
    }

    /* renamed from: o */
    public long mo63452o(long j) {
        if (j <= 0) {
            return j - (j % this.f192196a);
        }
        long j2 = j - 1;
        long j3 = this.f192196a;
        return (j2 - (j2 % j3)) + j3;
    }

    /* renamed from: p */
    public long mo63453p(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.f192196a;
        } else {
            long j3 = j + 1;
            j2 = this.f192196a;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    /* renamed from: q */
    public long mo63454q(long j, int i) {
        C72218h.m106360f(this, i, mo63447h(), mo63514F(j, i));
        return j + (((long) (i - mo63444a(j))) * this.f192196a);
    }
}
