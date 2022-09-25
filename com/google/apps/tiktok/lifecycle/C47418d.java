package com.google.apps.tiktok.lifecycle;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.apps.tiktok.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$5$1$1$1$1$1", mo61344c = "RepeatOnLifecycle.kt", mo61345d = "invokeSuspend", mo61346e = {61})
/* renamed from: com.google.apps.tiktok.lifecycle.d */
/* compiled from: PG */
final class C47418d extends C69572j implements C69630p {

    /* renamed from: a */
    int f123169a;

    /* renamed from: b */
    final /* synthetic */ C69630p f123170b;

    /* renamed from: c */
    private /* synthetic */ Object f123171c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47418d(C69630p pVar, C69577g gVar) {
        super(2, gVar);
        this.f123170b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C47418d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f123169a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69630p pVar = this.f123170b;
            this.f123169a = 1;
            if (pVar.mo5192a((C71422aw) this.f123171c, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C47418d dVar = new C47418d(this.f123170b, gVar);
        dVar.f123171c = obj;
        return dVar;
    }
}
