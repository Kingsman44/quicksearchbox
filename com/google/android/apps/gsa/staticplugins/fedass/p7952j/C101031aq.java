package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.aq */
/* compiled from: PG */
public final /* synthetic */ class C101031aq implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101033as f282145a;

    public /* synthetic */ C101031aq(C101033as asVar) {
        this.f282145a = asVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101033as asVar = this.f282145a;
        Account a = ((C86054o) asVar.f282153h.mo27525b()).mo79668a();
        if (a == null || TextUtils.isEmpty(a.name)) {
            C59104x b = C101033as.f282146a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FedAssExpListener");
            ((C59052c) ((C59052c) b).mo56372aa(19748)).mo56386p("Fed-ass not supported for signed out users.");
            return C60866ct.f164955a;
        } else if (asVar.f282155j.get()) {
            return C100742h.m166944c(((C100719ab) asVar.f282151f.mo27525b()).mo92021e(a.name)).mo92035e(new C101030ap(asVar, a)).f281631a;
        } else {
            if (!((C86124t) asVar.f282154i.mo27525b()).mo79746e(C89978aq.f246602a)) {
                return C60866ct.f164955a;
            }
            C59104x b2 = C101033as.f282146a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "FedAssExpListener");
            ((C59052c) ((C59052c) b2).mo56372aa(19746)).mo56386p("Initializing fed-ass flags.");
            ((C91022f) asVar.f282147b.mo27525b()).mo85301a((C90991b) asVar.f282148c.mo27525b());
            Optional optional = (Optional) asVar.f282150e.mo27525b();
            if (!optional.isPresent()) {
                C59104x c = C101033as.f282146a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "FedAssExpListener");
                ((C59052c) ((C59052c) c).mo56372aa(19747)).mo56386p("TrainingCacheEntryPoint not available while init fedass.");
                return C60866ct.f164955a;
            }
            C100742h c2 = C100742h.m166944c(((C101064o) asVar.f282149d.mo27525b()).mo92134a(a));
            c2.mo92039j(C101024aj.f282135a);
            C100742h e = c2.mo92035e(new C101025ak(optional));
            e.mo92038i(C101026al.f282137a);
            e.mo92039j(new C101027am(asVar));
            return e.f281631a;
        }
    }
}
