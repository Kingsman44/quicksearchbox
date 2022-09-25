package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.search.assistant.libraries.p8979j.p8980a.C119410a;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128426a;
import com.google.android.libraries.assistant.p1533o.C18438aa;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import com.google.android.libraries.assistant.p1533o.C18508z;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.a */
/* compiled from: PG */
final class C128385a implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C128436f f353101a;

    /* renamed from: b */
    final /* synthetic */ C128416ak f353102b;

    /* renamed from: c */
    final /* synthetic */ C18460aw f353103c;

    /* renamed from: d */
    final /* synthetic */ C128426a f353104d;

    public C128385a(C128436f fVar, C128416ak akVar, C18460aw awVar, C128426a aVar) {
        this.f353101a = fVar;
        this.f353102b = akVar;
        this.f353103c = awVar;
        this.f353104d = aVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C119410a aVar = (C119410a) obj;
        C69664n.m101061g(aVar, "handoverConfiguration");
        C128436f fVar = this.f353101a;
        C128416ak akVar = this.f353102b;
        C18460aw awVar = this.f353103c;
        C128426a aVar2 = this.f353104d;
        if (aVar.mo104331c()) {
            C18508z zVar = akVar.f353178d;
            zVar.copyOnWrite();
            C18438aa aaVar = C18438aa.f52334e;
            ((C18438aa) zVar.instance).f52339d = true;
            try {
                akVar.mo108416e();
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C128416ak.f353175a.mo56226d()).mo56382g(th);
                cVar.mo56378ag(C38505d.f101864b, 202809203);
                ((C59052c) cVar.mo56372aa(38845)).mo56354G("#sendAssistantBrandingEnabled failed in state %s with %s", akVar.f353179e, th.getMessage());
            }
        }
        C128414ai a = fVar.f353227c.mo66628a(awVar, aVar, akVar, aVar2);
        C69664n.m101060f(a, "callbacks");
        C128435e eVar = new C128435e(fVar, a, awVar, aVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(eVar), fVar.f353228d);
        C128419b bVar = new C128419b(akVar, aVar2);
        C60856cj.m92911t(m, C47810es.m84974n(bVar), fVar.f353228d);
        return m;
    }
}
