package com.google.android.apps.gsa.staticplugins.opa.samson;

import android.accounts.Account;
import android.os.IBinder;
import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.publicsearch.p6481a.C84199a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.c */
/* compiled from: PG */
public final class C110046c implements C84199a {

    /* renamed from: a */
    private final C69464a f306612a;

    public C110046c(C69464a aVar) {
        this.f306612a = aVar;
    }

    /* renamed from: a */
    public final IBinder mo77668a(C58833ax axVar) {
        C110229k kVar = (C110229k) this.f306612a.mo17428b();
        C59104x b = C110229k.f307144a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "IDModeServ");
        ((C59052c) ((C59052c) b).mo56372aa(25539)).mo56386p("onConnected");
        ((C73798aa) kVar.f307151f.mo56107c()).mo65281e();
        kVar.f307159n = false;
        kVar.f307149d = null;
        C110042b bVar = kVar.f307157l;
        C110125e eVar = new C110125e(kVar);
        if (bVar.f306599f.mo79746e(C90014bt.f247129bN)) {
            l lVar = bVar.f306600g;
            Account a = ((C86054o) bVar.f306601h.mo27525b()).mo79668a();
            acu acu = (acu) acv.f128920X.createBuilder();
            acu.copyOnWrite();
            acv acv = (acv) acu.instance;
            acv.f128945a |= 2;
            acv.f128949e = true;
            bVar.f306602i.mo28211k(lVar.j(a, (acv) acu.build(), (C50144me) null, 5, TimeUnit.SECONDS, bVar.getClass().getSimpleName()), "SettingsUiFuture", new C110010a(bVar, eVar));
        }
        return kVar;
    }
}
