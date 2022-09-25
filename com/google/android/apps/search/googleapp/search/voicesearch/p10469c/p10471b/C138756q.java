package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.voicesearch.assistantpowered.request.LoadUrlParamsCreator$createForJava$1", mo61344c = "LoadUrlParamsCreator.kt", mo61345d = "invokeSuspend", mo61346e = {44})
/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.q */
/* compiled from: PG */
public final class C138756q extends C69572j implements C69630p {

    /* renamed from: a */
    int f377406a;

    /* renamed from: b */
    final /* synthetic */ C138758s f377407b;

    /* renamed from: c */
    final /* synthetic */ C137542d f377408c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138756q(C138758s sVar, C137542d dVar, C69577g gVar) {
        super(2, gVar);
        this.f377407b = sVar;
        this.f377408c = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138756q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f377406a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138758s sVar = this.f377407b;
            C137542d dVar = this.f377408c;
            this.f377406a = 1;
            obj = C71803m.m105040a(sVar.f377415b, new C138755p(sVar, dVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138756q(this.f377407b, this.f377408c, gVar);
    }
}
