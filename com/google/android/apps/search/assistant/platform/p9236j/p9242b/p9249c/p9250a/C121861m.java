package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122057q;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.activitystarter.ApaInternalActivityStarterGrpcClient$startVoiceActivity$2", mo61344c = "ApaInternalActivityStarterGrpcClient.kt", mo61345d = "invokeSuspend", mo61346e = {34})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.m */
/* compiled from: PG */
final class C121861m extends C69572j implements C69630p {

    /* renamed from: a */
    int f338147a;

    /* renamed from: b */
    final /* synthetic */ C34053bp f338148b;

    /* renamed from: c */
    private /* synthetic */ Object f338149c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121861m(C34053bp bpVar, C69577g gVar) {
        super(2, gVar);
        this.f338148b = bpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121861m) mo5194c((C122057q) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338147a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C122057q qVar = (C122057q) this.f338149c;
            C34053bp bpVar = this.f338148b;
            C121837at atVar = (C121837at) C121838au.f338075b.createBuilder();
            C69664n.m101060f(atVar, "newBuilder()");
            C121821ad a = C69664n.m101061g(atVar, "builder");
            if (bpVar != null) {
                a.mo105394b(bpVar);
            }
            C121838au a2 = a.mo105393a();
            this.f338147a = 1;
            obj = qVar.mo105525c(a2, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121861m mVar = new C121861m(this.f338148b, gVar);
        mVar.f338149c = obj;
        return mVar;
    }
}
