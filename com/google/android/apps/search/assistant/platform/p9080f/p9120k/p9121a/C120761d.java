package com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
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
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.opahandover.impl.OpaHandoverControllerImpl$getExperimentIds$1", mo61344c = "OpaHandoverControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {96})
/* renamed from: com.google.android.apps.search.assistant.platform.f.k.a.d */
/* compiled from: PG */
final class C120761d extends C69572j implements C69630p {

    /* renamed from: a */
    int f335869a;

    /* renamed from: b */
    final /* synthetic */ C120777t f335870b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120761d(C120777t tVar, C69577g gVar) {
        super(2, gVar);
        this.f335870b = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120761d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C58485gu guVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335869a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C120777t.f335897a.mo56226d()).mo56382g(th);
                cVar.mo56379ah(new C59094n(35588));
                cVar.mo56386p("Failed to get experiment IDs");
                this.f335870b.f335903g.mo104921b(th);
                guVar = C58485gu.m89845m();
            }
        } else {
            C69714l.m101134b(obj);
            C60870cx b = this.f335870b.f335898b.mo23267b();
            C69664n.m101060f(b, "opaHandover.experimentIds");
            this.f335869a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        guVar = (C58485gu) obj;
        this.f335870b.f335903g.mo104921b((Throwable) null);
        C69664n.m101060f(guVar, "try {\n        val experi…mmutableList.of()\n      }");
        return guVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120761d(this.f335870b, gVar);
    }
}
