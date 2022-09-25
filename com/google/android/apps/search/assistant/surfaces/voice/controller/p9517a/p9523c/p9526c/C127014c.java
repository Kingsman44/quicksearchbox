package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.aph;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a.C127071e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a.C127072f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a.C127080n;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a.C127081o;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a.C127082p;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.impl.ControllerServiceBackendImpl$startInteraction$1", mo61344c = "ControllerServiceBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {73})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.c */
/* compiled from: PG */
final class C127014c extends C69572j implements C69626l {

    /* renamed from: a */
    int f349752a;

    /* renamed from: b */
    final /* synthetic */ C127018g f349753b;

    /* renamed from: c */
    final /* synthetic */ C119851cs f349754c;

    /* renamed from: d */
    final /* synthetic */ C127289i f349755d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127014c(C127018g gVar, C119851cs csVar, C127289i iVar, C69577g gVar2) {
        super(1, gVar2);
        this.f349753b = gVar;
        this.f349754c = csVar;
        this.f349755d = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C127014c(this.f349753b, this.f349754c, this.f349755d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349752a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127018g gVar = this.f349753b;
            if (gVar.f349768f) {
                C127081o oVar = gVar.f349769g;
                if (oVar != null) {
                    oVar.close();
                }
                C127018g gVar2 = this.f349753b;
                C127072f fVar = gVar2.f349767e;
                C127013b bVar = new C127013b(gVar2);
                C127034w wVar = (C127034w) gVar2.f349765c.f349746e.mo62784e();
                C69664n.m101061g(wVar, "initialConversationState");
                aph aph = fVar.f349897a;
                C127071e eVar = new C127071e((C71422aw) aph.f199130a.b.f198027a.f199175a.H.mo17428b());
                Duration duration = C127082p.f349931a;
                C127081o oVar2 = new C127081o(bVar, wVar, (C127012af) aph.f199130a.b.f198027a.f199341dG.mo17428b(), (C71422aw) aph.f199130a.a.H.mo17428b(), (Executor) aph.f199130a.a.n.mo17428b(), eVar, (Context) aph.f199130a.a.g.mo17428b());
                oVar2.f349922f = C71803m.m105043d(oVar2.f349920d, (C69585o) null, (C71424ay) null, new C127080n(oVar2, (C69577g) null), 3);
                gVar2.f349769g = oVar2;
            }
            C127012af afVar = this.f349753b.f349765c;
            C34053bp bpVar = this.f349754c.f333808d;
            if (bpVar == null) {
                bpVar = C34053bp.f90753a;
            }
            C69664n.m101060f(bpVar, "request.invocationToken");
            C69664n.m101061g(bpVar, "newInvocationToken");
            afVar.mo107893d(new C127009ac(afVar, bpVar));
            C60870cx a = this.f349753b.f349766d.mo107856a(this.f349754c, this.f349755d);
            C69664n.m101060f(a, "conversationConnectionMa…rt(request, queryContext)");
            this.f349752a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C119834cb cbVar = (C119834cb) obj;
        C127012af afVar2 = this.f349753b.f349765c;
        C69664n.m101060f(cbVar, "interactionId");
        C34053bp bpVar2 = this.f349754c.f333808d;
        if (bpVar2 == null) {
            bpVar2 = C34053bp.f90753a;
        }
        C69664n.m101060f(bpVar2, "request.invocationToken");
        C69664n.m101061g(cbVar, "interactionId");
        C69664n.m101061g(bpVar2, "invocationToken");
        afVar2.mo107893d(new C127008ab(afVar2, bpVar2, cbVar));
        return cbVar;
    }
}
