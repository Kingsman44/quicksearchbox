package com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9090a;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120582b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.assistant.p2511d.C32538am;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.p5575a.C71450g;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.crossdevice.impl.RemoteExecutionControllerImpl$maybeWrapFulfillmentResult$1", mo61344c = "RemoteExecutionControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {79, 82})
/* renamed from: com.google.android.apps.search.assistant.platform.f.c.a.g */
/* compiled from: PG */
final class C120525g extends C69572j implements C69630p {

    /* renamed from: a */
    Object f335186a;

    /* renamed from: b */
    Object f335187b;

    /* renamed from: c */
    int f335188c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f335189d;

    /* renamed from: e */
    final /* synthetic */ C120526h f335190e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120525g(C60870cx cxVar, C120526h hVar, C69577g gVar) {
        super(2, gVar);
        this.f335189d = cxVar;
        this.f335190e = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120525g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f335188c;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx cxVar = this.f335189d;
            this.f335188c = 1;
            obj = C71663i.m104690c(cxVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            obj2 = this.f335187b;
            obj3 = this.f335186a;
            try {
                C69714l.m101134b(obj);
                C32534ai aiVar = (C32534ai) obj2;
                aiVar.mo38135c((Throwable) null);
                return new C120582b(aiVar);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C120526h.f335191a.mo56226d()).mo56382g(th);
                cVar.mo56379ah(new C59094n(35474));
                cVar.mo56386p("Failed to fetch conversation deltas");
                return obj3;
            }
        } else {
            C69714l.m101134b(obj);
        }
        obj3 = (C120601c) obj;
        C32534ai aiVar2 = new C32534ai(this.f335190e.f335194d);
        C71587n a = C32538am.m60349a(new C120522d(obj3));
        C120524f fVar = new C120524f(aiVar2, this.f335190e);
        this.f335186a = obj3;
        this.f335187b = aiVar2;
        this.f335188c = 2;
        if (C71450g.m104241h((C71450g) a, fVar, this) == aVar) {
            return aVar;
        }
        obj2 = aiVar2;
        C32534ai aiVar3 = (C32534ai) obj2;
        aiVar3.mo38135c((Throwable) null);
        return new C120582b(aiVar3);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120525g(this.f335189d, this.f335190e, gVar);
    }
}
