package com.google.android.libraries.web.contrib.jsclose;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.contrib.jsclose.$AutoValue_JsCloseFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_JsCloseFeature extends JsCloseFeature {

    /* renamed from: a */
    public final WebFeatureConfig f113950a;

    public C$AutoValue_JsCloseFeature(WebFeatureConfig webFeatureConfig) {
        if (webFeatureConfig != null) {
            this.f113950a = webFeatureConfig;
            return;
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f113950a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JsCloseFeature) {
            return this.f113950a.equals(((JsCloseFeature) obj).mo41576a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f113950a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f113950a.toString();
        return "JsCloseFeature{config=" + obj + "}";
    }
}
