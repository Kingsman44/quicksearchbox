package com.google.android.libraries.search.silk.web.amp;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.amp.$AutoValue_SilkAmpFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkAmpFeature extends SilkAmpFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106684a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106685b;

    public C$AutoValue_SilkAmpFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106684a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106685b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106684a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106685b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkAmpFeature) {
            SilkAmpFeature silkAmpFeature = (SilkAmpFeature) obj;
            return this.f106684a.equals(silkAmpFeature.mo41576a()) && this.f106685b.equals(silkAmpFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106684a.hashCode() ^ 1000003) * 1000003) ^ this.f106685b.hashCode();
    }

    public final String toString() {
        String obj = this.f106684a.toString();
        String obj2 = this.f106685b.toString();
        return "SilkAmpFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
