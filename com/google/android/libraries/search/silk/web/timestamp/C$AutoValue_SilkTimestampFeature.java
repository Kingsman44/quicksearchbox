package com.google.android.libraries.search.silk.web.timestamp;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.timestamp.$AutoValue_SilkTimestampFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkTimestampFeature extends SilkTimestampFeature {

    /* renamed from: a */
    public final WebFeatureConfig f107191a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107192b;

    public C$AutoValue_SilkTimestampFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f107191a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107192b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f107191a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107192b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkTimestampFeature) {
            SilkTimestampFeature silkTimestampFeature = (SilkTimestampFeature) obj;
            return this.f107191a.equals(silkTimestampFeature.mo41576a()) && this.f107192b.equals(silkTimestampFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f107191a.hashCode() ^ 1000003) * 1000003) ^ this.f107192b.hashCode();
    }

    public final String toString() {
        String obj = this.f107191a.toString();
        String obj2 = this.f107192b.toString();
        return "SilkTimestampFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
