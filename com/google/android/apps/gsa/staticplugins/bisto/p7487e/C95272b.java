package com.google.android.apps.gsa.staticplugins.bisto.p7487e;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95131x;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.e.b */
/* compiled from: PG */
public final /* synthetic */ class C95272b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95283m f266572a;

    /* renamed from: b */
    public final /* synthetic */ ClientEventData f266573b;

    public /* synthetic */ C95272b(C95283m mVar, ClientEventData clientEventData) {
        this.f266572a = mVar;
        this.f266573b = clientEventData;
    }

    public final void run() {
        C95283m mVar = this.f266572a;
        ClientEventData clientEventData = this.f266573b;
        C95131x xVar = mVar.f266597g;
        xVar.getClass();
        xVar.mo89056a();
        mVar.mo89197g();
        C58976aa aaVar = C58975e.f156826a;
        ((C60870cx) mVar.f266598h.getAndSet(mVar.f266593c.mo28208h("TTS Result timeout", 1000, new C95275e(mVar)))).cancel(false);
        mVar.f266596f.mo81937i(clientEventData);
    }
}
