package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3593d.C45748g;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45765x;
import com.google.apps.p3589d.p3595f.C45802e;
import com.google.apps.p3589d.p3595f.C45811n;
import com.google.apps.p3589d.p3595f.C45815r;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3595f.C45822y;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45938c;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;
import com.google.common.p4535g.C59203do;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.d.h.ag */
/* compiled from: PG */
final class C45866ag extends C45883i {

    /* renamed from: a */
    public static final /* synthetic */ int f120573a = 0;

    /* renamed from: f */
    private static final C45719j f120574f = C45719j.m81480k(123, 125, 91, 93);

    /* renamed from: g */
    private final C45719j f120575g;

    /* renamed from: h */
    private final C45719j f120576h;

    /* renamed from: i */
    private final double f120577i;

    /* renamed from: j */
    private final int f120578j;

    private C45866ag(int i, C45755n nVar, C45719j jVar, C45719j jVar2, double d, C45819v vVar, C45946k kVar, C45946k kVar2) {
        super(nVar, vVar, kVar, kVar2);
        this.f120578j = i;
        this.f120575g = jVar;
        this.f120576h = jVar2;
        this.f120577i = d;
    }

    /* renamed from: e */
    static C45882h m81843e(C45765x xVar, C45819v vVar, double d, double d2, C45865af afVar) {
        return m81845x(2, xVar, vVar, vVar.mo49969k("√"), d, d2, afVar);
    }

    /* renamed from: w */
    static C45882h m81844w(int i, C45755n nVar, C45819v vVar, C45748g gVar, double d) {
        C45819v vVar2 = vVar;
        C45748g gVar2 = gVar;
        if (gVar2 == C45748g.NONE) {
            C45946k q = m81891q(C59203do.f157270a, C59203do.f157270a, 0.12d);
            return new C45866ag(i, nVar, C45719j.f120222b, C45719j.f120222b, C59203do.f157270a, vVar, q, q);
        }
        return m81845x(i, nVar, vVar, vVar2.mo49969k(gVar2.f120308L), d, C59203do.f157270a, new C45864ae(vVar2));
    }

    /* renamed from: x */
    private static C45882h m81845x(int i, C45755n nVar, C45819v vVar, int i2, double d, double d2, C45865af afVar) {
        C45819v vVar2 = vVar;
        int i3 = i2;
        double d3 = d;
        C45865af afVar2 = afVar;
        C45822y h = vVar2.mo49968h(C45811n.f120472b, i3, new C45815r(d3));
        boolean z = f120574f.f120220a.contains(Integer.valueOf(((C45802e) h).f120437e)) && d3 >= vVar2.f120480a * 1.85d;
        if (h.mo49970g() + h.mo49971h() < d3 || z) {
            C45719j e = vVar2.mo49965e(C45811n.f120472b, i3);
            C45866ag agVar = null;
            if (!(e == null || e.f120220a.size() == 0)) {
                C45723n nVar2 = new C45723n(0);
                C45723n nVar3 = new C45723n(0);
                C45897w.m81951a(vVar, e, d, nVar2, nVar3);
                Objects.requireNonNull(vVar);
                C45719j a = nVar2.mo49812a(new C45862ac(vVar2));
                double d4 = C59203do.f157270a;
                double d5 = 0.0d;
                double d6 = 0.0d;
                for (int i4 = 0; i4 < a.f120220a.size(); i4++) {
                    C45822y yVar = (C45822y) a.mo49815d(i4);
                    Double d7 = (Double) nVar3.mo49815d(i4);
                    d4 = Math.max(d4, d7.doubleValue() + yVar.mo49970g());
                    d5 = Math.max(d5, (-d7.doubleValue()) + yVar.mo49971h());
                    d6 = Math.max(d6, yVar.mo49945a());
                }
                double a2 = afVar2.mo50004a(d4, d5);
                C45946k q = m81891q(d4 - a2, d5 + a2, d6);
                agVar = new C45866ag(i, nVar, a, nVar3.mo49812a(new C45863ad(a2)), d2, vVar, q, q);
            }
            if (agVar != null) {
                return agVar;
            }
        }
        return C45886l.m81922e(i, nVar, h, afVar2.mo50004a(h.mo49970g(), h.mo49971h()), C59203do.f157270a, vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50002d(C45869aj ajVar, C45944i iVar, C45941f fVar) {
        double d;
        double d2 = 0.0d;
        int i = 0;
        while (i < this.f120575g.f120220a.size()) {
            C45822y yVar = (C45822y) this.f120575g.mo49815d(i);
            if (yVar.mo49947c() > 0) {
                C45937b bVar = (C45937b) iVar;
                ajVar.mo50011b(yVar, bVar.f120725a, ((Double) this.f120576h.mo49815d(i)).doubleValue() + bVar.f120726b, fVar, false);
            } else if (this.f120577i != C59203do.f157270a) {
                C45937b bVar2 = (C45937b) iVar;
                C45946k j = yVar.mo49951f().mo50064j(bVar2.f120725a, bVar2.f120726b + ((Double) this.f120576h.mo49815d(i)).doubleValue());
                boolean z = i == this.f120575g.f120220a.size() + -1;
                if (!z) {
                    C45938c cVar = (C45938c) j;
                    d = j.mo50060e();
                    d2 = cVar.f120729c - cVar.f120727a;
                } else {
                    d = ((C45938c) j).f120727a + (d2 / 2.0d);
                }
                C45938c cVar2 = (C45938c) j;
                ajVar.mo50012c(d, cVar2.f120728b, d, cVar2.f120730d, fVar, d2);
                if (z) {
                    double d3 = cVar2.f120730d;
                    double d4 = this.f120577i;
                    double d5 = d3 - (d4 / 2.0d);
                    ajVar.mo50012c(cVar2.f120727a, d5, cVar2.f120729c, d5, fVar, d4);
                }
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo50003v() {
        return this.f120578j;
    }
}
