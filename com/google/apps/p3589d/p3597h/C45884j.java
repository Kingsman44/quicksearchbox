package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3590a.C45699p;
import com.google.apps.p3589d.p3590a.C45703t;
import com.google.apps.p3589d.p3593d.C45747f;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.apps.d.h.j */
/* compiled from: PG */
final class C45884j extends C45882h {

    /* renamed from: a */
    public static final /* synthetic */ int f120617a = 0;

    /* renamed from: f */
    private final C45868ai f120618f;

    /* renamed from: g */
    private final C45880f f120619g;

    /* renamed from: h */
    private final C45868ai f120620h;

    private C45884j(C45755n nVar, C45868ai aiVar, C45880f fVar, C45868ai aiVar2, C45819v vVar, C45946k kVar, C45946k kVar2) {
        super(nVar, vVar, kVar, kVar2);
        this.f120618f = aiVar;
        this.f120619g = fVar;
        this.f120620h = aiVar2;
    }

    /* renamed from: e */
    static C45884j m81915e(C45755n nVar, C45882h hVar, C45747f fVar, double d, C45819v vVar) {
        C45819v vVar2 = vVar;
        C45755n nVar2 = nVar;
        C45819v vVar3 = vVar;
        double d2 = d;
        C45882h w = C45866ag.m81844w(8, nVar2, vVar3, fVar.mo49870a(), d2);
        C45882h w2 = C45866ag.m81844w(9, nVar2, vVar3, fVar.mo49871b(), d2);
        C45946k r = w.mo50007r();
        double a = (r.mo50047a() - r.mo50049c()) + C45871al.m81864a(8, hVar.mo50008t(), vVar2);
        C45946k r2 = hVar.mo50007r();
        double a2 = (r2.mo50047a() - r2.mo50049c()) + a + C45871al.m81864a(hVar.mo50009u(), 9, vVar2);
        C45946k r3 = w2.mo50007r();
        double a3 = r3.mo50047a();
        double c = r3.mo50049c();
        double d3 = a2;
        double max = Math.max(w.mo50013f(), Math.max(hVar.mo50013f(), w2.mo50013f()));
        C45882h hVar2 = w;
        double max2 = Math.max(w.mo50014i(), Math.max(hVar.mo50014i(), w2.mo50014i()));
        C45868ai aiVar = new C45868ai(hVar, new C45937b(a, C59203do.f157270a));
        double d4 = d3;
        C45946k q = m81891q(max, max2, d4 + (a3 - c));
        return new C45884j(nVar, aiVar, hVar2, new C45868ai(w2, new C45937b(d4, C59203do.f157270a)), vVar, q, q.mo50066l(aiVar.f120582f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C45699p mo50000a(C45703t tVar, C45944i iVar) {
        return this.f120618f.mo50016k(tVar, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C45879e mo50001b(C45944i iVar, C45944i iVar2) {
        double d = ((C45937b) iVar).f120725a - ((C45937b) iVar2).f120725a;
        if (this.f120619g.mo50007r().mo50060e() > d || d > this.f120620h.f120581e.mo50060e()) {
            return mo50017n(d);
        }
        return this.f120618f.mo50018o(iVar, iVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50002d(C45869aj ajVar, C45944i iVar, C45941f fVar) {
        this.f120619g.mo50002d(ajVar, iVar, fVar);
        this.f120618f.mo50002d(ajVar, iVar, fVar);
        this.f120620h.mo50002d(ajVar, iVar, fVar);
    }
}
