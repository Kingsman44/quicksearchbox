package com.google.android.libraries.search.silk.web.geolocation;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.geolocation.$AutoValue_SilkGeolocationFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkGeolocationFeature extends SilkGeolocationFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106923a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106924b;

    public C$AutoValue_SilkGeolocationFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106923a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106924b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106923a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106924b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkGeolocationFeature) {
            SilkGeolocationFeature silkGeolocationFeature = (SilkGeolocationFeature) obj;
            return this.f106923a.equals(silkGeolocationFeature.mo41576a()) && this.f106924b.equals(silkGeolocationFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106923a.hashCode() ^ 1000003) * 1000003) ^ this.f106924b.hashCode();
    }

    public final String toString() {
        String obj = this.f106923a.toString();
        String obj2 = this.f106924b.toString();
        return "SilkGeolocationFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
