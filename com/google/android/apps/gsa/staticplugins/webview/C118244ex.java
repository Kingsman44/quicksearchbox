package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ex */
/* compiled from: PG */
public final /* synthetic */ class C118244ex implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328268a;

    /* renamed from: b */
    public final /* synthetic */ String f328269b;

    public /* synthetic */ C118244ex(C118248fa faVar, String str) {
        this.f328268a = faVar;
        this.f328269b = str;
    }

    public final void run() {
        C118248fa faVar = this.f328268a;
        String str = this.f328269b;
        C118152bo boVar = faVar.f328278g;
        C58976aa aaVar = C58975e.f156826a;
        GsaWebViewContainer a = boVar.mo103559a(str);
        if (a != null) {
            synchronized (boVar.f327930i) {
                boVar.f327931j.remove(str);
            }
            a.mo80858a().destroy();
        }
    }
}
