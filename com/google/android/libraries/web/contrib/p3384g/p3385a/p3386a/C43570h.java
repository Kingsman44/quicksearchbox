package com.google.android.libraries.web.contrib.p3384g.p3385a.p3386a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69588r;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.contrib.prewarm.internal.weblayer.WebLayerProfilePrewarmer$prewarmProfile$2", mo61344c = "WebLayerProfilePrewarmer.kt", mo61345d = "invokeSuspend", mo61346e = {35})
/* renamed from: com.google.android.libraries.web.contrib.g.a.a.h */
/* compiled from: PG */
final class C43570h extends C69572j implements C69630p {

    /* renamed from: a */
    int f113751a;

    /* renamed from: b */
    final /* synthetic */ C43572j f113752b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43570h(C43572j jVar, C69577g gVar) {
        super(2, gVar);
        this.f113752b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C43570h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f113751a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C43572j jVar = this.f113752b;
            this.f113751a = 1;
            C69588r rVar = new C69588r(C69555b.m100961b(this));
            jVar.f113756b.mo47218i(new C43569g(jVar, rVar));
            if (rVar.mo61355a() == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C43570h(this.f113752b, gVar);
    }
}
