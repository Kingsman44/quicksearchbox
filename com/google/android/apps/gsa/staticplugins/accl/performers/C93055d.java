package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88116pt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88117pu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88120px;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3899b.p3901b.C50879f;
import com.google.assistant.p3897e.p3899b.p3901b.C50880g;
import com.google.assistant.p3897e.p3899b.p3901b.C50881h;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.d */
/* compiled from: PG */
public final class C93055d extends C22538o {

    /* renamed from: a */
    private final C92924c f259575a;

    public C93055d(C92924c cVar) {
        this.f259575a = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("client.RECONNECT")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C50879f fVar = (C50879f) m41992m(dwVar, "client_reconnect_args", C50879f.f132476b.getParserForType());
            C92924c cVar = this.f259575a;
            C88117pu puVar = (C88117pu) C88120px.f238222d.createBuilder();
            long a = ((C86124t) cVar.f259242b.mo27525b()).mo79743a(C90014bt.f247632kn);
            puVar.copyOnWrite();
            C88120px pxVar = (C88120px) puVar.instance;
            pxVar.f238224a |= 1;
            pxVar.f238225b = (int) a;
            C87684al alVar = new C87684al(C88244um.OPA_KEEP_SCREEN_ON);
            alVar.mo81965b(C88116pt.f238220a, (C88120px) puVar.build());
            ServiceEventData a2 = alVar.mo81964a();
            C86775r rVar = ((C86610af) cVar.f259241a.mo27525b()).f233977l;
            if (rVar != null) {
                rVar.f234383e.mo80379b(a2);
            }
            C50880g gVar = (C50880g) C50881h.f132480c.createBuilder();
            C63088z zVar = fVar.f132478a;
            gVar.copyOnWrite();
            C50881h hVar = (C50881h) gVar.instance;
            zVar.getClass();
            hVar.f132482a |= 1;
            hVar.f132483b = zVar;
            return C60856cj.m92900i(C22402a.m41821a("client_reconnect_result", "assistant.api.client_op.ClientReconnectResult", (C50881h) gVar.build()));
        }
        throw new C22428d(dyVar);
    }
}
