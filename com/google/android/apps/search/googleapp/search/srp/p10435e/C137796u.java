package com.google.android.apps.search.googleapp.search.srp.p10435e;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.BaselineRequestDataFetcher$getUnicornStatusAndMaybeUpdate$2", mo61344c = "BaselineRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {220})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.u */
/* compiled from: PG */
final class C137796u extends C69572j implements C69630p {

    /* renamed from: a */
    int f374866a;

    /* renamed from: b */
    final /* synthetic */ C137799x f374867b;

    /* renamed from: c */
    final /* synthetic */ String f374868c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137796u(C137799x xVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f374867b = xVar;
        this.f374868c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137796u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374866a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137799x xVar = this.f374867b;
            String str = this.f374868c;
            C69664n.m101060f(str, "accountName");
            this.f374866a = 1;
            int i = C137799x.f374878l;
            if (xVar.mo113961d(str, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137796u(this.f374867b, this.f374868c, gVar);
    }
}
