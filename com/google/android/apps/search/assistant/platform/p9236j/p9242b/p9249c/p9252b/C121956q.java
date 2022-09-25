package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2600b.C33574g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.assistlayer.AssistLayerInVisWindow$getVoiceInteractionSession$2", mo61344c = "AssistLayerInVisWindow.kt", mo61345d = "invokeSuspend", mo61346e = {136, 138})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.q */
/* compiled from: PG */
final class C121956q extends C69572j implements C69630p {

    /* renamed from: a */
    int f338432a;

    /* renamed from: b */
    final /* synthetic */ C121964y f338433b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121956q(C121964y yVar, C69577g gVar) {
        super(2, gVar);
        this.f338433b = yVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121956q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71816z zVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f338432a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C121964y.f338465a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer");
            cVar.mo56379ah(new C59094n(36035));
            cVar.mo56386p("Requesting window token..");
            C60870cx a = this.f338433b.f338467b.mo105511a();
            this.f338432a = 1;
            if (C71663i.m104690c(a, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            C33504b bVar = (C33504b) obj;
            C59052c cVar2 = (C59052c) C121964y.f338465a.mo56224b();
            cVar2.mo56378ag(C58975e.f156826a, "INV.AssistLayer");
            cVar2.mo56379ah(new C59094n(36037));
            cVar2.mo56386p("Vis retrieved");
            return bVar;
        } else {
            C69714l.m101134b(obj);
        }
        C59052c cVar3 = (C59052c) C121964y.f338465a.mo56224b();
        cVar3.mo56378ag(C58975e.f156826a, "INV.AssistLayer");
        cVar3.mo56379ah(new C59094n(36036));
        cVar3.mo56386p("Window token retrieved");
        C121964y yVar = this.f338433b;
        C33574g gVar = yVar.f338468c;
        this.f338432a = 2;
        synchronized (gVar.f89757b) {
            gVar.f89758c = yVar;
            zVar = gVar.f89759d;
        }
        obj = zVar.mo62825a(this);
        if (obj == aVar) {
            return aVar;
        }
        C33504b bVar2 = (C33504b) obj;
        C59052c cVar22 = (C59052c) C121964y.f338465a.mo56224b();
        cVar22.mo56378ag(C58975e.f156826a, "INV.AssistLayer");
        cVar22.mo56379ah(new C59094n(36037));
        cVar22.mo56386p("Vis retrieved");
        return bVar2;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121956q(this.f338433b, gVar);
    }
}
