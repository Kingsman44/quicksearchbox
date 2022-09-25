package com.google.android.libraries.search.silk.web.lens;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.lens.$AutoValue_SilkLensFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkLensFeature extends SilkLensFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106980a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106981b;

    public C$AutoValue_SilkLensFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106980a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106981b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106980a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106981b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkLensFeature) {
            SilkLensFeature silkLensFeature = (SilkLensFeature) obj;
            return this.f106980a.equals(silkLensFeature.mo41576a()) && this.f106981b.equals(silkLensFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106980a.hashCode() ^ 1000003) * 1000003) ^ this.f106981b.hashCode();
    }

    public final String toString() {
        String obj = this.f106980a.toString();
        String obj2 = this.f106981b.toString();
        return "SilkLensFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
