package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.db */
/* compiled from: PG */
final class C96152db extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C2164c f269169a;

    /* renamed from: b */
    private Uri f269170b;

    public C96152db(C2164c cVar) {
        this.f269169a = cVar;
    }

    public final void onPageFinished(WebView webView, String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f269169a.mo5437b(C118826c.f331422a);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f269170b = Uri.parse(str);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C58976aa aaVar = C58975e.f156826a;
        webResourceRequest.getUrl();
        webResourceError.getErrorCode();
        Uri uri = this.f269170b;
        if (uri == null || C96153dc.m159464b(uri, webResourceRequest.getUrl())) {
            this.f269169a.mo5438c();
        }
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C58976aa aaVar = C58975e.f156826a;
        webResourceRequest.getUrl();
        webResourceResponse.getStatusCode();
        Uri uri = this.f269170b;
        if (uri == null || C96153dc.m159464b(uri, webResourceRequest.getUrl())) {
            this.f269169a.mo5438c();
        }
    }
}
