package com.google.android.libraries.web.contrib.googlesignin;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.contrib.googlesignin.$AutoValue_GoogleSignInFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_GoogleSignInFeature extends GoogleSignInFeature {

    /* renamed from: a */
    public final WebFeatureConfig f113772a;

    /* renamed from: b */
    public final int f113773b;

    public C$AutoValue_GoogleSignInFeature(WebFeatureConfig webFeatureConfig, int i) {
        if (webFeatureConfig != null) {
            this.f113772a = webFeatureConfig;
            this.f113773b = i;
            return;
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f113772a;
    }

    /* renamed from: d */
    public final int mo46631d() {
        return this.f113773b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInFeature) {
            GoogleSignInFeature googleSignInFeature = (GoogleSignInFeature) obj;
            return this.f113772a.equals(googleSignInFeature.mo41576a()) && this.f113773b == googleSignInFeature.mo46631d();
        }
    }

    public final int hashCode() {
        return ((this.f113772a.hashCode() ^ 1000003) * 1000003) ^ this.f113773b;
    }

    public final String toString() {
        String obj = this.f113772a.toString();
        int i = this.f113773b;
        return "GoogleSignInFeature{config=" + obj + ", googleSignInPolicy=" + C43587e.m76931a(i) + "}";
    }
}
