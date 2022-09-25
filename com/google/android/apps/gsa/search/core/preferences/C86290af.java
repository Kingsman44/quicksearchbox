package com.google.android.apps.gsa.search.core.preferences;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.af */
/* compiled from: PG */
final class C86290af extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ SignedOutPersonalizationFragment f233329a;

    public C86290af(SignedOutPersonalizationFragment signedOutPersonalizationFragment) {
        this.f233329a = signedOutPersonalizationFragment;
    }

    public final void onPageFinished(WebView webView, String str) {
        webView.evaluateJavascript("(function recordSignedOutSearchCustomizationBitChanges() {  var dom_observer = new MutationObserver(function(mutations) {    interface.setSignedOutSearchCustomizationEnabled(      document.getElementsByTagName('input')[0].checked);  });  var container = document.querySelector('div[data-domain]');  var config = { childList: true, subtree: true };  if (container) {    dom_observer.observe(container, config);  }})();", (ValueCallback) null);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        if (!"https".equals(parse.getScheme()) || !this.f233329a.f233321h.contains(parse.getHost())) {
            return true;
        }
        webView.loadUrl(str);
        return true;
    }
}
