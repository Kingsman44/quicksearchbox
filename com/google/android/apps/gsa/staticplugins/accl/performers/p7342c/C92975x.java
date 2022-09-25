package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gcoreclient.p1770i.p1771a.C21564c;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52465st;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.x */
/* compiled from: PG */
public final /* synthetic */ class C92975x implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C92977z f259344a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f259345b;

    /* renamed from: c */
    public final /* synthetic */ C22434e f259346c;

    public /* synthetic */ C92975x(C92977z zVar, C51809dy dyVar, C22434e eVar) {
        this.f259344a = zVar;
        this.f259345b = dyVar;
        this.f259346c = eVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C92977z zVar = this.f259344a;
        C51809dy dyVar = this.f259345b;
        C22434e eVar = this.f259346c;
        C52465st stVar = (C52465st) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (zVar.f259351c.mo79746e(C90014bt.f247436hC)) {
            return C60856cj.m92900i(C92977z.m153018c(stVar));
        }
        if (stVar.f137725b.isEmpty()) {
            return C60856cj.m92900i(C92977z.m153017b(stVar, "Couldn't fetch carrier plan information"));
        }
        try {
            cxVar = C21564c.m40696a(zVar.f259355g.mo27053a(zVar.f259350b, zVar.f259356h.mo27054a().mo27055a()).mo27051b(zVar.f259357i.mo27067a(stVar.f137726c, true)));
        } catch (Exception e) {
            cxVar = C60856cj.m92899h(e);
        }
        return zVar.f259352d.mo28205e(zVar.f259352d.mo28210j(C90877ak.m148471e(cxVar, 5, TimeUnit.SECONDS, zVar.f259352d), "Handle carrier consent status to get FETCH_CARRIER_INFO clientop result", new C92971t(zVar, stVar, dyVar, eVar)), "Catching exception from getConsentInformation API call", Exception.class, C92972u.f259341a);
    }
}
