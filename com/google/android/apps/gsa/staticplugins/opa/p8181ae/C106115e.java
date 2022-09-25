package com.google.android.apps.gsa.staticplugins.opa.p8181ae;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4193c.p4194a.C55912b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ae.e */
/* compiled from: PG */
public final class C106115e {

    /* renamed from: a */
    private static final C59071e f296132a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ae.e");

    /* renamed from: b */
    private final C86054o f296133b;

    /* renamed from: c */
    private final C109790aj f296134c;

    public C106115e(C86054o oVar, C109790aj ajVar) {
        this.f296133b = oVar;
        this.f296134c = ajVar;
    }

    /* renamed from: a */
    public final C60870cx mo95287a(C55912b bVar) {
        if (this.f296133b.mo79668a() == null) {
            C59104x c = f296132a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VuiConsentControllerImp");
            ((C59052c) ((C59052c) c).mo56372aa(24712)).mo56386p("Failed to enable setting, account is null");
            return C60856cj.m92899h(new IllegalArgumentException("LoginHelper returned null account"));
        }
        C55912b bVar2 = C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN;
        if (bVar.ordinal() != 6) {
            C59104x c2 = f296132a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "VuiConsentControllerImp");
            ((C59052c) ((C59052c) c2).mo56372aa(24710)).mo56389s("No logic to handle setting %s", bVar.name());
            return C60856cj.m92899h(new UnsupportedOperationException("Cannot handle setting ".concat(String.valueOf(bVar.name()))));
        }
        C58976aa aaVar = C58975e.f156826a;
        bVar.name();
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final boolean mo95288b(int i) {
        Account a = this.f296133b.mo79668a();
        if (a == null) {
            C59104x c = f296132a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VuiConsentControllerImp");
            ((C59052c) ((C59052c) c).mo56372aa(24714)).mo56386p("Failed to acknowledge third party disclosure, account is null");
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f296134c.mo98128j(a, i);
        return true;
    }
}
