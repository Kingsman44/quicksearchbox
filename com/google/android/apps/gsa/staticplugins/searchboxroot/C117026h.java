package com.google.android.apps.gsa.staticplugins.searchboxroot;

import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8736i.C116920e;
import com.google.android.libraries.searchbox.root.p3199a.C41631e;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.h */
/* compiled from: PG */
public final /* synthetic */ class C117026h implements C41631e {

    /* renamed from: a */
    public final /* synthetic */ C117042x f324909a;

    public /* synthetic */ C117026h(C117042x xVar) {
        this.f324909a = xVar;
    }

    /* renamed from: a */
    public final void mo44212a(Response response) {
        C117042x xVar = this.f324909a;
        C58976aa aaVar = C58975e.f156826a;
        C116920e eVar = xVar.f324970u;
        synchronized (eVar) {
            eVar.f324620c = response;
        }
    }
}
