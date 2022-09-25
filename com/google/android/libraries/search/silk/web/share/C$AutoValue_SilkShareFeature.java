package com.google.android.libraries.search.silk.web.share;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.share.$AutoValue_SilkShareFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkShareFeature extends SilkShareFeature {

    /* renamed from: a */
    public final WebFeatureConfig f107145a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107146b;

    public C$AutoValue_SilkShareFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f107145a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107146b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f107145a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107146b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkShareFeature) {
            SilkShareFeature silkShareFeature = (SilkShareFeature) obj;
            return this.f107145a.equals(silkShareFeature.mo41576a()) && this.f107146b.equals(silkShareFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f107145a.hashCode() ^ 1000003) * 1000003) ^ this.f107146b.hashCode();
    }

    public final String toString() {
        String obj = this.f107145a.toString();
        String obj2 = this.f107146b.toString();
        return "SilkShareFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
