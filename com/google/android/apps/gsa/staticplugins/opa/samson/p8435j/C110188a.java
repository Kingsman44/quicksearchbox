package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6988al.C89193a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.util.C113759ab;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.a */
/* compiled from: PG */
public final class C110188a implements C89193a {

    /* renamed from: a */
    private static final C59071e f307026a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.j.a");

    /* renamed from: b */
    private final C60870cx f307027b;

    /* renamed from: c */
    private final C86124t f307028c;

    public C110188a(C113759ab abVar, C86124t tVar) {
        this.f307027b = abVar.mo100603a();
        this.f307028c = tVar;
    }

    /* renamed from: b */
    private final int m183497b() {
        try {
            C90877ak.m148472f(this.f307027b);
            return this.f307028c.mo79746e(C90014bt.f247612kT) ? 1 : 2;
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            C59104x c = f307026a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DLAvailability");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25802)).mo56386p("Fail to update config flags");
            return 0;
        }
    }

    /* renamed from: c */
    private final int m183498c() {
        try {
            C90877ak.m148472f(this.f307027b);
            return this.f307028c.mo79746e(C90014bt.f247200cf) ? 1 : 2;
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            C59104x c = f307026a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DLAvailability");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25803)).mo56386p("Fail to update config flags");
            return 0;
        }
    }

    /* renamed from: a */
    public final String mo19980a(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        if (str.equals("opa_dreamliner_availability")) {
            return Integer.toString(m183498c());
        }
        if (str.equals("opa_dreamliner_ineligible_account")) {
            return Integer.toString(m183497b());
        }
        return null;
    }
}
