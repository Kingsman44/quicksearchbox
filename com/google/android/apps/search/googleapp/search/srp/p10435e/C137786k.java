package com.google.android.apps.search.googleapp.search.srp.p10435e;

import com.google.android.libraries.web.p3402d.C43758a;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58131b;
import com.google.protobuf.C62934bn;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.BaselineRequestDataFetcher$baselineRequestData$2$baseClientDataHeader$1", mo61344c = "BaselineRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {111})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.k */
/* compiled from: PG */
final class C137786k extends C69572j implements C69630p {

    /* renamed from: a */
    int f374834a;

    /* renamed from: b */
    final /* synthetic */ C137799x f374835b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137786k(C137799x xVar, C69577g gVar) {
        super(2, gVar);
        this.f374835b = xVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137786k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374834a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C43758a aVar2 = this.f374835b.f374888i;
            C58131b bVar = C58131b.f155403h;
            C69664n.m101060f(bVar, "getDefaultInstance()");
            this.f374834a = 1;
            obj = aVar2.f114119a.mo46784a(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C62934bn builder = ((C58131b) obj).toBuilder();
        C69664n.m101060f(builder, "chromeExperiments.append…ltInstance()).toBuilder()");
        return builder;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137786k(this.f374835b, gVar);
    }
}
