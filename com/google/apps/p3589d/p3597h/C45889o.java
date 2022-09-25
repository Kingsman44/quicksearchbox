package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3590a.C45707x;
import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3595f.C45802e;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3595f.C45822y;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45938c;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.apps.d.h.o */
/* compiled from: PG */
final class C45889o extends C45883i {

    /* renamed from: a */
    public static final /* synthetic */ int f120632a = 0;

    /* renamed from: f */
    private final C45719j f120633f;

    /* renamed from: g */
    private final int f120634g;

    private C45889o(C45755n nVar, int i, C45719j jVar, C45819v vVar, C45946k kVar, C45946k kVar2) {
        super(nVar, vVar, kVar, kVar2);
        this.f120634g = i;
        this.f120633f = jVar;
    }

    /* renamed from: e */
    static C45880f m81927e(C45755n nVar, C45755n nVar2, C45755n nVar3, C45819v vVar, boolean z, C45707x xVar) {
        C45755n nVar4 = nVar;
        C45819v vVar2 = vVar;
        if (!nVar.mo49892l()) {
            return m81929x(nVar4.f120319h, nVar4, vVar, z, xVar);
        }
        double g = vVar2.mo49967g(vVar2.mo49964d("M")).mo49970g();
        double d = g * 0.9d;
        double d2 = g * 0.1d;
        C45802e eVar = (C45802e) vVar2.mo49967g(vVar2.mo49964d("′"));
        C45938c cVar = (C45938c) eVar.f120435c;
        double d3 = cVar.f120730d;
        double d4 = cVar.f120728b;
        double d5 = (d - d2) / (d3 - d4);
        int i = eVar.f120433a;
        double d6 = d;
        double d7 = eVar.f120434b;
        double d8 = d2;
        C45938c cVar2 = new C45938c(cVar.f120727a * d5, d4 * d5, cVar.f120729c * d5, d3 * d5);
        double d9 = eVar.f120436d;
        int i2 = i;
        C45938c cVar3 = cVar2;
        C45802e eVar2 = new C45802e(i2, d7 * d5, cVar3, d9 * d5, eVar.f120437e, eVar.f120438f);
        double d10 = ((C45938c) eVar2.f120435c).f120728b - d8;
        double d11 = eVar2.f120436d;
        double d12 = C59203do.f157270a;
        if (nVar2 != null && nVar2.mo49892l()) {
            d12 = ((C45938c) eVar2.f120435c).f120727a;
            d11 -= d12;
        }
        double d13 = d12;
        if (nVar3 != null && nVar3.mo49892l()) {
            d11 -= eVar2.f120436d - ((C45938c) eVar2.f120435c).f120729c;
        }
        C45946k q = C45886l.m81891q(d6, C59203do.f157270a, d11);
        return new C45886l(nVar4.f120319h, nVar, eVar2, d13, d10, vVar, q, q);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.google.apps.d.f.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.google.apps.d.f.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.google.apps.d.f.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.apps.p3589d.p3597h.C45880f m81928w(com.google.apps.p3589d.p3593d.C45755n r19, int r20, java.lang.String r21, com.google.apps.p3589d.p3595f.C45819v r22) {
        /*
            r4 = r22
            com.google.apps.d.b.n r0 = new com.google.apps.d.b.n
            r1 = 0
            r0.<init>(r1)
            r2 = 0
        L_0x0009:
            int r3 = r21.length()
            if (r2 >= r3) goto L_0x0059
            r3 = r21
            int r14 = r3.codePointAt(r2)
            int r5 = com.google.apps.p3589d.p3595f.C45819v.m81729c(r14)
            if (r5 != 0) goto L_0x004a
            boolean r5 = com.google.apps.p3589d.p3595f.C45806i.m81701c(r14)
            if (r5 == 0) goto L_0x0049
            double r12 = r4.f120480a
            r6 = 0
            r8 = -4628799697011395789(0xbfc3333333333333, double:-0.15)
            double r8 = r8 * r12
            r10 = 4605831338911806259(0x3feb333333333333, double:0.85)
            double r15 = r12 * r10
            r10 = r12
            r17 = r12
            r12 = r15
            com.google.apps.d.k.k r9 = com.google.apps.p3589d.p3600k.C45946k.m82043h(r6, r8, r10, r12)
            com.google.apps.d.f.e r15 = new com.google.apps.d.f.e
            r6 = 0
            r13 = 0
            r5 = r15
            r7 = r17
            r10 = r17
            r12 = r14
            r5.<init>(r6, r7, r9, r10, r12, r13)
            goto L_0x004e
        L_0x0049:
            r5 = 0
        L_0x004a:
            com.google.apps.d.f.y r15 = r4.mo49967g(r5)
        L_0x004e:
            java.util.ArrayList r5 = r0.f120220a
            r5.add(r15)
            int r5 = java.lang.Character.charCount(r14)
            int r2 = r2 + r5
            goto L_0x0009
        L_0x0059:
            com.google.apps.d.b.j r3 = r0.mo49829f()
            com.google.apps.d.k.k r0 = com.google.apps.p3589d.p3600k.C45946k.f120735e
            com.google.apps.d.k.g r1 = new com.google.apps.d.k.g
            r1.<init>()
            com.google.apps.d.h.m r2 = new com.google.apps.d.h.m
            r2.<init>(r1)
            com.google.apps.d.b.j r2 = r3.mo49812a(r2)
            com.google.apps.d.k.k r5 = r0.mo50063i(r2)
            r6 = 0
            r1.f120732a = r6
            com.google.apps.d.h.n r0 = new com.google.apps.d.h.n
            r0.<init>(r1)
            com.google.apps.d.b.j r0 = r3.mo49812a(r0)
            com.google.apps.d.k.k r6 = r5.mo50063i(r0)
            com.google.apps.d.h.o r7 = new com.google.apps.d.h.o
            r0 = r7
            r1 = r19
            r2 = r20
            r4 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3597h.C45889o.m81928w(com.google.apps.d.d.n, int, java.lang.String, com.google.apps.d.f.v):com.google.apps.d.h.f");
    }

    /* renamed from: x */
    public static C45880f m81929x(int i, C45755n nVar, C45819v vVar, boolean z, C45707x xVar) {
        String f = nVar.mo49888f();
        C45880f w = m81928w(nVar, i, f, vVar);
        if (nVar.f120316e == null && nVar.f120315d == null) {
            return w;
        }
        return C45898x.m81953w(nVar, w, !f.isEmpty() ? C45819v.m81727a(vVar.mo49964d(f)) * (vVar.f120480a / 1000.0d) : C59203do.f157270a, vVar, z, xVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50002d(C45869aj ajVar, C45944i iVar, C45941f fVar) {
        C45712c cVar = new C45712c(this.f120633f);
        double d = C59203do.f157270a;
        while (cVar.hasNext()) {
            C45822y yVar = (C45822y) cVar.next();
            C45937b bVar = (C45937b) iVar;
            ajVar.mo50011b(yVar, bVar.f120725a + d, bVar.f120726b, fVar, false);
            d += yVar.mo49945a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo50003v() {
        return this.f120634g;
    }
}
