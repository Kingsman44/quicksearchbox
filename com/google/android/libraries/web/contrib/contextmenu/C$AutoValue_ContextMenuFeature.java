package com.google.android.libraries.web.contrib.contextmenu;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.$AutoValue_ContextMenuFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_ContextMenuFeature extends ContextMenuFeature {

    /* renamed from: a */
    public final WebFeatureConfig f113420a;

    public C$AutoValue_ContextMenuFeature(WebFeatureConfig webFeatureConfig) {
        if (webFeatureConfig != null) {
            this.f113420a = webFeatureConfig;
            return;
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f113420a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextMenuFeature) {
            return this.f113420a.equals(((ContextMenuFeature) obj).mo41576a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f113420a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f113420a.toString();
        return "ContextMenuFeature{config=" + obj + "}";
    }
}
