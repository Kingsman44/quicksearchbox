package com.google.android.libraries.web.weblayer.contrib.footprints;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.footprints.$AutoValue_FootprintsFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_FootprintsFeature extends FootprintsFeature {

    /* renamed from: a */
    public final WebFeatureConfig f114983a;

    public C$AutoValue_FootprintsFeature(WebFeatureConfig webFeatureConfig) {
        if (webFeatureConfig != null) {
            this.f114983a = webFeatureConfig;
            return;
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f114983a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FootprintsFeature) {
            return this.f114983a.equals(((FootprintsFeature) obj).mo41576a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f114983a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f114983a.toString();
        return "FootprintsFeature{config=" + obj + "}";
    }
}
