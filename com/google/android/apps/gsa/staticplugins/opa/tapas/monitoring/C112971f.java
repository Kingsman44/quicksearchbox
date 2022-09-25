package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4543n.p4550f.C59436i;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.f */
/* compiled from: PG */
public final /* synthetic */ class C112971f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C68214a f313051a;

    public /* synthetic */ C112971f(C68214a aVar) {
        this.f313051a = aVar;
    }

    public final void run() {
        C68214a aVar = this.f313051a;
        C59436i iVar = C112982q.f313099a;
        C111248k kVar = (C111248k) aVar.mo27525b();
        if (kVar.mo99077b()) {
            kVar.mo99076a(C111255r.FETCH_LATENCY, "Enable screen by setting the 'enable_tapas_fetch_latency_monitor' flag.");
            kVar.mo99076a(C111255r.FETCH_LATENCY_SUMMARY, "Enable screen by setting the 'enable_tapas_fetch_latency_monitor' flag.");
        }
    }
}
