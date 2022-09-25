package com.google.android.libraries.web.webview.contrib.setup;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.webview.contrib.setup.$AutoValue_WebViewSetupFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_WebViewSetupFeature extends WebViewSetupFeature {

    /* renamed from: a */
    public final WebFeatureConfig f115389a;

    public C$AutoValue_WebViewSetupFeature(WebFeatureConfig webFeatureConfig) {
        if (webFeatureConfig != null) {
            this.f115389a = webFeatureConfig;
            return;
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f115389a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WebViewSetupFeature) {
            return this.f115389a.equals(((WebViewSetupFeature) obj).mo41576a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f115389a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f115389a.toString();
        return "WebViewSetupFeature{config=" + obj + "}";
    }
}
