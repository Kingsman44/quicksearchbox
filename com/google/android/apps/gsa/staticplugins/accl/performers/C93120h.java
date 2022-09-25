package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88102pf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88103pg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88104ph;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52528vb;
import com.google.assistant.p3897e.p3921j.C52529vc;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h */
/* compiled from: PG */
public final class C93120h extends C22538o {

    /* renamed from: a */
    private final C93076g f259752a;

    public C93120h(C93076g gVar) {
        this.f259752a = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("history.DELETE_ENTRIES_FROM_CLIENT")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52529vc vcVar = (C52529vc) m41992m(dwVar, "history_deletion_args", C52529vc.f137883b.getParserForType());
            C93076g gVar = this.f259752a;
            int size = vcVar.f137885a.size();
            if (size > 0) {
                C88103pg pgVar = (C88103pg) C88104ph.f238195b.createBuilder();
                for (int i = 0; i < size; i++) {
                    pgVar.mo81986a(((C52528vb) vcVar.f137885a.get(i)).f137881a);
                }
                C87684al alVar = new C87684al(C88244um.OPA_DELETE_HISTORY_ENTRIES);
                alVar.mo81965b(C88102pf.f238194a, (C88104ph) pgVar.build());
                ServiceEventData a = alVar.mo81964a();
                C86775r rVar = ((C86610af) gVar.f259627a.mo27525b()).f233977l;
                if (rVar != null) {
                    rVar.f234383e.mo80379b(a);
                }
            }
            return C22538o.f62144n;
        }
        throw new C22428d(dyVar);
    }
}
