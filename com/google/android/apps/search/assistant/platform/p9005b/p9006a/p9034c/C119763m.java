package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119801aw;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119804az;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119816bk;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119876dq;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32512e;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32524q;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.c.m */
/* compiled from: PG */
final class C119763m implements C32524q {

    /* renamed from: a */
    final /* synthetic */ C119765o f333607a;

    public C119763m(C119765o oVar) {
        this.f333607a = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo38124a(Object obj) {
        C32796ar arVar;
        C119816bk bkVar;
        C119876dq dqVar = (C119876dq) obj;
        C119751ab abVar = this.f333607a.f333615g;
        int i = dqVar.f333849a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            if (i == 1) {
                arVar = (C32796ar) dqVar.f333850b;
            } else {
                arVar = C32796ar.f87973c;
            }
            if (Collection.EL.stream(abVar.f333587a.f333659b).filter(C119773w.f333638a).anyMatch(new C119774x(arVar))) {
                return C60922j.m93044g(C60856cj.m92905n(C47810es.m84965e(new C119775y(abVar)), abVar.f333589c), C47810es.m84963c(C119776z.f333641a), C60826bg.f164896a);
            }
            throw new C70761fa(Status.f186906d.withDescription("Unsupported key: ".concat(String.valueOf(C32602g.m60429b(arVar)))), (C70334de) null, true);
        } else if (i3 == 1) {
            if (i == 2) {
                bkVar = (C119816bk) dqVar.f333850b;
            } else {
                bkVar = C119816bk.f333729d;
            }
            return C60922j.m93044g(C60856cj.m92905n(C47810es.m84965e(new C119771u(abVar, bkVar)), abVar.f333589c), C47810es.m84963c(C119772v.f333637a), C60826bg.f164896a);
        } else if (i3 != 2) {
            throw new AssertionError();
        } else {
            throw new C119750aa();
        }
    }

    /* renamed from: b */
    public final void mo38125b(C32512e eVar) {
        C17597g gVar = this.f333607a.f333613e;
        C119801aw awVar = (C119801aw) C119804az.f333703c.createBuilder();
        awVar.copyOnWrite();
        C119804az azVar = (C119804az) awVar.instance;
        eVar.getClass();
        azVar.f333706b = eVar;
        azVar.f333705a = 4;
        gVar.mo20123c((C119804az) awVar.build());
    }

    /* renamed from: c */
    public final void mo38126c(Throwable th) {
        C59104x d = C119765o.f333609a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(34571)).mo56386p("Sending error with low quality classification as response to platform_to_client call.");
    }
}
