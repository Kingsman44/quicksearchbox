package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c;

import java.util.List;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69613f;
import p5462h.C69714l;
import p5462h.C69747m;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69644aa;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.pinhole.OutputParser$parse$1", mo61344c = "OutputParser.kt", mo61345d = "invokeSuspend", mo61346e = {51})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.c.t */
/* compiled from: PG */
public final class C126512t extends C69572j implements C69630p {

    /* renamed from: a */
    int f348424a;

    /* renamed from: b */
    final /* synthetic */ C71587n f348425b;

    /* renamed from: c */
    final /* synthetic */ C126513u f348426c;

    /* renamed from: d */
    private /* synthetic */ Object f348427d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126512t(C71587n nVar, C126513u uVar, C69577g gVar) {
        super(2, gVar);
        this.f348425b = nVar;
        this.f348426c = uVar;
    }

    /* renamed from: e */
    public static final List m206856e(C69613f fVar) {
        return (List) fVar.mo5768a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126512t) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348424a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            StringBuilder sb = new StringBuilder();
            C69644aa aaVar = new C69644aa();
            C69747m mVar = new C69747m(new C126511s(aaVar, sb));
            C69747m mVar2 = new C69747m(new C126510r(aaVar, this.f348426c, mVar));
            C71587n nVar = this.f348425b;
            C126509q qVar = new C126509q(sb, aaVar, (C71588o) this.f348427d, mVar, mVar2);
            this.f348424a = 1;
            if (nVar.mo38165mp(qVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126512t tVar = new C126512t(this.f348425b, this.f348426c, gVar);
        tVar.f348427d = obj;
        return tVar;
    }
}
