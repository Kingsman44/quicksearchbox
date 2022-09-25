package com.google.android.libraries.search.silk.web.settings;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.settings.$AutoValue_SilkSettingsFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkSettingsFeature extends SilkSettingsFeature {

    /* renamed from: a */
    public final WebFeatureConfig f107130a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107131b;

    public C$AutoValue_SilkSettingsFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f107130a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107131b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f107130a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107131b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkSettingsFeature) {
            SilkSettingsFeature silkSettingsFeature = (SilkSettingsFeature) obj;
            return this.f107130a.equals(silkSettingsFeature.mo41576a()) && this.f107131b.equals(silkSettingsFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f107130a.hashCode() ^ 1000003) * 1000003) ^ this.f107131b.hashCode();
    }

    public final String toString() {
        String obj = this.f107130a.toString();
        String obj2 = this.f107131b.toString();
        return "SilkSettingsFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
