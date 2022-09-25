package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.android.voiceinteraction.session.conformity.VoiceInteractionSessionConformityClientImpl$subscribe$subscription$1", mo61344c = "VoiceInteractionSessionConformityClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.f */
/* compiled from: PG */
final class C120060f extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f334233a;

    /* renamed from: b */
    final /* synthetic */ C120124o f334234b;

    /* renamed from: c */
    final /* synthetic */ C120077w f334235c;

    /* renamed from: d */
    final /* synthetic */ AtomicReference f334236d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120060f(C120124o oVar, C120077w wVar, AtomicReference atomicReference, C69577g gVar) {
        super(2, gVar);
        this.f334234b = oVar;
        this.f334235c = wVar;
        this.f334236d = atomicReference;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120060f) mo5194c((C120054ap) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C120053ao aoVar;
        C120124o oVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C120054ap apVar = (C120054ap) this.f334233a;
        C59052c cVar = (C59052c) C120064j.f334241a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.VIS.Conformity");
        int b = C120049ak.m198955b(apVar.f334223a);
        String a = C120049ak.m198954a(b);
        if (b != 0) {
            C120124o oVar2 = this.f334234b;
            cVar.mo56379ah(new C59094n(34637));
            cVar.mo56354G("On conformity message(%s) @ %s.", a, oVar2);
            int b2 = C120049ak.m198955b(apVar.f334223a);
            int i = b2 - 1;
            C120055aq aqVar = C120055aq.UNKNOWN;
            if (b2 != 0) {
                if (i == 0) {
                    this.f334235c.mo17549a();
                } else if (i == 1) {
                    if (apVar.f334223a == 2) {
                        aoVar = (C120053ao) apVar.f334224b;
                    } else {
                        aoVar = C120053ao.f334218b;
                    }
                    C120055aq a2 = C120055aq.m198956a(aoVar.f334220a);
                    if (a2 == null) {
                        a2 = C120055aq.UNRECOGNIZED;
                    }
                    C120124o oVar3 = this.f334234b;
                    AtomicReference atomicReference = this.f334236d;
                    int ordinal = a2.ordinal();
                    if (ordinal == 1) {
                        oVar = C120124o.CLASSIC;
                    } else if (ordinal == 2) {
                        oVar = C120124o.APA;
                    } else {
                        throw new CancellationException("Malformed session type " + a2.name() + ".");
                    }
                    C59052c cVar2 = (C59052c) C120064j.f334241a.mo56224b();
                    cVar2.mo56378ag(C58975e.f156826a, "TRG.VIS.Conformity");
                    cVar2.mo56379ah(new C59094n(34638));
                    cVar2.mo56354G("On new platform variance value(%s) @ %s.", oVar, oVar3);
                    atomicReference.set(oVar);
                } else if (i == 2) {
                    int b3 = C120049ak.m198955b(apVar.f334223a);
                    String a3 = C120049ak.m198954a(b3);
                    if (b3 != 0) {
                        throw new CancellationException("Malformed conformity message " + a3 + ".");
                    }
                    throw null;
                }
                return C69788q.f186170a;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120060f fVar = new C120060f(this.f334234b, this.f334235c, this.f334236d, gVar);
        fVar.f334233a = obj;
        return fVar;
    }
}
