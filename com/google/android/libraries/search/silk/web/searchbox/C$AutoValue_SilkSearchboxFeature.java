package com.google.android.libraries.search.silk.web.searchbox;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.searchbox.$AutoValue_SilkSearchboxFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkSearchboxFeature extends SilkSearchboxFeature {

    /* renamed from: a */
    public final WebFeatureConfig f107114a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107115b;

    public C$AutoValue_SilkSearchboxFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f107114a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107115b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f107114a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107115b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkSearchboxFeature) {
            SilkSearchboxFeature silkSearchboxFeature = (SilkSearchboxFeature) obj;
            return this.f107114a.equals(silkSearchboxFeature.mo41576a()) && this.f107115b.equals(silkSearchboxFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f107114a.hashCode() ^ 1000003) * 1000003) ^ this.f107115b.hashCode();
    }

    public final String toString() {
        String obj = this.f107114a.toString();
        String obj2 = this.f107115b.toString();
        return "SilkSearchboxFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
