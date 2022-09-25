package com.google.android.libraries.search.assistant.p2511d;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.async.StreamToAdaptersKt$flowFromStreamTo$1$1$1", mo61344c = "StreamToAdapters.kt", mo61345d = "invokeSuspend", mo61346e = {18})
/* renamed from: com.google.android.libraries.search.assistant.d.aj */
/* compiled from: PG */
final class C32535aj extends C69572j implements C69630p {

    /* renamed from: a */
    int f87146a;

    /* renamed from: b */
    final /* synthetic */ Object f87147b;

    /* renamed from: c */
    final /* synthetic */ C71361ao f87148c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32535aj(C71361ao aoVar, Object obj, C69577g gVar) {
        super(2, gVar);
        this.f87148c = aoVar;
        this.f87147b = obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32535aj) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87146a != 0) {
            C69714l.m101134b(obj);
            return null;
        }
        C69714l.m101134b(obj);
        C71361ao aoVar = this.f87148c;
        Object obj2 = this.f87147b;
        this.f87146a = 1;
        if (aoVar.mo62729v(obj2, this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32535aj(this.f87148c, this.f87147b, gVar);
    }
}
