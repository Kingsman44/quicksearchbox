package com.google.android.libraries.search.silk.web.panes;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.panes.$AutoValue_SilkPanesFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkPanesFeature extends SilkPanesFeature {

    /* renamed from: a */
    public final WebFeatureConfig f107049a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107050b;

    public C$AutoValue_SilkPanesFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f107049a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107050b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f107049a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107050b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkPanesFeature) {
            SilkPanesFeature silkPanesFeature = (SilkPanesFeature) obj;
            return this.f107049a.equals(silkPanesFeature.mo41576a()) && this.f107050b.equals(silkPanesFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f107049a.hashCode() ^ 1000003) * 1000003) ^ this.f107050b.hashCode();
    }

    public final String toString() {
        String obj = this.f107049a.toString();
        String obj2 = this.f107050b.toString();
        return "SilkPanesFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
