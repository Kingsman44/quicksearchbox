package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45721l;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3591b.C45724o;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3595f.C45802e;
import com.google.apps.p3589d.p3595f.C45811n;
import com.google.apps.p3589d.p3595f.C45816s;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3595f.C45822y;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45938c;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;
import com.google.apps.p3589d.p3600k.C45947l;
import com.google.common.p4535g.C59203do;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.d.h.q */
/* compiled from: PG */
final class C45891q extends C45883i {

    /* renamed from: f */
    private static final C45721l f120636f;

    /* renamed from: a */
    public final boolean f120637a;

    /* renamed from: g */
    private final C45719j f120638g;

    /* renamed from: h */
    private final C45719j f120639h;

    static {
        C45724o d = C45724o.m81498d();
        d.f120221a.put("⏞", "{");
        d.f120221a.put("⏟", "}");
        d.f120221a.put("⎴", "[");
        d.f120221a.put("⎵", "]");
        f120636f = d.mo49834c();
    }

    private C45891q(C45755n nVar, C45719j jVar, C45719j jVar2, boolean z, C45819v vVar, C45946k kVar, C45946k kVar2) {
        super(nVar, vVar, kVar, kVar2);
        this.f120638g = jVar;
        this.f120639h = jVar2;
        this.f120637a = z;
    }

    /* renamed from: e */
    static C45882h m81933e(C45755n nVar, int i, double d, C45819v vVar) {
        C45822y yVar;
        C45719j jVar;
        int i2;
        C45822y yVar2;
        C45946k kVar;
        int i3 = i;
        double d2 = d;
        C45819v vVar2 = vVar;
        C45822y h = vVar2.mo49968h(C45811n.f120471a, i3, new C45816s(d2));
        if (((C45802e) h).f120436d < d2) {
            String a = C45947l.m82055a(((C45802e) vVar2.mo49967g(i3)).f120437e);
            C45721l lVar = f120636f;
            int i4 = 0;
            int d3 = lVar.f120221a.containsKey(a) ? vVar2.mo49964d((String) lVar.mo49822a(a)) : 0;
            boolean z = d3 > 0;
            if (z) {
                jVar = vVar2.mo49965e(C45811n.f120472b, d3);
            } else {
                jVar = vVar2.mo49965e(C45811n.f120471a, i3);
            }
            C45719j jVar2 = jVar;
            C45891q qVar = null;
            if (jVar2 == null || jVar2.f120220a.size() == 0) {
                yVar = h;
            } else {
                C45723n nVar2 = new C45723n(0);
                C45723n nVar3 = new C45723n(0);
                C45897w.m81951a(vVar, jVar2, d, nVar2, nVar3);
                Objects.requireNonNull(vVar);
                C45719j a2 = nVar2.mo49812a(new C45890p(vVar2));
                double d4 = Double.NEGATIVE_INFINITY;
                double d5 = Double.POSITIVE_INFINITY;
                double d6 = C59203do.f157270a;
                while (i4 < a2.f120220a.size()) {
                    C45822y yVar3 = (C45822y) a2.mo49815d(i4);
                    Double d7 = (Double) nVar3.mo49815d(i4);
                    if (z) {
                        C45946k f = yVar3.mo49951f();
                        yVar2 = h;
                        i2 = i4;
                        kVar = C45946k.m82043h(f.mo50050d(), -f.mo50049c(), f.mo50048b(), -f.mo50047a());
                    } else {
                        i2 = i4;
                        yVar2 = h;
                        kVar = yVar3.mo49951f();
                    }
                    d4 = Math.max(d4, kVar.mo50048b());
                    d5 = Math.min(d5, kVar.mo50050d());
                    d6 = Math.max(d6, d7.doubleValue() + (kVar.mo50047a() - kVar.mo50049c()));
                    i4 = i2 + 1;
                    C45819v vVar3 = vVar;
                    h = yVar2;
                }
                yVar = h;
                C45946k h2 = C45946k.m82043h(C59203do.f157270a, d5, d6, d4);
                qVar = new C45891q(nVar, a2, C45719j.m81475f(nVar3), z, vVar, h2, h2);
            }
            if (qVar != null) {
                return qVar;
            }
        } else {
            yVar = h;
        }
        return C45886l.m81922e(nVar.f120319h, nVar, yVar, C59203do.f157270a, C59203do.f157270a, vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50002d(C45869aj ajVar, C45944i iVar, C45941f fVar) {
        for (int i = 0; i < this.f120638g.f120220a.size(); i++) {
            C45822y yVar = (C45822y) this.f120638g.mo49815d(i);
            if (yVar.mo49947c() > 0) {
                C45937b bVar = (C45937b) iVar;
                ajVar.mo50011b(yVar, bVar.f120725a + ((Double) this.f120639h.mo49815d(i)).doubleValue(), bVar.f120726b, fVar, this.f120637a);
            } else {
                C45937b bVar2 = (C45937b) iVar;
                C45946k j = yVar.mo49951f().mo50064j(bVar2.f120725a + ((Double) this.f120639h.mo49815d(i)).doubleValue(), bVar2.f120726b);
                C45938c cVar = (C45938c) j;
                ajVar.mo50012c(cVar.f120727a, j.mo50061f(), cVar.f120729c, j.mo50061f(), fVar, cVar.f120730d - cVar.f120728b);
            }
        }
    }
}
