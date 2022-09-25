package com.google.android.apps.gsa.staticplugins.searchboxroot;

import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.shared.p6990an.p6992b.C89210a;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.libraries.searchbox.root.p3199a.C41631e;
import com.google.android.libraries.searchbox.shared.response.C41658m;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.q */
/* compiled from: PG */
public final /* synthetic */ class C117035q implements C41631e {

    /* renamed from: a */
    public final /* synthetic */ C117042x f324919a;

    public /* synthetic */ C117035q(C117042x xVar) {
        this.f324919a = xVar;
    }

    /* renamed from: a */
    public final void mo44212a(Response response) {
        C117042x xVar = this.f324919a;
        C58976aa aaVar = C58975e.f156826a;
        if (xVar.f324969t) {
            xVar.f324961l.mo83160f();
        }
        C86338r a = ((C86127w) xVar.f324958i.mo27525b()).f232790a.mo79722a();
        C41658m b = C89210a.m145114b(response);
        C86341u uVar = new C86341u((C86346z) a);
        uVar.mo80068c("bootstrapping_suggest_response_proto", C90734ar.m148201d(b.toByteArray()));
        uVar.mo80086l(false);
        if (xVar.f324971v.mo78205l()) {
            xVar.f324965p.mo103032a(b);
        }
        xVar.f324954c.sendBroadcast(C89257aa.m145193e());
    }
}
