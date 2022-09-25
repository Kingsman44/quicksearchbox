package com.google.android.libraries.search.silk.web.close;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.close.$AutoValue_SilkCloseFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkCloseFeature extends SilkCloseFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106805a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106806b;

    public C$AutoValue_SilkCloseFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106805a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106806b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106805a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106806b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkCloseFeature) {
            SilkCloseFeature silkCloseFeature = (SilkCloseFeature) obj;
            return this.f106805a.equals(silkCloseFeature.mo41576a()) && this.f106806b.equals(silkCloseFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106805a.hashCode() ^ 1000003) * 1000003) ^ this.f106806b.hashCode();
    }

    public final String toString() {
        String obj = this.f106805a.toString();
        String obj2 = this.f106806b.toString();
        return "SilkCloseFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
