package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3590a.C45699p;
import com.google.apps.p3589d.p3590a.C45703t;
import com.google.apps.p3589d.p3593d.C45743b;
import com.google.apps.p3589d.p3593d.C45765x;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45938c;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;

/* renamed from: com.google.apps.d.h.v */
/* compiled from: PG */
final class C45896v extends C45882h {

    /* renamed from: a */
    public static final /* synthetic */ int f120650a = 0;

    /* renamed from: f */
    private final C45868ai f120651f;

    /* renamed from: g */
    private final C45868ai f120652g;

    /* renamed from: h */
    private final C45868ai f120653h;

    /* renamed from: i */
    private final double f120654i;

    /* renamed from: j */
    private final double f120655j;

    /* renamed from: k */
    private final double f120656k;

    public C45896v(C45765x xVar, C45868ai aiVar, C45868ai aiVar2, C45868ai aiVar3, double d, double d2, double d3, C45819v vVar, C45946k kVar, C45946k kVar2) {
        super(xVar, vVar, kVar, kVar2);
        this.f120651f = aiVar;
        this.f120652g = aiVar2;
        this.f120653h = aiVar3;
        this.f120654i = d;
        this.f120655j = d2;
        this.f120656k = d3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C45699p mo50000a(C45703t tVar, C45944i iVar) {
        C45868ai aiVar = this.f120653h;
        if (aiVar != null) {
            C45699p k = aiVar.mo50016k(tVar, iVar);
            if (!k.mo49794e()) {
                return k;
            }
        }
        C45699p k2 = this.f120651f.mo50016k(tVar, iVar);
        return !k2.mo49794e() ? k2 : C45699p.f120208d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50002d(C45869aj ajVar, C45944i iVar, C45941f fVar) {
        C45869aj ajVar2 = ajVar;
        C45944i iVar2 = iVar;
        C45941f fVar2 = fVar;
        this.f120651f.mo50002d(ajVar, iVar, fVar2);
        C45868ai aiVar = this.f120653h;
        if (aiVar != null) {
            aiVar.mo50002d(ajVar, iVar, fVar2);
        }
        this.f120652g.mo50002d(ajVar, iVar, fVar2);
        C45937b bVar = (C45937b) iVar2;
        double d = bVar.f120725a + ((C45937b) this.f120651f.f120580a).f120725a;
        double d2 = bVar.f120726b;
        double d3 = this.f120654i;
        double d4 = this.f120656k;
        double d5 = (d2 + d3) - (d4 / 2.0d);
        ajVar.mo50012c(d, d5, d + this.f120655j, d5, fVar, d4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C45879e mo50001b(C45944i iVar, C45944i iVar2) {
        double d = ((C45937b) iVar).f120725a - ((C45937b) iVar2).f120725a;
        if (this.f120653h != null) {
            double c = this.f120615d.mo50049c();
            C45868ai aiVar = this.f120653h;
            C45938c cVar = (C45938c) aiVar.f120581e;
            double d2 = (c + cVar.f120727a) / 2.0d;
            double d3 = (cVar.f120729c + ((C45938c) this.f120651f.f120581e).f120727a) / 2.0d;
            if (d <= d2) {
                return C45879e.m81884c(((C45743b) this.f120611c.f120318g).f120260b);
            }
            if (d > d2 && d < d3) {
                return aiVar.mo50018o(iVar, iVar2);
            }
        } else if (d < (this.f120615d.mo50049c() + ((C45938c) this.f120651f.f120581e).f120727a) / 2.0d) {
            return C45879e.m81884c(((C45743b) this.f120611c.f120318g).f120260b);
        }
        return this.f120651f.mo50018o(iVar, iVar2);
    }
}
