package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71665da;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionImpl$1$1$1", mo61344c = "AccessSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {117})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.a */
/* compiled from: PG */
final class C32604a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f87297a;

    /* renamed from: b */
    int f87298b;

    /* renamed from: c */
    final /* synthetic */ C32607ac f87299c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32604a(C32607ac acVar, C69577g gVar) {
        super(2, gVar);
        this.f87299c = acVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32604a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87298b != 0) {
            obj2 = this.f87297a;
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                this.f87299c.f87323n.mo63050j(th);
            }
        } else {
            C69714l.m101134b(obj);
            C32607ac acVar = this.f87299c;
            C71816z zVar = acVar.f87323n;
            this.f87297a = zVar;
            this.f87298b = 1;
            obj = acVar.mo38185f(this);
            if (obj == aVar) {
                return aVar;
            }
            obj2 = zVar;
        }
        ((C71665da) obj2).mo62909P(obj);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32604a(this.f87299c, gVar);
    }
}
