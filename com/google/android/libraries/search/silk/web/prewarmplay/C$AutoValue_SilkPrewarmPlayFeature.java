package com.google.android.libraries.search.silk.web.prewarmplay;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.prewarmplay.$AutoValue_SilkPrewarmPlayFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkPrewarmPlayFeature extends SilkPrewarmPlayFeature {

    /* renamed from: a */
    public final WebFeatureConfig f107095a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107096b;

    public C$AutoValue_SilkPrewarmPlayFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f107095a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107096b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f107095a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107096b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkPrewarmPlayFeature) {
            SilkPrewarmPlayFeature silkPrewarmPlayFeature = (SilkPrewarmPlayFeature) obj;
            return this.f107095a.equals(silkPrewarmPlayFeature.mo41576a()) && this.f107096b.equals(silkPrewarmPlayFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f107095a.hashCode() ^ 1000003) * 1000003) ^ this.f107096b.hashCode();
    }

    public final String toString() {
        String obj = this.f107095a.toString();
        String obj2 = this.f107096b.toString();
        return "SilkPrewarmPlayFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
