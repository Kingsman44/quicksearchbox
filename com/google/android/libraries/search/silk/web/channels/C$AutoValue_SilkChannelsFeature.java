package com.google.android.libraries.search.silk.web.channels;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.channels.$AutoValue_SilkChannelsFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkChannelsFeature extends SilkChannelsFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106782a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106783b;

    public C$AutoValue_SilkChannelsFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106782a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106783b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106782a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106783b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkChannelsFeature) {
            SilkChannelsFeature silkChannelsFeature = (SilkChannelsFeature) obj;
            return this.f106782a.equals(silkChannelsFeature.mo41576a()) && this.f106783b.equals(silkChannelsFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106782a.hashCode() ^ 1000003) * 1000003) ^ this.f106783b.hashCode();
    }

    public final String toString() {
        String obj = this.f106782a.toString();
        String obj2 = this.f106783b.toString();
        return "SilkChannelsFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
