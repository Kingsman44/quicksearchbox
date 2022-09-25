package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9491b.C126490o;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.InitialRequestFactory$createNew$2$1$pinholeParamsAsync$1", mo61344c = "InitialRequestFactory.kt", mo61345d = "invokeSuspend", mo61346e = {117})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.n */
/* compiled from: PG */
final class C126591n extends C69572j implements C69630p {

    /* renamed from: a */
    int f348607a;

    /* renamed from: b */
    final /* synthetic */ C71604be f348608b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126591n(C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f348608b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126591n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348607a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126490o oVar = C126490o.f348375a;
            C71604be beVar = this.f348608b;
            this.f348607a = 1;
            obj = oVar.mo107622b(beVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126591n(this.f348608b, gVar);
    }
}
