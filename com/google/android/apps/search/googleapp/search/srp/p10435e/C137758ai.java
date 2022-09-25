package com.google.android.apps.search.googleapp.search.srp.p10435e;

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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.QueryFreeRequestDataDataService$getAndCacheQueryFreeRequestDataInternal$2$1$customTabsAvailabilityDeferred$1", mo61344c = "QueryFreeRequestDataDataService.kt", mo61345d = "invokeSuspend", mo61346e = {157})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.ai */
/* compiled from: PG */
final class C137758ai extends C69572j implements C69630p {

    /* renamed from: a */
    int f374732a;

    /* renamed from: b */
    final /* synthetic */ C137764ao f374733b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137758ai(C137764ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f374733b = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137758ai) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374732a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = this.f374733b.f374768n.mo111336d(C133691m.f364149b);
            this.f374732a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137758ai(this.f374733b, gVar);
    }
}
