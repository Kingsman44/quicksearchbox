package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.p5638d.C72224n;

/* renamed from: org.c.a.b.l */
/* compiled from: PG */
final class C72176l extends C72224n {

    /* renamed from: b */
    private final C72170f f192111b;

    public C72176l(C72170f fVar, C72291o oVar) {
        super(C72283g.f192397m, oVar);
        this.f192111b = fVar;
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return this.f192111b.f192057e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final int mo63514F(long j, int i) {
        if (i > 52) {
            return mo63469e(j);
        }
        return 52;
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        C72170f fVar = this.f192111b;
        return fVar.mo63502ai(j, fVar.mo63505al(j));
    }

    /* renamed from: d */
    public final int mo63446d() {
        return 53;
    }

    /* renamed from: e */
    public final int mo63469e(long j) {
        return this.f192111b.mo63503aj(this.f192111b.mo63504ak(j));
    }

    /* renamed from: f */
    public final int mo63482f(C72151ai aiVar) {
        if (!aiVar.mo63397i(C72283g.f192396l)) {
            return 53;
        }
        return this.f192111b.mo63503aj(aiVar.mo63392b(C72283g.f192396l));
    }

    /* renamed from: g */
    public final int mo63483g(C72151ai aiVar, int[] iArr) {
        int e = aiVar.mo63438e();
        for (int i = 0; i < e; i++) {
            if (aiVar.mo63399r(i) == C72283g.f192396l) {
                return this.f192111b.mo63503aj(iArr[i]);
            }
        }
        return 53;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return 1;
    }

    /* renamed from: n */
    public final long mo63451n(long j) {
        return super.mo63451n(j + 259200000);
    }

    /* renamed from: o */
    public final long mo63452o(long j) {
        return super.mo63452o(j + 259200000) - 259200000;
    }

    /* renamed from: p */
    public final long mo63453p(long j) {
        return super.mo63453p(j + 259200000) - 259200000;
    }
}
