package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.android.voiceinteraction.session.conformity.VoiceInteractionSessionConformityServiceImpl$subscribe$1", mo61344c = "VoiceInteractionSessionConformityServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {58})
/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.af */
/* compiled from: PG */
final class C120044af extends C69572j implements C69630p {

    /* renamed from: a */
    int f334206a;

    /* renamed from: b */
    final /* synthetic */ C120047ai f334207b;

    /* renamed from: c */
    final /* synthetic */ C120045ag f334208c;

    /* renamed from: d */
    private /* synthetic */ Object f334209d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120044af(C120047ai aiVar, C120045ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f334207b = aiVar;
        this.f334208c = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120044af) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C120124o oVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334206a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f334209d;
            C120055aq a = C120055aq.m198956a(this.f334207b.f334215a);
            if (a == null) {
                a = C120055aq.UNRECOGNIZED;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                oVar = C120124o.CLASSIC;
            } else if (ordinal != 2) {
                C120055aq a2 = C120055aq.m198956a(this.f334207b.f334215a);
                if (a2 == null) {
                    a2 = C120055aq.UNRECOGNIZED;
                }
                throw new CancellationException("Malformed session type " + a2 + ".");
            } else {
                oVar = C120124o.APA;
            }
            C120042ad adVar = new C120042ad(oVar, aoVar);
            C59052c cVar = (C59052c) C120045ag.f334210a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "TRG.VIS.Conformity");
            cVar.mo56379ah(new C59094n(34649));
            cVar.mo56389s("Adding conformity tracking session(%s).", adVar);
            if (this.f334208c.f334211b.mo62808g((Object) null, adVar)) {
                C120043ae aeVar = new C120043ae(adVar, this.f334208c);
                this.f334206a = 1;
                if (C71360an.m104022a(aoVar, aeVar, this) == aVar) {
                    return aVar;
                }
            } else {
                throw new CancellationException("Unexpected session reference value.");
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120044af afVar = new C120044af(this.f334207b, this.f334208c, gVar);
        afVar.f334209d = obj;
        return afVar;
    }
}
