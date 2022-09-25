package org.p5633c.p5634a.p5638d;

import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72270f;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;

/* renamed from: org.c.a.d.p */
/* compiled from: PG */
public final class C72226p extends C72214d {

    /* renamed from: a */
    final C72291o f192199a;

    public C72226p(C72233e eVar, C72283g gVar) {
        super(eVar, gVar);
        C72291o A = eVar.mo63464A();
        if (A == null) {
            this.f192199a = null;
        } else {
            this.f192199a = new C72227q(A, ((C72270f) gVar).f192352b);
        }
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return this.f192199a;
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        int a = this.f192179b.mo63444a(j);
        return a >= 0 ? a % 100 : ((a + 1) % 100) + 99;
    }

    /* renamed from: d */
    public final int mo63446d() {
        return 99;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return 0;
    }

    /* renamed from: n */
    public final long mo63451n(long j) {
        return this.f192179b.mo63451n(j);
    }

    /* renamed from: o */
    public final long mo63452o(long j) {
        return this.f192179b.mo63452o(j);
    }

    /* renamed from: p */
    public final long mo63453p(long j) {
        return this.f192179b.mo63453p(j);
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        int i2;
        C72218h.m106360f(this, i, 0, 99);
        int a = this.f192179b.mo63444a(j);
        if (a >= 0) {
            i2 = a / 100;
        } else {
            i2 = ((a + 1) / 100) - 1;
        }
        return this.f192179b.mo63454q(j, (i2 * 100) + i);
    }

    public C72226p(C72217g gVar, C72283g gVar2) {
        super(gVar.f192179b, gVar2);
        int i = gVar.f192183a;
        this.f192199a = gVar.f192184c;
    }
}
