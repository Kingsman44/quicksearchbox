package com.google.android.libraries.web.contrib.p3384g.p3385a.p3386a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.contrib.prewarm.internal.weblayer.WebLayerProfilePrewarmer$prewarmProfileForJava$1", mo61344c = "WebLayerProfilePrewarmer.kt", mo61345d = "invokeSuspend", mo61346e = {46})
/* renamed from: com.google.android.libraries.web.contrib.g.a.a.i */
/* compiled from: PG */
final class C43571i extends C69572j implements C69630p {

    /* renamed from: a */
    int f113753a;

    /* renamed from: b */
    final /* synthetic */ C43572j f113754b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43571i(C43572j jVar, C69577g gVar) {
        super(2, gVar);
        this.f113754b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C43571i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f113753a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C43572j jVar = this.f113754b;
            this.f113753a = 1;
            Object a = C71803m.m105040a(jVar.f113757c, new C43570h(jVar, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C43571i(this.f113754b, gVar);
    }
}
