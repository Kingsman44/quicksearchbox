package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.configuration.C74464a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90886at;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.ab */
/* compiled from: PG */
public final class C113759ab {

    /* renamed from: a */
    public static final C59071e f315061a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.ab");

    /* renamed from: b */
    public final C86124t f315062b;

    /* renamed from: c */
    private final C68214a f315063c;

    /* renamed from: d */
    private final C90931ca f315064d;

    public C113759ab(C86124t tVar, C68214a aVar, C90931ca caVar) {
        this.f315062b = tVar;
        this.f315063c = aVar;
        this.f315064d = caVar;
    }

    /* renamed from: a */
    public final C60870cx mo100603a() {
        SettableFuture settableFuture = new SettableFuture();
        if (this.f315062b.mo79760z()) {
            C59104x b = f315061a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GsaConfigFlagsSyncer");
            ((C59052c) ((C59052c) b).mo56372aa(28415)).mo56386p("Flags already sync'ed.");
            settableFuture.mo57356n(true);
            return settableFuture;
        }
        C59104x b2 = f315061a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "GsaConfigFlagsSyncer");
        ((C59052c) ((C59052c) b2).mo56372aa(28414)).mo56386p("Flags not sync'ed yet, syncing.");
        C113895z zVar = new C113895z(settableFuture);
        this.f315062b.mo79738i(zVar);
        this.f315064d.mo85142g(settableFuture, new C113758aa(this, zVar));
        ((C74464a) this.f315063c.mo27525b()).mo70780a();
        C90886at.m148485b(settableFuture, 10000, this.f315064d);
        return settableFuture;
    }
}
