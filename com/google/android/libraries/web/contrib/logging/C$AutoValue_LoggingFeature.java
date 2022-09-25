package com.google.android.libraries.web.contrib.logging;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.contrib.logging.$AutoValue_LoggingFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_LoggingFeature extends LoggingFeature {

    /* renamed from: a */
    public final WebFeatureConfig f113997a;

    public C$AutoValue_LoggingFeature(WebFeatureConfig webFeatureConfig) {
        if (webFeatureConfig != null) {
            this.f113997a = webFeatureConfig;
            return;
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f113997a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoggingFeature) {
            return this.f113997a.equals(((LoggingFeature) obj).mo41576a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f113997a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f113997a.toString();
        return "LoggingFeature{config=" + obj + "}";
    }
}
