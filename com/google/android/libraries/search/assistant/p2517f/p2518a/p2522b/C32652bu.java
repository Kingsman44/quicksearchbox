package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2703l.C34794h;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.ContextConsumerImpl$getSession$1$1", mo61344c = "ContextConsumerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bu */
/* compiled from: PG */
final class C32652bu extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C34794h f87518a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32652bu(C34794h hVar, C69577g gVar) {
        super(2, gVar);
        this.f87518a = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32652bu) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        this.f87518a.close();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32652bu(this.f87518a, gVar);
    }
}
