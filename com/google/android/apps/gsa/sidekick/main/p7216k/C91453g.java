package com.google.android.apps.gsa.sidekick.main.p7216k;

import android.accounts.Account;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.proactive.C84174j;
import com.google.android.apps.gsa.proactive.C84182r;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.search.core.C85637av;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98444k;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7749in;
import com.google.p375ai.p378b.C7891nu;
import com.google.p375ai.p378b.C8142xb;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.sidekick.main.k.g */
/* compiled from: PG */
public final /* synthetic */ class C91453g implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C91454h f255082a;

    /* renamed from: b */
    public final /* synthetic */ C8142xb f255083b;

    public /* synthetic */ C91453g(C91454h hVar, C8142xb xbVar) {
        this.f255082a = hVar;
        this.f255083b = xbVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C91454h hVar = this.f255082a;
        C8142xb xbVar = this.f255083b;
        Account a = ((C86054o) hVar.f255087d.mo27525b()).mo79668a();
        if (a == null) {
            C59104x d = C91454h.f255084a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppOpenRefreshHandler");
            ((C59052c) ((C59052c) d).mo56372aa(11730)).mo56386p("No signed-in account. Ignoring container visibility changed.");
        } else if (!((C91376f) hVar.f255088e.mo27525b()).mo85697b() || !((C85651bb) hVar.f255090g.mo27525b()).mo79137J(a.name) || ((C85637av) hVar.f255089f.mo27525b()).mo79116b(a, C7891nu.APP_OPEN_REFRESH)) {
            C98444k k = ((C84160c) hVar.f255086c.mo27525b()).mo77610k(String.format(Locale.US, "Container visibility (%d)", new Object[]{0}));
            ((C84174j) hVar.f255092i.mo27525b()).mo77581b(C7749in.FOREGROUND_START_NOW, xbVar.f28649u, true, k);
            C84182r rVar = (C84182r) hVar.f255093j.mo27525b();
            C90748e.m148224b();
            synchronized (rVar.f229133b) {
                if (rVar.f229135d != -1) {
                    if (k != null) {
                        try {
                            C90877ak.m148472f(rVar.f229134c.mo77611l(k));
                        } catch (InterruptedException | ExecutionException e) {
                            C59104x d2 = C84182r.f229132a.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "SettingsChangeRefresh");
                            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(7074)).mo56386p("Failed to expedite pending request");
                        }
                    }
                    if (((Boolean) C90877ak.m148472f(rVar.f229134c.mo77609j(rVar.f229135d))).booleanValue()) {
                        C58976aa aaVar = C58975e.f156826a;
                    } else {
                        C58976aa aaVar2 = C58975e.f156826a;
                    }
                    rVar.f229135d = -1;
                } else {
                    C58976aa aaVar3 = C58975e.f156826a;
                }
            }
            k.mo91113b();
        } else {
            C59104x d3 = C91454h.f255084a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "AppOpenRefreshHandler");
            ((C59052c) ((C59052c) d3).mo56372aa(11729)).mo56386p("Failed to auto-activate the account");
        }
        return C118826c.f331422a;
    }
}
