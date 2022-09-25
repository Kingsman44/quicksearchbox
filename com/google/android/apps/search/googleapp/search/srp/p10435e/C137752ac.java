package com.google.android.apps.search.googleapp.search.srp.p10435e;

import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.QueryFreeRequestDataDataService$asyncInstanceState$1", mo61344c = "QueryFreeRequestDataDataService.kt", mo61345d = "invokeSuspend", mo61346e = {115})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.ac */
/* compiled from: PG */
final class C137752ac extends C69572j implements C69626l {

    /* renamed from: a */
    int f374720a;

    /* renamed from: b */
    final /* synthetic */ C137764ao f374721b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137752ac(C137764ao aoVar, C69577g gVar) {
        super(1, gVar);
        this.f374721b = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C137752ac(this.f374721b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374720a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137764ao aoVar = this.f374721b;
            boolean z = aoVar.f374756b;
            this.f374720a = 1;
            obj = C71803m.m105040a(aoVar.f374761g, new C137762am(aoVar, z, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
