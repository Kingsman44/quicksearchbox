package com.google.android.apps.gsa.staticplugins.opa.webview;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.aq */
/* compiled from: PG */
public final /* synthetic */ class C114202aq implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114206au f316668a;

    public /* synthetic */ C114202aq(C114206au auVar) {
        this.f316668a = auVar;
    }

    public final void run() {
        C114206au auVar = this.f316668a;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (auVar) {
            if (!auVar.f316691t) {
                auVar.f316691t = true;
                C22871g gVar = auVar.f316674c;
                gVar.mo28211k(gVar.mo28207g("maybeCreateWebView", new C114197al(auVar)), "postCreateWebView", new C114205at(auVar));
            }
        }
    }
}
