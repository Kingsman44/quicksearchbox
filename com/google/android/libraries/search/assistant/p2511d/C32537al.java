package com.google.android.libraries.search.assistant.p2511d;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.async.StreamToAdaptersKt$flowFromStreamTo$1", mo61344c = "StreamToAdapters.kt", mo61345d = "invokeSuspend", mo61346e = {22})
/* renamed from: com.google.android.libraries.search.assistant.d.al */
/* compiled from: PG */
final class C32537al extends C69572j implements C69630p {

    /* renamed from: a */
    int f87150a;

    /* renamed from: b */
    final /* synthetic */ C69626l f87151b;

    /* renamed from: c */
    private /* synthetic */ Object f87152c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32537al(C69626l lVar, C69577g gVar) {
        super(2, gVar);
        this.f87151b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32537al) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87150a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            this.f87150a = 1;
            if (C71663i.m104690c((C60870cx) this.f87151b.mo5761a(new C32536ak((C71361ao) this.f87152c)), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32537al alVar = new C32537al(this.f87151b, gVar);
        alVar.f87152c = obj;
        return alVar;
    }
}
