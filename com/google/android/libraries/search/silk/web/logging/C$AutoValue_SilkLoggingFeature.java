package com.google.android.libraries.search.silk.web.logging;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.logging.$AutoValue_SilkLoggingFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkLoggingFeature extends SilkLoggingFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106999a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107000b;

    public C$AutoValue_SilkLoggingFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106999a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107000b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106999a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107000b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkLoggingFeature) {
            SilkLoggingFeature silkLoggingFeature = (SilkLoggingFeature) obj;
            return this.f106999a.equals(silkLoggingFeature.mo41576a()) && this.f107000b.equals(silkLoggingFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106999a.hashCode() ^ 1000003) * 1000003) ^ this.f107000b.hashCode();
    }

    public final String toString() {
        String obj = this.f106999a.toString();
        String obj2 = this.f107000b.toString();
        return "SilkLoggingFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
