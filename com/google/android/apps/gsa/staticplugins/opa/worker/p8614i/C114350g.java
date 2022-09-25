package com.google.android.apps.gsa.staticplugins.opa.worker.p8614i;

import com.google.android.apps.gsa.binaries.satin.app.aua;
import com.google.android.apps.gsa.binaries.satin.app.auc;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88344ye;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.i.g */
/* compiled from: PG */
public final class C114350g {

    /* renamed from: a */
    public C89356b f317065a;

    /* renamed from: b */
    private final C88344ye f317066b;

    /* renamed from: c */
    private final C68214a f317067c;

    /* renamed from: d */
    private final C84466a f317068d;

    public C114350g(C88344ye yeVar, C84466a aVar, C68214a aVar2) {
        C58838bb.m90868c(1 != (yeVar.f238915a & 1) ? false : true);
        this.f317066b = yeVar;
        this.f317068d = aVar;
        this.f317067c = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo101300a() {
        C89356b bVar = this.f317065a;
        if (bVar != null) {
            bVar.mo83286e().mo54566a();
        }
        C89356b b = this.f317068d.mo78026b("TapasSearchGraph", C118575h.GRAPH_TAPAS_SEARCH, C118575h.WORKER_TAPAS_SEARCH);
        this.f317065a = b;
        aua aua = (aua) this.f317067c.mo27525b();
        aua.f204350d = b;
        aua.f204349c = "assistant-tapas";
        aua.f204351e = this.f317066b;
        C68225k.m98529a(aua.f204349c, String.class);
        C68225k.m98529a(aua.f204350d, C89356b.class);
        C68225k.m98529a(aua.f204351e, C88344ye.class);
        return new auc(aua.f204347a, aua.f204348b, aua.f204349c, aua.f204350d, aua.f204351e).b.mo60297gq();
    }
}
