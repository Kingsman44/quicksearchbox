package com.google.android.libraries.web.webview.contrib.geolocationpermission;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.webview.contrib.geolocationpermission.$AutoValue_GeolocationPermissionFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_GeolocationPermissionFeature extends GeolocationPermissionFeature {

    /* renamed from: a */
    public final WebFeatureConfig f115357a;

    public C$AutoValue_GeolocationPermissionFeature(WebFeatureConfig webFeatureConfig) {
        if (webFeatureConfig != null) {
            this.f115357a = webFeatureConfig;
            return;
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f115357a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GeolocationPermissionFeature) {
            return this.f115357a.equals(((GeolocationPermissionFeature) obj).mo41576a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f115357a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f115357a.toString();
        return "GeolocationPermissionFeature{config=" + obj + "}";
    }
}
