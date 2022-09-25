package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.h */
/* compiled from: PG */
public final /* synthetic */ class C116052h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321800a;

    public /* synthetic */ C116052h(C116070z zVar) {
        this.f321800a = zVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116070z zVar = this.f321800a;
        C59104x d = C116070z.f321840a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "RecentlyStorage");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(30939)).mo56386p("Could not read Recents entries. This will delete Recents history");
        zVar.f321845f.put(zVar.f321850k, C22831b.f62860b);
    }
}
