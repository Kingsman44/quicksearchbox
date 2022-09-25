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

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fc */
/* compiled from: PG */
final class C115789fc extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C115791fe f321066a;

    public C115789fc(C115791fe feVar) {
        this.f321066a = feVar;
    }

    /* renamed from: a */
    private final boolean m191914a(String str, int i) {
        C59071e eVar = C115791fe.f321068e;
        C58976aa aaVar = C58975e.f156826a;
        if (!C119123b.m197826a(str)) {
            C59104x d = C115791fe.f321068e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
            ((C59052c) ((C59052c) d).mo56372aa(30049)).mo56389s("Redirected to a non http(s) scheme URI (%s), aborting redirection", str);
            return true;
        }
        if (this.f321066a.f321077I.booleanValue()) {
            C115791fe feVar = this.f321066a;
            if (!feVar.f321078J || i == 2 || (i != 3 && feVar.mo102250g() - this.f321066a.f321076H >= 500)) {
                C115791fe feVar2 = this.f321066a;
                feVar2.f321076H = feVar2.mo102250g();
            } else {
                C115791fe feVar3 = this.f321066a;
                feVar3.f321076H = feVar3.mo102250g();
                this.f321066a.f321096g.mo101919C(str);
                return true;
            }
        }
        return false;
    }

    public final void onPageFinished(WebView webView, String str) {
        C59104x b = C115791fe.f321068e.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
        ((C59052c) ((C59052c) b).mo56372aa(30047)).mo56386p("Page finished.");
        C115791fe feVar = this.f321066a;
        if (!feVar.f321078J) {
            feVar.f321078J = true;
            feVar.mo102253k();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return m191914a(webResourceRequest.getUrl().toString(), true != webResourceRequest.isRedirect() ? 3 : 2);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m191914a(str, 1);
    }
}
