package com.google.android.libraries.assistant.p1528m.p1529a;

import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.m.a.e */
/* compiled from: PG */
final class C18420e extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ List f52268a;

    /* renamed from: b */
    final /* synthetic */ C18421f f52269b;

    /* renamed from: c */
    final /* synthetic */ C18431p f52270c;

    public C18420e(C18431p pVar, List list, C18421f fVar) {
        this.f52270c = pVar;
        this.f52268a = list;
        this.f52269b = fVar;
    }

    /* renamed from: a */
    private final void m35857a(String str) {
        if (Objects.equals(str, this.f52270c.f52320l.f52296d)) {
            this.f52269b.mo23931g(C18425j.URL_LOAD_FAILURE);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        webView.evaluateJavascript(this.f52270c.f52320l.f52297e, (ValueCallback) null);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        m35857a(str2);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return true;
        }
        if (str.equals(this.f52270c.f52320l.f52296d)) {
            return false;
        }
        List<String> list = this.f52268a;
        if (list != null) {
            for (String startsWith : list) {
                if (str.startsWith(startsWith)) {
                    return false;
                }
            }
        }
        this.f52269b.mo23934j(str);
        return true;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        m35857a(webResourceRequest.getUrl().toString());
    }
}
