package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121949j;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121950k;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
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
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.vistoken.ApaVisTokenClientImpl$subscribeToEvents$subscription$1$3", mo61344c = "ApaVisTokenClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.u */
/* compiled from: PG */
final class C122038u extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f338588a;

    /* renamed from: b */
    final /* synthetic */ C121950k f338589b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122038u(C121950k kVar, C69577g gVar) {
        super(2, gVar);
        this.f338589b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122038u) mo5194c((C122026i) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C58976aa aaVar = C58975e.f156826a;
        C121950k kVar = this.f338589b;
        C122024g a = C122024g.m201533a(((C122026i) this.f338588a).f338567a);
        if (a == null) {
            a = C122024g.UNRECOGNIZED;
        }
        C69664n.m101060f(a, "it.event");
        C69664n.m101061g(a, "<this>");
        C122013aw awVar = (C122013aw) C122016az.f338553a.mo56070hd(a);
        if (awVar == null) {
            awVar = C122013aw.UNKNOWN_EVENT;
        }
        C69664n.m101061g(awVar, "event");
        C121954o oVar = kVar.f338406a;
        C71803m.m105043d(oVar.f338419b, (C69585o) null, (C71424ay) null, new C121949j(oVar, awVar, (C69577g) null), 3);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C122038u uVar = new C122038u(this.f338589b, gVar);
        uVar.f338588a = obj;
        return uVar;
    }
}
