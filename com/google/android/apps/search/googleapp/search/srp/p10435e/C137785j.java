package com.google.android.apps.search.googleapp.search.srp.p10435e;

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
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.BaselineRequestDataFetcher$baselineRequestData$2$androidAdvertisingId$1", mo61344c = "BaselineRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {134})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.j */
/* compiled from: PG */
final class C137785j extends C69572j implements C69630p {

    /* renamed from: a */
    int f374832a;

    /* renamed from: b */
    final /* synthetic */ C137799x f374833b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137785j(C137799x xVar, C69577g gVar) {
        super(2, gVar);
        this.f374833b = xVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137785j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374832a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137799x xVar = this.f374833b;
            this.f374832a = 1;
            if (xVar.f374889j.f101930a) {
                obj = null;
            } else if (xVar.f374881b) {
                obj = xVar.f374883d.mo113699b(this);
                if (obj != C69554a.COROUTINE_SUSPENDED) {
                    obj = (String) obj;
                }
            } else {
                C60870cx a = xVar.f374884e.mo103981a();
                C69664n.m101060f(a, "agsaClassicSearchData.advertisingId");
                obj = C71663i.m104690c(a, this);
            }
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137785j(this.f374833b, gVar);
    }
}
