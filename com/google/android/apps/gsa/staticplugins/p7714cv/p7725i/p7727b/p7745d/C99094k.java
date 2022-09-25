package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7745d;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.d.k */
/* compiled from: PG */
public final /* synthetic */ class C99094k implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ Runnable f277081a;

    public /* synthetic */ C99094k(Runnable runnable) {
        this.f277081a = runnable;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Runnable runnable = this.f277081a;
        C59104x d = C99097n.f277084a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CMEngineCallback");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(31497)).mo56386p("Failed to set multi-device decision bit in SearchResult.");
        runnable.run();
    }
}
