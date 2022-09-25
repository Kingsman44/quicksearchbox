package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.connections.impl.TriggeringConnectionManagerImpl$connect$1$1", mo61344c = "TriggeringConnectionManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {33})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.a.a.m */
/* compiled from: PG */
final class C34367m extends C69572j implements C69630p {

    /* renamed from: a */
    int f91363a;

    /* renamed from: b */
    /* synthetic */ Object f91364b;

    /* renamed from: c */
    final /* synthetic */ C34358d f91365c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34367m(C34358d dVar, C69577g gVar) {
        super(2, gVar);
        this.f91365c = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34367m) mo5194c((C34117z) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91363a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34358d dVar = this.f91365c;
            this.f91363a = 1;
            if (dVar.mo39325f((C34117z) this.f91364b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34367m mVar = new C34367m(this.f91365c, gVar);
        mVar.f91364b = obj;
        return mVar;
    }
}
