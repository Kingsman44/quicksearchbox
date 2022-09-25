package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.execution.session.ExecutionSessionImpl$commit$1", mo61344c = "ExecutionSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {50})
/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.i */
/* compiled from: PG */
final class C120558i extends C69572j implements C69630p {

    /* renamed from: a */
    int f335297a;

    /* renamed from: b */
    final /* synthetic */ C120560k f335298b;

    /* renamed from: c */
    final /* synthetic */ C120601c f335299c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120558i(C120560k kVar, C120601c cVar, C69577g gVar) {
        super(2, gVar);
        this.f335298b = kVar;
        this.f335299c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120558i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335297a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120560k kVar = this.f335298b;
            C120601c cVar = this.f335299c;
            this.f335297a = 1;
            obj = kVar.mo104835b(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120558i(this.f335298b, this.f335299c, gVar);
    }
}
