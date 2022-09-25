package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121952m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.vistoken.ApaVisTokenClientImpl$subscribeToStates$subscription$1$3", mo61344c = "ApaVisTokenClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.y */
/* compiled from: PG */
final class C122042y extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f338594a;

    /* renamed from: b */
    final /* synthetic */ C121952m f338595b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122042y(C121952m mVar, C69577g gVar) {
        super(2, gVar);
        this.f338595b = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122042y) mo5194c((C122031n) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C58976aa aaVar = C58975e.f156826a;
        C121952m mVar = this.f338595b;
        C122029l a = C122029l.m201534a(((C122031n) this.f338594a).f338580a);
        if (a == null) {
            a = C122029l.UNRECOGNIZED;
        }
        C69664n.m101060f(a, "it.state");
        C69664n.m101061g(a, "<this>");
        C122014ax axVar = (C122014ax) C122019bb.f338554a.mo56070hd(a);
        if (axVar == null) {
            axVar = C122014ax.UNKNOWN_STATE;
        }
        mVar.mo105468a(axVar);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C122042y yVar = new C122042y(this.f338595b, gVar);
        yVar.f338594a = obj;
        return yVar;
    }
}
