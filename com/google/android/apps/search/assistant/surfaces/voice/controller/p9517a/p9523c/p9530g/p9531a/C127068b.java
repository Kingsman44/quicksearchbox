package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71598y;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.timeout.impl.ActiveTimeoutImpl$1", mo61344c = "ActiveTimeoutImpl.kt", mo61345d = "invokeSuspend", mo61346e = {33})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.g.a.b */
/* compiled from: PG */
final class C127068b extends C69572j implements C69630p {

    /* renamed from: a */
    int f349888a;

    /* renamed from: b */
    final /* synthetic */ C71587n f349889b;

    /* renamed from: c */
    final /* synthetic */ C69615a f349890c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127068b(C71587n nVar, C69615a aVar, C69577g gVar) {
        super(2, gVar);
        this.f349889b = nVar;
        this.f349890c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127068b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349888a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n b = C71598y.m104522b(this.f349889b);
            C127067a aVar2 = new C127067a(this.f349890c);
            this.f349888a = 1;
            if (b.mo38165mp(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127068b(this.f349889b, this.f349890c, gVar);
    }
}
