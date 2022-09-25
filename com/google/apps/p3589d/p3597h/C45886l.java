package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3595f.C45802e;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3595f.C45822y;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.apps.d.h.l */
/* compiled from: PG */
final class C45886l extends C45883i {

    /* renamed from: a */
    public final C45822y f120626a;

    /* renamed from: f */
    private final double f120627f;

    /* renamed from: g */
    private final double f120628g;

    /* renamed from: h */
    private final int f120629h;

    public C45886l(int i, C45755n nVar, C45822y yVar, double d, double d2, C45819v vVar, C45946k kVar, C45946k kVar2) {
        super(nVar, vVar, kVar, kVar2);
        this.f120629h = i;
        this.f120626a = yVar;
        this.f120627f = d;
        this.f120628g = d2;
    }

    /* renamed from: e */
    static C45886l m81922e(int i, C45755n nVar, C45822y yVar, double d, double d2, C45819v vVar) {
        double d3 = d;
        C45802e eVar = (C45802e) yVar;
        C45946k q = m81891q(yVar.mo49970g() - d3, yVar.mo49971h() + d3, eVar.f120436d - d2);
        return new C45886l(i, nVar, yVar, C59203do.f157270a, d3, vVar, q, q.mo50066l(eVar.f120435c.mo50064j(C59203do.f157270a, -d3)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50002d(C45869aj ajVar, C45944i iVar, C45941f fVar) {
        C45937b bVar = (C45937b) iVar;
        ajVar.mo50011b(this.f120626a, bVar.f120725a - this.f120627f, bVar.f120726b - this.f120628g, fVar, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo50003v() {
        return this.f120629h;
    }
}
