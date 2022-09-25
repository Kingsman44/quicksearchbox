package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionImpl$1$1$2", mo61344c = "AccessSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {123})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.b */
/* compiled from: PG */
final class C32631b extends C69572j implements C69630p {

    /* renamed from: a */
    int f87441a;

    /* renamed from: b */
    final /* synthetic */ C32607ac f87442b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32631b(C32607ac acVar, C69577g gVar) {
        super(2, gVar);
        this.f87442b = acVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32631b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87441a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69626l lVar = this.f87442b.f87314e;
            this.f87441a = 1;
            if (lVar.mo5761a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32631b(this.f87442b, gVar);
    }
}
