package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsBackendImpl$listenForFutureCallbackAndLogResult$1", mo61344c = "InternalDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {337})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cc */
/* compiled from: PG */
final class C121603cc extends C69572j implements C69630p {

    /* renamed from: a */
    int f337399a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f337400b;

    /* renamed from: c */
    final /* synthetic */ String f337401c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121603cc(C60870cx cxVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f337400b = cxVar;
        this.f337401c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121603cc) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f337399a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) C121616cp.f337444a.mo56225c();
                cVar.mo56378ag(C58975e.f156826a, "INV.IntDirectActionsBack");
                C59052c cVar2 = (C59052c) cVar.mo56382g(th);
                String str = this.f337401c;
                cVar2.mo56379ah(new C59094n(35895));
                cVar2.mo56389s("Failed to execute future for %s", str);
            }
        } else {
            C69714l.m101134b(obj);
            C60870cx cxVar = this.f337400b;
            this.f337399a = 1;
            if (C71663i.m104690c(cxVar, this) == aVar) {
                return aVar;
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121603cc(this.f337400b, this.f337401c, gVar);
    }
}
