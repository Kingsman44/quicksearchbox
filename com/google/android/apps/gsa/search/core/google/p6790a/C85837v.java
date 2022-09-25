package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gcoreclient.p1770i.p1771a.C21564c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3917i.p3918a.C51265bh;
import com.google.assistant.p3897e.p3917i.p3918a.C51267bj;
import com.google.assistant.p3897e.p3917i.p3918a.C51270bm;
import com.google.assistant.p3897e.p3921j.C52522uw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.v */
/* compiled from: PG */
public final /* synthetic */ class C85837v implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C85841z f232087a;

    public /* synthetic */ C85837v(C85841z zVar) {
        this.f232087a = zVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C85841z zVar = this.f232087a;
        C52522uw uwVar = (C52522uw) obj;
        C58976aa aaVar = C58975e.f156826a;
        C51265bh a = zVar.mo79472a();
        if (a == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (zVar.f232097c.mo79746e(C90014bt.f247435hB)) {
            a.copyOnWrite();
            C51270bm bmVar = (C51270bm) a.instance;
            C51270bm bmVar2 = C51270bm.f133476f;
            uwVar.getClass();
            bmVar.f133482e = uwVar;
            bmVar.f133478a |= 16;
            C51267bj b = C85841z.m137917b(uwVar);
            a.copyOnWrite();
            C51270bm bmVar3 = (C51270bm) a.instance;
            b.getClass();
            bmVar3.f133481d = b;
            bmVar3.f133478a |= 8;
            return C60856cj.m92900i(C58833ax.m90834k((C51270bm) a.build()));
        }
        String str = uwVar.f137871f;
        if (str.isEmpty()) {
            return C60856cj.m92900i(zVar.mo79475f(5, "Couldn't check consent status because of invalid CPID."));
        }
        try {
            cxVar = C21564c.m40696a(zVar.f232100f.mo27053a(zVar.f232096b, zVar.f232101g.mo27054a().mo27055a()).mo27051b(zVar.f232102h.mo27067a(str, false)));
        } catch (Exception e) {
            cxVar = C60856cj.m92899h(e);
        }
        return zVar.f232098d.mo28205e(zVar.f232098d.mo28209i(cxVar, "Update carrier params based on user consent status", new C85834s(uwVar, a)), "Catching exceptions from getConsentInformation API call", Exception.class, new C85835t(zVar));
    }
}
