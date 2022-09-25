package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsGrpcServiceImpl$onDirectActionsInvalidated$1", mo61344c = "InternalDirectActionsGrpcServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {71})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cr */
/* compiled from: PG */
final class C121618cr extends C69572j implements C69630p {

    /* renamed from: a */
    int f337459a;

    /* renamed from: b */
    final /* synthetic */ C121623cw f337460b;

    /* renamed from: c */
    private /* synthetic */ Object f337461c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121618cr(C121623cw cwVar, C69577g gVar) {
        super(2, gVar);
        this.f337460b = cwVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121618cr) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71361ao aoVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f337459a != 0) {
            aoVar = (C71361ao) this.f337461c;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar2 = (C71361ao) this.f337461c;
            C60870cx b = this.f337460b.f337472a.mo105265b(new C121617cq(aoVar2));
            C69664n.m101060f(b, "directActionsBackend\n   …ancel()\n        }\n      }");
            this.f337461c = aoVar2;
            this.f337459a = 1;
            if (C71663i.m104690c(b, this) == aVar) {
                return aVar;
            }
            aoVar = aoVar2;
        }
        aoVar.mo62727D((Throwable) null);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121618cr crVar = new C121618cr(this.f337460b, gVar);
        crVar.f337461c = obj;
        return crVar;
    }
}
