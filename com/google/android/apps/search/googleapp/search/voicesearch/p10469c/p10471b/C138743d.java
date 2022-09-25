package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.voicesearch.assistantpowered.request.BaselineRequestDataFetcher$baselineRequestData$2$clientDataHeader$1", mo61344c = "BaselineRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {114})
/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.d */
/* compiled from: PG */
final class C138743d extends C69572j implements C69630p {

    /* renamed from: a */
    int f377343a;

    /* renamed from: b */
    final /* synthetic */ C138754o f377344b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138743d(C138754o oVar, C69577g gVar) {
        super(2, gVar);
        this.f377344b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138743d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f377343a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138754o oVar = this.f377344b;
            C60870cx a = oVar.f377387b.mo115317a(true, oVar.f377390e);
            C69664n.m101060f(a, "clientDataHeaderFetcher\n…useCompressedXClientData)");
            this.f377343a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138743d(this.f377344b, gVar);
    }
}
