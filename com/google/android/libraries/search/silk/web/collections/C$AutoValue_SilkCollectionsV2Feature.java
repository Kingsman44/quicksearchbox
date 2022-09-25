package com.google.android.libraries.search.silk.web.collections;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.collections.$AutoValue_SilkCollectionsV2Feature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkCollectionsV2Feature extends SilkCollectionsV2Feature {

    /* renamed from: a */
    public final WebFeatureConfig f106820a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106821b;

    public C$AutoValue_SilkCollectionsV2Feature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106820a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106821b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106820a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106821b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkCollectionsV2Feature) {
            SilkCollectionsV2Feature silkCollectionsV2Feature = (SilkCollectionsV2Feature) obj;
            return this.f106820a.equals(silkCollectionsV2Feature.mo41576a()) && this.f106821b.equals(silkCollectionsV2Feature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106820a.hashCode() ^ 1000003) * 1000003) ^ this.f106821b.hashCode();
    }

    public final String toString() {
        String obj = this.f106820a.toString();
        String obj2 = this.f106821b.toString();
        return "SilkCollectionsV2Feature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
