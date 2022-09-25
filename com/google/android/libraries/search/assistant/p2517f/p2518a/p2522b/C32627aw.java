package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionRootService$run$2$1$1", mo61344c = "AccessSessionRootService.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.aw */
/* compiled from: PG */
final class C32627aw extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C32636be f87430a;

    /* renamed from: b */
    final /* synthetic */ List f87431b;

    /* renamed from: c */
    private /* synthetic */ Object f87432c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32627aw(C32636be beVar, List list, C69577g gVar) {
        super(2, gVar);
        this.f87430a = beVar;
        this.f87431b = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32627aw) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f87432c;
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C32624at(this.f87430a, this.f87431b, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C32625au(this.f87430a, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C32626av(this.f87430a, this.f87431b, (C69577g) null), 3);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32627aw awVar = new C32627aw(this.f87430a, this.f87431b, gVar);
        awVar.f87432c = obj;
        return awVar;
    }
}
