package com.google.android.apps.gsa.search.core;

import android.accounts.Account;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7146u.C90618b;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91266f;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.j */
/* compiled from: PG */
public final class C86131j extends C90888av implements C118549h {

    /* renamed from: a */
    private static final C59071e f232799a = C59071e.m91332i("com.google.android.apps.gsa.search.core.j");

    /* renamed from: b */
    private final C91266f f232800b;

    /* renamed from: c */
    private final C86054o f232801c;

    public C86131j(C91266f fVar, C86054o oVar) {
        super("FetchLocationReportingStates", 2, 4);
        this.f232800b = fVar;
        this.f232801c = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        run();
        return C118826c.f331423b;
    }

    public final void run() {
        C58976aa aaVar = C58975e.f156826a;
        if (r1 != 0) {
            for (Account b : this.f232801c.mo79684r()) {
                try {
                    this.f232800b.mo85539b(b);
                } catch (C90618b e) {
                    C59104x d = f232799a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "FetchLocationReportingS");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7387)).mo56386p("Error getting reporting state");
                }
            }
        }
    }
}
