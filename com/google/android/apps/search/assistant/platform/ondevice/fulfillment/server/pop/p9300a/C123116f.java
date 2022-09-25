package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9286c.C122761a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9286c.C122762b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123047cn;
import com.google.android.libraries.assistant.portable.C19116x;
import com.google.android.libraries.assistant.portable.C19117y;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5030q.C65173eg;
import com.google.protos.p4985f.p5030q.C65174eh;
import com.google.protos.p4985f.p5030q.C65175ei;
import com.google.protos.p4985f.p5030q.C65176ej;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.f */
/* compiled from: PG */
final class C123116f implements AutoCloseable, C122761a {

    /* renamed from: a */
    public static final C59071e f340757a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.f");

    /* renamed from: b */
    private final PortableAssistant f340758b;

    /* renamed from: c */
    private final C122762b f340759c;

    public C123116f(PortableAssistant portableAssistant, C122762b bVar) {
        this.f340758b = portableAssistant;
        this.f340759c = bVar;
        bVar.mo105733a(this);
    }

    public final void close() {
        this.f340759c.mo105735c(this);
    }

    /* renamed from: d */
    public final void mo105718d(C65753ak akVar) {
        if (akVar.equals(C65753ak.APP_ACTIONS)) {
            C65175ei eiVar = (C65175ei) C65176ej.f176380b.createBuilder();
            C65173eg egVar = (C65173eg) C65174eh.f176377b.createBuilder();
            egVar.copyOnWrite();
            ((C65174eh) egVar.instance).f176379a = 2;
            eiVar.copyOnWrite();
            C65176ej ejVar = (C65176ej) eiVar.instance;
            C65174eh ehVar = (C65174eh) egVar.build();
            ehVar.getClass();
            C62971cq cqVar = ejVar.f176382a;
            if (!cqVar.mo58948c()) {
                ejVar.f176382a = C62942bv.mutableCopy(cqVar);
            }
            ejVar.f176382a.add(ehVar);
            C60870cx f = this.f340758b.mo24260f(new C19116x((C65176ej) eiVar.build()));
            C19117y yVar = C19117y.f53581a;
            C123047cn.m202382b(C60922j.m93045h(f, C47810es.m84966f(yVar), C60826bg.f164896a), C123115e.f340756a, C60826bg.f164896a);
        }
    }
}
