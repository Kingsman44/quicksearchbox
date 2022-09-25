package com.google.android.libraries.p579ar.faceviewer.p580a.p586f;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.f.h */
/* compiled from: PG */
final class C10633h extends WebViewClient {
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        ((C59052c) ((C59052c) C10634i.f35519a.mo56226d()).mo56372aa(42302)).mo56359L("Http error for url:%s code:%d reason:%s", webResourceRequest.getUrl(), Integer.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getReasonPhrase());
    }
}
