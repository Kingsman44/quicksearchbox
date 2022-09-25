package com.google.android.apps.gsa.search.core.webview;

import android.webkit.WebView;

/* compiled from: PG */
public final class AutoValue_GsaWebViewContainer extends GsaWebViewContainer {

    /* renamed from: a */
    private final WebView f235709a;

    /* renamed from: b */
    private final String f235710b;

    public AutoValue_GsaWebViewContainer(WebView webView, String str) {
        this.f235709a = webView;
        if (str != null) {
            this.f235710b = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public final WebView mo80858a() {
        return this.f235709a;
    }

    /* renamed from: b */
    public final String mo80859b() {
        return this.f235710b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GsaWebViewContainer) {
            GsaWebViewContainer gsaWebViewContainer = (GsaWebViewContainer) obj;
            WebView webView = this.f235709a;
            if (webView != null ? webView.equals(gsaWebViewContainer.mo80858a()) : gsaWebViewContainer.mo80858a() == null) {
                if (this.f235710b.equals(gsaWebViewContainer.mo80859b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f235709a);
        String str = this.f235710b;
        return "GsaWebViewContainer{webView=" + valueOf + ", id=" + str + "}";
    }

    public final int hashCode() {
        int i;
        WebView webView = this.f235709a;
        if (webView == null) {
            i = 0;
        } else {
            i = webView.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ this.f235710b.hashCode();
    }
}
