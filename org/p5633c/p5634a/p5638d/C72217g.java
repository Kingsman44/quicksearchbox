package org.p5633c.p5634a.p5638d;

import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72270f;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;

/* renamed from: org.c.a.d.g */
/* compiled from: PG */
public final class C72217g extends C72214d {

    /* renamed from: a */
    final int f192183a;

    /* renamed from: c */
    final C72291o f192184c;

    /* renamed from: d */
    private final int f192185d;

    /* renamed from: e */
    private final int f192186e;

    public C72217g(C72233e eVar, C72283g gVar) {
        super(eVar, gVar);
        int i;
        C72291o A = eVar.mo63464A();
        if (A == null) {
            this.f192184c = null;
        } else {
            this.f192184c = new C72227q(A, ((C72270f) gVar).f192351a);
        }
        this.f192183a = 100;
        int h = eVar.mo63447h();
        if (h >= 0) {
            i = h / 100;
        } else {
            i = ((h + 1) / 100) - 1;
        }
        int d = eVar.mo63446d();
        int i2 = d >= 0 ? d / 100 : ((d + 1) / 100) - 1;
        this.f192185d = i;
        this.f192186e = i2;
    }

    /* renamed from: A */
    public final C72291o mo63464A() {
        return this.f192184c;
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        int a = this.f192179b.mo63444a(j);
        return a >= 0 ? a / 100 : ((a + 1) / 100) - 1;
    }

    /* renamed from: b */
    public final int mo63445b(long j, long j2) {
        return this.f192179b.mo63445b(j, j2) / 100;
    }

    /* renamed from: d */
    public final int mo63446d() {
        return this.f192186e;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return this.f192185d;
    }

    /* renamed from: k */
    public final long mo63448k(long j, int i) {
        return this.f192179b.mo63448k(j, i * 100);
    }

    /* renamed from: l */
    public final long mo63449l(long j, long j2) {
        return this.f192179b.mo63449l(j, j2 * 100);
    }

    /* renamed from: m */
    public final long mo63450m(long j, long j2) {
        return this.f192179b.mo63450m(j, j2) / 100;
    }

    /* renamed from: n */
    public final long mo63451n(long j) {
        return mo63454q(j, mo63444a(this.f192179b.mo63451n(j)));
    }

    /* renamed from: p */
    public final long mo63453p(long j) {
        C72233e eVar = this.f192179b;
        return eVar.mo63453p(eVar.mo63454q(j, mo63444a(j) * 100));
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        int i2;
        C72218h.m106360f(this, i, this.f192185d, this.f192186e);
        int a = this.f192179b.mo63444a(j);
        if (a >= 0) {
            i2 = a % 100;
        } else {
            i2 = ((a + 1) % 100) + 99;
        }
        return this.f192179b.mo63454q(j, (i * 100) + i2);
    }
}
