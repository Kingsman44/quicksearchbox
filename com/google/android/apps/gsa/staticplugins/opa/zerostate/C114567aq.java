package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.aq */
/* compiled from: PG */
public final /* synthetic */ class C114567aq implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114575ay f317700a;

    public /* synthetic */ C114567aq(C114575ay ayVar) {
        this.f317700a = ayVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114575ay ayVar = this.f317700a;
        Exception exc = (Exception) obj;
        synchronized (ayVar.f317756p) {
            C58976aa aaVar = C58975e.f156826a;
        }
        try {
            ayVar.f317758r.mo101664b();
            ayVar.f317758r.mo101666d();
            ayVar.f317758r.mo101665c();
        } catch (IllegalArgumentException e) {
            C59104x d = C114575ay.f317711a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSMainController");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29175)).mo56386p("#startSpinner(): Failed to show snackbar.");
        }
        ayVar.f317759s = false;
        ayVar.f317760t = false;
        SwipeRefreshLayout swipeRefreshLayout = ayVar.f317712A;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.mo8794l(false, false);
        }
    }
}
