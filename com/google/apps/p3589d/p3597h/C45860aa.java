package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3590a.C45699p;
import com.google.apps.p3589d.p3590a.C45703t;
import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3593d.C45737ae;
import com.google.apps.p3589d.p3593d.C45740ah;
import com.google.apps.p3589d.p3593d.C45743b;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45938c;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;

/* renamed from: com.google.apps.d.h.aa */
/* compiled from: PG */
final class C45860aa extends C45882h {

    /* renamed from: a */
    public static final /* synthetic */ int f120564a = 0;

    /* renamed from: f */
    private final C45737ae f120565f;

    /* renamed from: g */
    private final C45894t f120566g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45860aa(C45737ae aeVar, C45894t tVar, C45819v vVar) {
        super(aeVar.f120246a == C45740ah.LINES ? C45880f.f120610b : aeVar, vVar, tVar.f120615d, tVar.f120616e);
        this.f120565f = aeVar;
        this.f120566g = tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C45699p mo50000a(C45703t tVar, C45944i iVar) {
        C45699p k = this.f120566g.mo50016k(tVar, iVar);
        if (this.f120565f.f120246a != C45740ah.LINES || tVar.mo49798d() != ((C45743b) this.f120565f.f120318g).f120260b || tVar.mo49797c() != ((C45743b) this.f120565f.f120318g).f120262d) {
            return k;
        }
        return C45699p.m81425d(k.mo49732b(), k.mo49731a(), C45946k.m82043h(this.f120615d.mo50049c(), this.f120616e.mo50050d(), this.f120615d.mo50047a(), this.f120616e.mo50048b()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C45879e mo50001b(C45944i iVar, C45944i iVar2) {
        int i;
        if (this.f120565f.f120246a != C45740ah.LINES && ((C45937b) iVar).f120725a < ((C45937b) iVar2).f120725a + this.f120615d.mo50049c()) {
            i = ((C45743b) this.f120565f.f120318g).f120260b;
        } else if (this.f120565f.f120246a == C45740ah.LINES || ((C45937b) iVar).f120725a <= ((C45937b) iVar2).f120725a + this.f120615d.mo50047a()) {
            C45712c cVar = new C45712c(this.f120566g.f120644f);
            C45868ai aiVar = null;
            double d = Double.NEGATIVE_INFINITY;
            while (cVar.hasNext()) {
                C45868ai aiVar2 = (C45868ai) cVar.next();
                double g = aiVar2.f120581e.mo50062g(iVar);
                if (aiVar == null || g < d) {
                    aiVar = aiVar2;
                    d = g;
                }
            }
            if (aiVar == null) {
                return C45879e.f120609a;
            }
            C45937b bVar = (C45937b) iVar2;
            C45946k j = aiVar.f120581e.mo50064j(bVar.f120725a, bVar.f120726b);
            C45937b bVar2 = (C45937b) iVar;
            double d2 = bVar2.f120725a;
            double d3 = bVar2.f120726b;
            C45938c cVar2 = (C45938c) j;
            if (d2 < cVar2.f120727a || d2 > cVar2.f120729c || d3 < cVar2.f120728b || d3 > cVar2.f120730d) {
                iVar = new C45937b(Math.max(Math.min(d2, cVar2.f120729c), cVar2.f120727a), Math.max(Math.min(bVar2.f120726b, cVar2.f120730d), cVar2.f120728b));
            }
            return aiVar.mo50018o(iVar, iVar2);
        } else {
            i = ((C45743b) this.f120565f.f120318g).f120261c;
        }
        return C45879e.m81884c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50002d(C45869aj ajVar, C45944i iVar, C45941f fVar) {
        this.f120566g.mo50002d(ajVar, iVar, fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo50003v() {
        return 21;
    }
}
