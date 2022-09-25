package com.google.android.apps.search.googleapp.p10356m;

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

@C69567e(mo61343b = "com.google.common.labs.kotlin.coroutines.FuturesKt$awaitAsync$deferred$1", mo61344c = "Futures.kt", mo61345d = "invokeSuspend", mo61346e = {41})
/* renamed from: com.google.android.apps.search.googleapp.m.e */
/* compiled from: PG */
public final class C136690e extends C69572j implements C69630p {

    /* renamed from: a */
    int f372076a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f372077b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136690e(C60870cx cxVar, C69577g gVar) {
        super(2, gVar);
        this.f372077b = cxVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136690e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f372076a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx cxVar = this.f372077b;
            this.f372076a = 1;
            obj = C71663i.m104690c(cxVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C136690e(this.f372077b, gVar);
    }
}
