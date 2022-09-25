package com.google.android.apps.gsa.staticplugins.opa.setupwizard.p8447a;

import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.a.j */
/* compiled from: PG */
final class C110449j extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C110450k f307902a;

    public C110449j(C110450k kVar) {
        this.f307902a = kVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        C59071e eVar = C110450k.f307903b;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f307902a.getActivity() == null) {
            C59104x b = C110450k.f307903b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SUWEducationFragment");
            ((C59052c) ((C59052c) b).mo56372aa(26428)).mo56386p("#onPageFinished: ignored due to not being attached to activity");
        } else if (!str.startsWith(this.f307902a.f307912k)) {
            C59104x b2 = C110450k.f307903b.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SUWEducationFragment");
            ((C59052c) ((C59052c) b2).mo56372aa(26427)).mo56389s("#onPageFinished: ignored for an irrelevant url: %s", str);
        } else {
            boolean z = true;
            this.f307902a.f307913l.setDisplayedChild(1);
            C110450k kVar = this.f307902a;
            boolean z2 = kVar.f307904c.mo79746e(C90062dn.f249221t) && "edu1".equals(kVar.f307911j);
            if (!kVar.f307904c.mo79746e(C90062dn.f249222u) || (!"edu2".equals(kVar.f307911j) && !"ngas".equals(kVar.f307911j))) {
                z = false;
            }
            if (z2 || z) {
                C110450k kVar2 = this.f307902a;
                kVar2.f307917p = kVar2.f307910i.mo28208h("timer for loading button texts", 5000, new C110448i(this));
                this.f307902a.f307914m.evaluateJavascript("if (document.readyState === 'complete') {  window.agsa_opasuw_host.loadButtonTexts();} else {  window.onload=function() {    window.agsa_opasuw_host.loadButtonTexts();  };}", (ValueCallback) null);
                return;
            }
            this.f307902a.mo98691h();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C59104x b = C110450k.f307903b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SUWEducationFragment");
        ((C59052c) ((C59052c) b).mo56372aa(26430)).mo56354G("#onReceivedError, description: %s, url: %s", str, str2);
        this.f307902a.mo77318iT().mo77312a();
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C59104x b = C110450k.f307903b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SUWEducationFragment");
        ((C59052c) ((C59052c) b).mo56372aa(26431)).mo56359L("#onReceivedHttpError, url: %s, status_code: %d; reason_phrase: %s", webResourceRequest.getUrl(), Integer.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getReasonPhrase());
        this.f307902a.mo77318iT().mo77312a();
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C59104x b = C110450k.f307903b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SUWEducationFragment");
        ((C59052c) ((C59052c) b).mo56372aa(26429)).mo56395y("#onReceivedError, code: %d, description: %s", webResourceError.getErrorCode(), webResourceError.getDescription());
        this.f307902a.mo77318iT().mo77312a();
    }
}
