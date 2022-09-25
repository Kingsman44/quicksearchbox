package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.v */
/* compiled from: PG */
public final /* synthetic */ class C95165v implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ String f266264a;

    public /* synthetic */ C95165v(String str) {
        this.f266264a = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        String str = this.f266264a;
        TimeoutException timeoutException = (TimeoutException) obj;
        C59104x d = C95144aj.f266188a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) d).mo56372aa(18207)).mo56389s("queryDeviceInfoAndStartOobeActivity: Unknown device id for %s", str);
    }
}
