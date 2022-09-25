package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

import com.google.android.apps.search.googleapp.customtabs.p10151c.C133691m;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.voicesearch.assistantpowered.request.QueryFreeRequestDataFetcher$getRequestDataForNonM5Request$2$customTabsAvailabilityDeferred$1", mo61344c = "QueryFreeRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {172})
/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.ad */
/* compiled from: PG */
final class C138733ad extends C69572j implements C69630p {

    /* renamed from: a */
    int f377316a;

    /* renamed from: b */
    final /* synthetic */ C138736ag f377317b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138733ad(C138736ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f377317b = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138733ad) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f377316a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = this.f377317b.f377331h.mo111336d(C133691m.f364149b);
            this.f377316a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138733ad(this.f377317b, gVar);
    }
}
