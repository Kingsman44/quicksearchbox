package com.google.android.apps.gsa.staticplugins.p7445bf.p7446a.p7448b;

import android.webkit.WebView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84019n;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.a.b.a */
/* compiled from: PG */
public final /* synthetic */ class C94558a implements C84019n {

    /* renamed from: a */
    public final /* synthetic */ WebView f264498a;

    public /* synthetic */ C94558a(WebView webView) {
        this.f264498a = webView;
    }

    /* renamed from: a */
    public final void mo77481a(boolean z) {
        WebView webView = this.f264498a;
        C59071e eVar = C94560c.f264500b;
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            webView.setVisibility(0);
            return;
        }
        C59104x d = C94560c.f264500b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "VPFragment");
        ((C59052c) ((C59052c) d).mo56372aa(20183)).mo56386p("WebView failed to load.");
    }
}
