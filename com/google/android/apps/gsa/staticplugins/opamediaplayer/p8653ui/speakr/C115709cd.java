package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8927e.C119123b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.cd */
/* compiled from: PG */
final class C115709cd extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C115711cf f320910a;

    public C115709cd(C115711cf cfVar) {
        this.f320910a = cfVar;
    }

    /* renamed from: a */
    private final boolean m191829a(String str, int i) {
        C59071e eVar = C115711cf.f320912e;
        C58976aa aaVar = C58975e.f156826a;
        if (!C119123b.m197826a(str)) {
            C59104x d = C115711cf.f320912e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
            ((C59052c) ((C59052c) d).mo56372aa(30001)).mo56389s("Redirected to a non http(s) scheme URI (%s), aborting redirection", str);
            return true;
        }
        if (this.f320910a.f320915C.booleanValue()) {
            C115711cf cfVar = this.f320910a;
            if (!cfVar.f320916D || i == 2 || (i != 3 && cfVar.mo102207g() - this.f320910a.f320914B >= 500)) {
                C115711cf cfVar2 = this.f320910a;
                cfVar2.f320914B = cfVar2.mo102207g();
            } else {
                C115711cf cfVar3 = this.f320910a;
                cfVar3.f320914B = cfVar3.mo102207g();
                this.f320910a.f320936g.mo101919C(str);
                return true;
            }
        }
        return false;
    }

    public final void onPageFinished(WebView webView, String str) {
        C59104x b = C115711cf.f320912e.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
        ((C59052c) ((C59052c) b).mo56372aa(29999)).mo56386p("Page finished.");
        C115711cf cfVar = this.f320910a;
        if (!cfVar.f320916D) {
            cfVar.f320916D = true;
            cfVar.mo102210k();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return m191829a(webResourceRequest.getUrl().toString(), true != webResourceRequest.isRedirect() ? 3 : 2);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m191829a(str, 1);
    }
}
