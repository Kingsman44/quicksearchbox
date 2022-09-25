package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.l */
/* compiled from: PG */
public final /* synthetic */ class C98922l implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ Runnable f276459a;

    public /* synthetic */ C98922l(Runnable runnable) {
        this.f276459a = runnable;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Runnable runnable = this.f276459a;
        C59104x d = C98932v.f276474a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CarEngineCallback");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(31294)).mo56386p("Failed to set multi-device decision bit in SearchResult.");
        runnable.run();
    }
}
