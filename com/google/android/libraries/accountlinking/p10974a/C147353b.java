package com.google.android.libraries.accountlinking.p10974a;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.p4522b.C58800sl;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.accountlinking.a.b */
/* compiled from: PG */
final class C147353b extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C147362c f397765a;

    public C147353b(C147362c cVar) {
        this.f397765a = cVar;
    }

    public final void onPageFinished(WebView webView, String str) {
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f397765a.mo124127b(str2);
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (!C147362c.f397788c.matcher(webResourceRequest.getUrl().toString()).matches()) {
            this.f397765a.mo124128d();
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.f397765a.mo124127b(webResourceRequest.getUrl().toString());
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null || C147362c.f397788c.matcher(str).matches()) {
            return null;
        }
        C58800sl lA = C147362c.f397787b.iterator();
        while (lA.hasNext()) {
            if (str.startsWith((String) lA.next())) {
                return null;
            }
        }
        return new WebResourceResponse("text/plain", "UTF-8", (InputStream) null);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C58800sl lA = C147362c.f397786a.iterator();
        while (lA.hasNext()) {
            if (str.startsWith((String) lA.next())) {
                return false;
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f397765a.startActivity(intent);
        return true;
    }
}
