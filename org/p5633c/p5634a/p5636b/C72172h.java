package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.p5638d.C72224n;

/* renamed from: org.c.a.b.h */
/* compiled from: PG */
final class C72172h extends C72224n {

    /* renamed from: b */
    private final C72170f f192102b;

    public C72172h(C72170f fVar, C72291o oVar) {
        super(C72283g.f192392h, oVar);
        this.f192102b = fVar;
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return this.f192102b.f192059g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final int mo63514F(long j, int i) {
        if (i > 365 || i <= 0) {
            return mo63469e(j);
        }
        return 365;
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        C72170f fVar = this.f192102b;
        return fVar.mo63494Y(j, fVar.mo63505al(j));
    }

    /* renamed from: d */
    public final int mo63446d() {
        return 366;
    }

    /* renamed from: e */
    public final int mo63469e(long j) {
        return this.f192102b.mo63498ac(this.f192102b.mo63505al(j));
    }

    /* renamed from: f */
    public final int mo63482f(C72151ai aiVar) {
        if (!aiVar.mo63397i(C72283g.f192391g)) {
            return 366;
        }
        return this.f192102b.mo63498ac(aiVar.mo63392b(C72283g.f192391g));
    }

    /* renamed from: g */
    public final int mo63483g(C72151ai aiVar, int[] iArr) {
        int e = aiVar.mo63438e();
        for (int i = 0; i < e; i++) {
            if (aiVar.mo63399r(i) == C72283g.f192391g) {
                return this.f192102b.mo63498ac(iArr[i]);
            }
        }
        return 366;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return 1;
    }
}
