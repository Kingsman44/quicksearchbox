package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ey */
/* compiled from: PG */
public final /* synthetic */ class C118245ey implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328270a;

    public /* synthetic */ C118245ey(C118248fa faVar) {
        this.f328270a = faVar;
    }

    public final void run() {
        C118152bo boVar = this.f328270a.f328278g;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (boVar.f327928g) {
            for (int i = 0; i < boVar.f327929h.size(); i++) {
                ((C118119ai) boVar.f327929h.valueAt(i)).mo103539m();
            }
            boVar.f327929h.clear();
        }
        synchronized (boVar.f327930i) {
            for (GsaWebViewContainer a : boVar.f327931j.values()) {
                a.mo80858a().destroy();
            }
            boVar.f327931j.clear();
        }
    }
}
