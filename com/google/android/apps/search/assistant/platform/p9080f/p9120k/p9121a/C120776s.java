package com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a;

import com.google.android.apps.search.assistant.platform.p9080f.p9120k.C120779b;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.opahandover.impl.OpaHandoverControllerImpl$supportedClientOps$1", mo61344c = "OpaHandoverControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {77})
/* renamed from: com.google.android.apps.search.assistant.platform.f.k.a.s */
/* compiled from: PG */
final class C120776s extends C69572j implements C69630p {

    /* renamed from: a */
    int f335895a;

    /* renamed from: b */
    final /* synthetic */ C120777t f335896b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120776s(C120777t tVar, C69577g gVar) {
        super(2, gVar);
        this.f335896b = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120776s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335895a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C120777t.f335897a.mo56226d()).mo56382g(th);
                cVar.mo56379ah(new C59094n(35591));
                cVar.mo56386p("Failed to get supported client ops");
                this.f335896b.f335903g.mo104924e(th);
                this.f335896b.f335903g.mo104923d(th);
                C58485gu a = C120779b.m199974a(this.f335896b.f335900d.mo104605c());
                C69664n.m101060f(a, "filterHandoverClientOp(c…oxy.supportedClientOps())");
                return a;
            }
        } else {
            C69714l.m101134b(obj);
            C60870cx c = this.f335896b.f335898b.mo23268c();
            C69664n.m101060f(c, "opaHandover.supportedClientOps");
            this.f335895a = 1;
            obj = C71663i.m104690c(c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C58485gu guVar = (C58485gu) obj;
        this.f335896b.f335903g.mo104924e((Throwable) null);
        C58485gu c2 = this.f335896b.f335900d.mo104605c();
        C69664n.m101060f(c2, "clientExecutionProxy.supportedClientOps()");
        C69664n.m101060f(guVar, "opaSupportedOps");
        List M = C69540x.m100831M(c2, guVar);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : M) {
            if (hashSet.add(((C51785da) next).f135878b)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (!C69664n.m101066l(((C51785da) next2).f135878b, "apa.HANDOVER_TO_OPA")) {
                arrayList2.add(next2);
            }
        }
        return C58479go.m89810b(arrayList2);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120776s(this.f335896b, gVar);
    }
}
