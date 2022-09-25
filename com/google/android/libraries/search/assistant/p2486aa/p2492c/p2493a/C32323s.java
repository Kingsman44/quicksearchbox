package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.speechbiasingcontext.service.impl.ContextFetcher$parallelMap$2$1", mo61344c = "ContextFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {151})
/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.s */
/* compiled from: PG */
final class C32323s extends C69572j implements C69630p {

    /* renamed from: a */
    int f86620a;

    /* renamed from: b */
    final /* synthetic */ C69630p f86621b;

    /* renamed from: c */
    final /* synthetic */ Object f86622c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32323s(C69630p pVar, Object obj, C69577g gVar) {
        super(2, gVar);
        this.f86621b = pVar;
        this.f86622c = obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32323s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f86620a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69630p pVar = this.f86621b;
            Object obj2 = this.f86622c;
            this.f86620a = 1;
            obj = pVar.mo5192a(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32323s(this.f86621b, this.f86622c, gVar);
    }
}
