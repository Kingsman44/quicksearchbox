package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3590a.C45707x;
import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3593d.C45745d;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45938c;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;

/* renamed from: com.google.apps.d.h.t */
/* compiled from: PG */
final class C45894t extends C45882h {

    /* renamed from: a */
    final C45763v f120643a;

    /* renamed from: f */
    final C45719j f120644f;

    /* renamed from: g */
    private final boolean f120645g;

    /* renamed from: h */
    private final int f120646h;

    public C45894t(C45763v vVar, int i, C45719j jVar, boolean z, C45819v vVar2, C45946k kVar, C45946k kVar2) {
        super(C45880f.f120610b, vVar2, kVar, kVar2);
        this.f120643a = vVar;
        this.f120646h = i;
        this.f120644f = jVar;
        this.f120645g = z;
    }

    /* renamed from: e */
    static C45894t m81938e(C45763v vVar, C45819v vVar2, C45707x xVar) {
        return C45875ap.m81870c(2, vVar, vVar2.mo49966f(), true, xVar);
    }

    /* renamed from: w */
    static C45894t m81939w(C45763v vVar, C45819v vVar2, boolean z, C45707x xVar) {
        return C45875ap.m81870c(2, vVar, vVar2.mo49966f(), z, xVar);
    }

    /* renamed from: x */
    static C45894t m81940x(C45763v vVar, C45719j jVar, C45819v vVar2) {
        C45874ao b = C45875ap.m81869b(vVar2, jVar);
        return new C45894t(vVar, 2, jVar, false, vVar2, b.f120604a, b.f120605b);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.apps.p3589d.p3590a.C45699p mo50000a(com.google.apps.p3589d.p3590a.C45703t r20, com.google.apps.p3589d.p3600k.C45944i r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r0.f120645g
            if (r2 != 0) goto L_0x0028
            com.google.apps.d.b.j r2 = r0.f120644f
            com.google.apps.d.b.c r3 = new com.google.apps.d.b.c
            r3.<init>(r2)
        L_0x000f:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r3.next()
            com.google.apps.d.h.f r2 = (com.google.apps.p3589d.p3597h.C45880f) r2
            r4 = r20
            com.google.apps.d.a.p r2 = r2.mo50016k(r4, r1)
            boolean r5 = r2.mo49794e()
            if (r5 != 0) goto L_0x000f
            goto L_0x0065
        L_0x0028:
            r4 = r20
            com.google.apps.d.d.v r2 = r0.f120643a
            if (r2 == 0) goto L_0x0063
            int r2 = r20.mo49743a()
            com.google.apps.d.d.v r3 = r0.f120643a
            com.google.apps.d.d.j r3 = r3.f120343b
            com.google.apps.d.d.d r3 = (com.google.apps.p3589d.p3593d.C45745d) r3
            int r3 = r3.f120265a
            if (r2 != r3) goto L_0x0041
            com.google.apps.d.a.p r2 = r0.mo50015j(r1)
            goto L_0x0065
        L_0x0041:
            int r2 = r20.mo49743a()
            com.google.apps.d.d.v r3 = r0.f120643a
            com.google.apps.d.d.j r3 = r3.f120343b
            com.google.apps.d.d.d r3 = (com.google.apps.p3589d.p3593d.C45745d) r3
            int r3 = r3.f120266b
            if (r2 != r3) goto L_0x0063
            com.google.apps.d.k.k r2 = r0.f120615d
            double r5 = r2.mo50047a()
            double r2 = r2.mo50049c()
            double r5 = r5 - r2
            com.google.apps.d.k.i r2 = r1.mo50057e(r5)
            com.google.apps.d.a.p r2 = r0.mo50015j(r2)
            goto L_0x0065
        L_0x0063:
            com.google.apps.d.a.p r2 = com.google.apps.p3589d.p3590a.C45699p.f120208d
        L_0x0065:
            boolean r3 = r2.mo49794e()
            if (r3 != 0) goto L_0x012d
            com.google.apps.d.k.k r3 = r2.mo49733c()
            double r5 = r3.mo50049c()
            double r7 = r3.mo50047a()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0087
            double r5 = r3.mo50050d()
            double r7 = r3.mo50048b()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x012d
        L_0x0087:
            boolean r3 = r20.mo49799e()
            if (r3 == 0) goto L_0x008f
            goto L_0x012d
        L_0x008f:
            boolean r3 = r0.f120645g
            if (r3 == 0) goto L_0x00a2
            com.google.apps.d.k.k r3 = r0.f120615d
            double r3 = r3.mo50049c()
            com.google.apps.d.k.k r5 = r0.f120615d
            double r5 = r5.mo50047a()
            r11 = r3
            r15 = r5
            goto L_0x0106
        L_0x00a2:
            int r3 = r20.mo49798d()
            int r4 = r20.mo49797c()
            com.google.apps.d.b.j r5 = r0.f120644f
            com.google.apps.d.b.c r6 = new com.google.apps.d.b.c
            r6.<init>(r5)
            r7 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r9 = -4503599627370496(0xfff0000000000000, double:-Infinity)
        L_0x00b5:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x0104
            java.lang.Object r5 = r6.next()
            com.google.apps.d.h.ai r5 = (com.google.apps.p3589d.p3597h.C45868ai) r5
            com.google.apps.d.h.f r11 = r5.f120579d
            com.google.apps.d.d.n r11 = r11.f120611c
            com.google.apps.d.d.a r12 = r11.f120318g
            com.google.apps.d.d.b r12 = (com.google.apps.p3589d.p3593d.C45743b) r12
            int r13 = r12.f120260b
            if (r3 > r13) goto L_0x00b5
            int r12 = r12.f120261c
            if (r12 > r4) goto L_0x00b5
            com.google.apps.d.k.k r12 = r5.f120581e
            com.google.apps.d.k.c r12 = (com.google.apps.p3589d.p3600k.C45938c) r12
            double r12 = r12.f120727a
            double r7 = java.lang.Math.min(r7, r12)
            com.google.apps.d.d.a r11 = r11.f120318g
            com.google.apps.d.d.b r11 = (com.google.apps.p3589d.p3593d.C45743b) r11
            int r11 = r11.f120262d
            if (r11 > r4) goto L_0x00ea
            com.google.apps.d.k.k r5 = r5.f120581e
            com.google.apps.d.k.c r5 = (com.google.apps.p3589d.p3600k.C45938c) r5
            double r11 = r5.f120729c
            goto L_0x00ff
        L_0x00ea:
            com.google.apps.d.h.f r11 = r5.f120579d
            com.google.apps.d.h.x r11 = (com.google.apps.p3589d.p3597h.C45898x) r11
            com.google.apps.d.h.f r11 = r11.f120657a
            com.google.apps.d.k.k r11 = r11.mo50007r()
            double r11 = r11.mo50047a()
            com.google.apps.d.k.i r5 = r5.f120580a
            com.google.apps.d.k.b r5 = (com.google.apps.p3589d.p3600k.C45937b) r5
            double r13 = r5.f120725a
            double r11 = r11 + r13
        L_0x00ff:
            double r9 = java.lang.Math.max(r9, r11)
            goto L_0x00b5
        L_0x0104:
            r11 = r7
            r15 = r9
        L_0x0106:
            com.google.apps.d.k.k r3 = r0.f120616e
            double r13 = r3.mo50050d()
            com.google.apps.d.k.k r3 = r0.f120616e
            double r17 = r3.mo50048b()
            com.google.apps.d.k.k r3 = com.google.apps.p3589d.p3600k.C45946k.m82043h(r11, r13, r15, r17)
            com.google.apps.d.k.b r1 = (com.google.apps.p3589d.p3600k.C45937b) r1
            double r4 = r1.f120725a
            double r6 = r1.f120726b
            com.google.apps.d.k.k r1 = r3.mo50064j(r4, r6)
            com.google.apps.d.k.i r3 = r2.mo49732b()
            double r4 = r2.mo49731a()
            com.google.apps.d.a.p r1 = com.google.apps.p3589d.p3590a.C45699p.m81425d(r3, r4, r1)
            return r1
        L_0x012d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3597h.C45894t.mo50000a(com.google.apps.d.a.t, com.google.apps.d.k.i):com.google.apps.d.a.p");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C45879e mo50001b(C45944i iVar, C45944i iVar2) {
        double d = ((C45937b) iVar).f120725a - ((C45937b) iVar2).f120725a;
        if (this.f120644f.f120220a.isEmpty() || this.f120645g) {
            C45763v vVar = this.f120643a;
            return vVar == null ? C45879e.f120609a : C45879e.m81884c(((C45745d) vVar.f120343b).f120265a);
        }
        int size = this.f120644f.f120220a.size();
        for (int i = 0; i < size; i++) {
            C45868ai aiVar = (C45868ai) this.f120644f.mo49815d(i);
            if (d <= ((C45938c) aiVar.f120581e).f120729c) {
                return aiVar.mo50018o(iVar, iVar2);
            }
        }
        C45763v vVar2 = this.f120643a;
        return vVar2 == null ? C45879e.f120609a : C45879e.m81884c(((C45745d) vVar2.f120343b).f120266b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50002d(C45869aj ajVar, C45944i iVar, C45941f fVar) {
        C45712c cVar = new C45712c(this.f120644f);
        while (cVar.hasNext()) {
            ((C45868ai) cVar.next()).mo50002d(ajVar, iVar, fVar);
        }
    }

    /* renamed from: t */
    public final int mo50008t() {
        int i = this.f120646h;
        if (i != 0) {
            return i;
        }
        C45868ai aiVar = (C45868ai) this.f120644f.mo49816e(0);
        if (aiVar == null) {
            return 2;
        }
        return aiVar.f120579d.mo50008t();
    }

    /* renamed from: u */
    public final int mo50009u() {
        int i = this.f120646h;
        if (i != 0) {
            return i;
        }
        C45719j jVar = this.f120644f;
        C45868ai aiVar = (C45868ai) jVar.mo49816e(jVar.f120220a.size() - 1);
        if (aiVar == null) {
            return 2;
        }
        return aiVar.f120579d.mo50009u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo50003v() {
        throw new AssertionError("Shouldn't be used.");
    }
}
