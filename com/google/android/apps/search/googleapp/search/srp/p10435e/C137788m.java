package com.google.android.apps.search.googleapp.search.srp.p10435e;

import com.google.common.util.concurrent.C60856cj;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.srp.request.BaselineRequestDataFetcher$baselineRequestData$2$clientDataHeader$1", mo61344c = "BaselineRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {124})
/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.m */
/* compiled from: PG */
final class C137788m extends C69572j implements C69630p {

    /* renamed from: a */
    int f374837a;

    /* renamed from: b */
    final /* synthetic */ C137799x f374838b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f374839c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137788m(C137799x xVar, C60870cx cxVar, C69577g gVar) {
        super(2, gVar);
        this.f374838b = xVar;
        this.f374839c = cxVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137788m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374837a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C137799x xVar = this.f374838b;
            C60870cx b = xVar.f374885f.mo115318b(true, true, this.f374839c, C60856cj.m92900i(Boolean.valueOf(xVar.f374889j.f101930a)));
            this.f374837a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137788m(this.f374838b, this.f374839c, gVar);
    }
}
