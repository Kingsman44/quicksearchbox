package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

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
import p5488io.grpc.p5533i.C70868g;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.opahandover.impl.HandoverSessionImpl$start$handoverDoneDeferred$1", mo61344c = "HandoverSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.assistant.c.f.a.o */
/* compiled from: PG */
final class C17290o extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C17291p f50097a;

    /* renamed from: b */
    final /* synthetic */ C70868g f50098b;

    /* renamed from: c */
    private /* synthetic */ Object f50099c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17290o(C17291p pVar, C70868g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f50097a = pVar;
        this.f50098b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17290o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f50099c;
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C17287l(this.f50097a, this.f50098b, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C17288m(this.f50097a, awVar, (C69577g) null), 3);
        return C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C17289n(this.f50097a, awVar, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C17290o oVar = new C17290o(this.f50097a, this.f50098b, gVar);
        oVar.f50099c = obj;
        return oVar;
    }
}
