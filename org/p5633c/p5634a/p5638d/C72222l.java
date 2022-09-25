package org.p5633c.p5634a.p5638d;

import android.support.p033v7.widget.LinearLayoutManager;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;

/* renamed from: org.c.a.d.l */
/* compiled from: PG */
public final class C72222l extends C72214d {

    /* renamed from: a */
    private final int f192191a;

    /* renamed from: c */
    private final int f192192c;

    /* renamed from: d */
    private final int f192193d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C72222l(C72233e eVar, int i) {
        this(eVar, eVar == null ? null : eVar.mo63563z(), i);
    }

    /* renamed from: B */
    public final C72291o mo63465B() {
        return this.f192179b.mo63465B();
    }

    /* renamed from: D */
    public final boolean mo63467D(long j) {
        return this.f192179b.mo63467D(j);
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        return this.f192179b.mo63444a(j) + this.f192191a;
    }

    /* renamed from: d */
    public final int mo63446d() {
        return this.f192193d;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return this.f192192c;
    }

    /* renamed from: k */
    public final long mo63448k(long j, int i) {
        long b = this.f192179b.mo63464A().mo63474b(j, i);
        C72218h.m106360f(this, this.f192179b.mo63444a(b) + this.f192191a, this.f192192c, this.f192193d);
        return b;
    }

    /* renamed from: l */
    public final long mo63449l(long j, long j2) {
        long c = this.f192179b.mo63464A().mo63475c(j, j2);
        C72218h.m106360f(this, this.f192179b.mo63444a(c) + this.f192191a, this.f192192c, this.f192193d);
        return c;
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
        C72218h.m106360f(this, i, this.f192192c, this.f192193d);
        return this.f192179b.mo63454q(j, i - this.f192191a);
    }

    public C72222l(C72233e eVar, C72283g gVar, int i) {
        super(eVar, gVar);
        this.f192191a = i;
        if (eVar.mo63447h() + i > Integer.MIN_VALUE) {
            this.f192192c = eVar.mo63447h() + i;
        } else {
            this.f192192c = LinearLayoutManager.INVALID_OFFSET;
        }
        if (eVar.mo63446d() + i < Integer.MAX_VALUE) {
            this.f192193d = eVar.mo63446d() + i;
        } else {
            this.f192193d = Integer.MAX_VALUE;
        }
    }
}
