package com.google.android.libraries.search.assistant.p2511d;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.async.ListenableFutureAdaptersKt$voidFuture$1", mo61344c = "ListenableFutureAdapters.kt", mo61345d = "invokeSuspend", mo61346e = {14})
/* renamed from: com.google.android.libraries.search.assistant.d.w */
/* compiled from: PG */
final class C32560w extends C69572j implements C69630p {

    /* renamed from: a */
    int f87198a;

    /* renamed from: b */
    final /* synthetic */ C69630p f87199b;

    /* renamed from: c */
    private /* synthetic */ Object f87200c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32560w(C69630p pVar, C69577g gVar) {
        super(2, gVar);
        this.f87199b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32560w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87198a != 0) {
            C69714l.m101134b(obj);
            return null;
        }
        C69714l.m101134b(obj);
        C69630p pVar = this.f87199b;
        this.f87198a = 1;
        if (pVar.mo5192a((C71422aw) this.f87200c, this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32560w wVar = new C32560w(this.f87199b, gVar);
        wVar.f87200c = obj;
        return wVar;
    }
}
