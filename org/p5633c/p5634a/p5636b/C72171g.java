package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.p5638d.C72224n;

/* renamed from: org.c.a.b.g */
/* compiled from: PG */
final class C72171g extends C72224n {

    /* renamed from: b */
    private final C72170f f192101b;

    public C72171g(C72170f fVar, C72291o oVar) {
        super(C72283g.f192394j, oVar);
        this.f192101b = fVar;
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return this.f192101b.f192058f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final int mo63514F(long j, int i) {
        return this.f192101b.mo63497ab(j, i);
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        C72170f fVar = this.f192101b;
        int al = fVar.mo63505al(j);
        return fVar.mo63492W(j, al, fVar.mo63501ah(j, al));
    }

    /* renamed from: d */
    public final int mo63446d() {
        return 31;
    }

    /* renamed from: e */
    public final int mo63469e(long j) {
        return this.f192101b.mo63496aa(j);
    }

    /* renamed from: f */
    public final int mo63482f(C72151ai aiVar) {
        if (!aiVar.mo63397i(C72283g.f192393i)) {
            return 31;
        }
        int b = aiVar.mo63392b(C72283g.f192393i);
        if (!aiVar.mo63397i(C72283g.f192391g)) {
            return this.f192101b.mo63495Z(b);
        }
        return this.f192101b.mo63499ad(aiVar.mo63392b(C72283g.f192391g), b);
    }

    /* renamed from: g */
    public final int mo63483g(C72151ai aiVar, int[] iArr) {
        int e = aiVar.mo63438e();
        for (int i = 0; i < e; i++) {
            if (aiVar.mo63399r(i) == C72283g.f192393i) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < e; i3++) {
                    if (aiVar.mo63399r(i3) == C72283g.f192391g) {
                        return this.f192101b.mo63499ad(iArr[i3], i2);
                    }
                }
                return this.f192101b.mo63495Z(i2);
            }
        }
        return 31;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return 1;
    }
}
