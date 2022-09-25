package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121952m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.vistoken.ApaVisTokenClientImpl$subscribeToStates$subscription$1$4", mo61344c = "ApaVisTokenClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.z */
/* compiled from: PG */
final class C122043z extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C121952m f338596a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122043z(C121952m mVar, C69577g gVar) {
        super(3, gVar);
        this.f338596a = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C122043z(this.f338596a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) C121992ab.f338519a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.TknClt");
        cVar.mo56379ah(new C59094n(36093));
        cVar.mo56386p("subscribeToStates. Completed. Emitting VisState.DESTROYED");
        this.f338596a.mo105468a(C122014ax.DESTROYED);
        return C69788q.f186170a;
    }
}
