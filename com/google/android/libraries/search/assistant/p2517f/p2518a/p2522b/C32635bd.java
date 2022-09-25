package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionRootService$token$1", mo61344c = "AccessSessionRootService.kt", mo61345d = "invokeSuspend", mo61346e = {84})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bd */
/* compiled from: PG */
final class C32635bd extends C69572j implements C69626l {

    /* renamed from: a */
    int f87458a;

    /* renamed from: b */
    final /* synthetic */ C32636be f87459b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32635bd(C32636be beVar, C69577g gVar) {
        super(1, gVar);
        this.f87459b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C32635bd(this.f87459b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87458a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f87459b.f87461b;
            this.f87458a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
