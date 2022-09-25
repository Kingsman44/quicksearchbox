package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.v */
/* compiled from: PG */
public final /* synthetic */ class C116523v implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116502ad f323093a;

    /* renamed from: b */
    public final /* synthetic */ long f323094b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f323095c;

    public /* synthetic */ C116523v(C116502ad adVar, long j, Bundle bundle) {
        this.f323093a = adVar;
        this.f323094b = j;
        this.f323095c = bundle;
    }

    public final void run() {
        C116502ad adVar = this.f323093a;
        long j = this.f323094b;
        Bundle bundle = this.f323095c;
        Query query = adVar.f323019j.f324189y;
        if (j == query.f252749G) {
            C60870cx cxVar = adVar.f323020k;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
            adVar.f323020k = adVar.f323015f.mo28207g("WebClient.UpdateCurrentWebViewHistoryState", new C116518q(adVar, query, bundle));
        }
    }
}
