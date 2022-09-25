package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1186a.p1187a;

import com.google.android.gms.contextmanager.C144030d;
import com.google.android.gms.contextmanager.ContextData;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4184bj.p4189b.p4190a.C55876h;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.a.a.j */
/* compiled from: PG */
final class C15849j extends C144030d {

    /* renamed from: a */
    final /* synthetic */ C15854o f47090a;

    public C15849j(C15854o oVar) {
        this.f47090a = oVar;
    }

    /* renamed from: a */
    public final void mo22588a(ContextData contextData) {
        C15854o oVar = this.f47090a;
        if (contextData.mo119530a() != 67) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C63010eb parserForType = C55876h.f148687c.getParserForType();
        try {
            byte[] d = contextData.mo119533d();
            d.getClass();
            MessageLite messageLite = (MessageLite) parserForType.mo59015n(d, C62921ba.m95368a());
            C15843d dVar = new C15843d(oVar);
            C60870cx m = C60856cj.m92904m(C47810es.m84978r(dVar), oVar.f47097b);
            C15842c cVar = new C15842c();
            C46459k.m82829b(C60922j.m93044g(m, C47810es.m84963c(cVar), oVar.f47097b), "Unable to get publishers.", new Object[0]);
        } catch (C62974ct | ClassCastException | NullPointerException e) {
            C59104x c = C15854o.f47096a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AwarenessListener");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46452)).mo56386p("Unable to push Awareness data to publishers");
        }
    }
}
