package com.google.android.libraries.search.silk.web.xblendcontainer;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.xblendcontainer.$AutoValue_SilkXblendContainerFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkXblendContainerFeature extends SilkXblendContainerFeature {

    /* renamed from: a */
    public final WebFeatureConfig f108102a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f108103b;

    public C$AutoValue_SilkXblendContainerFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f108102a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f108103b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f108102a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f108103b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkXblendContainerFeature) {
            SilkXblendContainerFeature silkXblendContainerFeature = (SilkXblendContainerFeature) obj;
            return this.f108102a.equals(silkXblendContainerFeature.mo41576a()) && this.f108103b.equals(silkXblendContainerFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f108102a.hashCode() ^ 1000003) * 1000003) ^ this.f108103b.hashCode();
    }

    public final String toString() {
        String obj = this.f108102a.toString();
        String obj2 = this.f108103b.toString();
        return "SilkXblendContainerFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
