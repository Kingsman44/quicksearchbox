package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.C37414bs;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.resources.audioinput.AudioInputResource$createAudioRequestClient$1", mo61344c = "AudioInputResource.kt", mo61345d = "invokeSuspend", mo61346e = {435})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.r */
/* compiled from: PG */
final class C121802r extends C69572j implements C69630p {

    /* renamed from: a */
    int f338011a;

    /* renamed from: b */
    final /* synthetic */ C121758ag f338012b;

    /* renamed from: c */
    final /* synthetic */ C37404bi f338013c;

    /* renamed from: d */
    private /* synthetic */ Object f338014d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121802r(C121758ag agVar, C37404bi biVar, C69577g gVar) {
        super(2, gVar);
        this.f338012b = agVar;
        this.f338013c = biVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121802r) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338011a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C69714l.m101133a(th);
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f338014d;
            C37404bi biVar = this.f338013c;
            C58976aa aaVar = C58975e.f156826a;
            C60870cx e = biVar.mo40939e();
            C69664n.m101060f(e, "requestClient.deactivateStatus");
            this.f338011a = 1;
            obj = C71663i.m104690c(e, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C37414bs bsVar = (C37414bs) obj;
        C59052c cVar = (C59052c) C121758ag.f337884a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.AudioInput");
        C61301b bVar = this.f338012b.f337890b;
        cVar.mo56379ah(new C59094n(35952));
        cVar.mo56389s("#onClientDeactivated. InvocationToken: %s.", bVar);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121802r rVar = new C121802r(this.f338012b, this.f338013c, gVar);
        rVar.f338014d = obj;
        return rVar;
    }
}
