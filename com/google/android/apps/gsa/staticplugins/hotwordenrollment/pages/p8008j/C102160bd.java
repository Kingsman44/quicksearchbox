package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.bd */
/* compiled from: PG */
final class C102160bd extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C102166bj f284992a;

    public C102160bd(C102166bj bjVar) {
        this.f284992a = bjVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        ((C59052c) ((C59052c) C102166bj.f285000a.mo56224b()).mo56372aa(20598)).mo56386p("#onPageFinished");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        ((C59052c) ((C59052c) C102166bj.f285000a.mo56226d()).mo56372aa(20599)).mo56359L("#onReceivedError: code - %d, description - %s, url - %s", Integer.valueOf(i), str, str2);
        this.f284992a.f285005e.mo28212l("Move to next screen", new C102159bc(this));
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }
}
