package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51817ae;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7642eo;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.ap */
/* compiled from: PG */
public final class C92881ap extends C22538o {

    /* renamed from: a */
    private final C92880ao f259131a;

    public C92881ap(C92880ao aoVar) {
        this.f259131a = aoVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("ui.REFRESH_HQ_INFO")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C92880ao aoVar = this.f259131a;
            if ((((C51817ae) m41992m(dwVar, "refresh_hq_info_args", C51817ae.f135948b.getParserForType())).f135950a & 1) != 0) {
                ((C84160c) aoVar.f259130a.mo27525b()).mo77604e(C7642eo.SHOPPING_LIST_ITEM_ADDED);
                return C22538o.f62144n;
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
