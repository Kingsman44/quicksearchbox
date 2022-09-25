package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10295i;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.feature.prewarmer.GoogleAppBrowserPrewarmerImpl$prewarm$2", mo61344c = "GoogleAppBrowserPrewarmerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {46})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.i.b */
/* compiled from: PG */
final class C135857b extends C69572j implements C69630p {

    /* renamed from: a */
    int f370009a;

    /* renamed from: b */
    final /* synthetic */ C135860e f370010b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135857b(C135860e eVar, C69577g gVar) {
        super(2, gVar);
        this.f370010b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135857b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f370009a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx c = this.f370010b.f370015b.mo112386c();
            C135856a aVar2 = C135856a.f370008a;
            C60870cx g = C60922j.m93044g(c, C47810es.m84963c(aVar2), C60826bg.f164896a);
            this.f370009a = 1;
            obj = C71663i.m104690c(g, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135857b(this.f370010b, gVar);
    }
}
