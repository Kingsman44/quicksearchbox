package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9789b;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127113e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127114f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127116h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129540c;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.p2585i.C33481e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3922a.C51644b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62971cq;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.b.c */
/* compiled from: PG */
public final class C128997c implements C129146c {

    /* renamed from: a */
    private static final C59071e f354424a = C59071e.m91331h();

    /* renamed from: b */
    private static final C33480d f354425b = C33480d.m62053a("dismiss_assistant_args", "assistant.api.client_op.core.DismissAssistantArgs", C51644b.f134574d);

    /* renamed from: c */
    private static final String f354426c = "ui.DISMISS";

    /* renamed from: d */
    private final C127118j f354427d;

    /* renamed from: e */
    private final C129540c f354428e;

    public C128997c(C127118j jVar, C129540c cVar) {
        this.f354427d = jVar;
        this.f354428e = cVar;
    }

    /* renamed from: a */
    public final C129228e mo108791a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        C59052c cVar = (C59052c) f354424a.mo56224b();
        cVar.mo56379ah(new C59094n(38280));
        cVar.mo56386p("perform: core.DISMISS_ASSISTANT");
        C69664n.m101061g(dyVar, "clientOp");
        if (!C69664n.m101066l(dyVar.f135936b, f354426c)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C62971cq cqVar = dwVar.f135932a;
            C69664n.m101060f(cqVar, "clientOp.args.argList");
            C33480d dVar = f354425b;
            C69664n.m101060f(dVar, "DISMISS_ASSISTANT_ARGS");
            C51644b bVar = (C51644b) C33481e.m62059b(cqVar, dVar);
            if (bVar == null || !bVar.f134578c) {
                C127118j jVar = this.f354427d;
                C127113e eVar = (C127113e) C127114f.f350009c.createBuilder();
                C69664n.m101060f(eVar, "newBuilder()");
                C127116h a = C69664n.m101061g(eVar, "builder");
                a.mo107939b(C127050h.CLIENT_OP_DISMISS_ASSISTANT);
                C46459k.m82829b(jVar.mo107932h(a.mo107938a()), "Stopping interaction failed", new Object[0]);
            }
        }
        this.f354428e.mo109080a();
        return C129228e.f354974b;
    }
}
