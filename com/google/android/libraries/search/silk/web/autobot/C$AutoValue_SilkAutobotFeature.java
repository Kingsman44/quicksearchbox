package com.google.android.libraries.search.silk.web.autobot;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.autobot.$AutoValue_SilkAutobotFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkAutobotFeature extends SilkAutobotFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106753a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106754b;

    public C$AutoValue_SilkAutobotFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106753a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106754b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106753a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106754b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkAutobotFeature) {
            SilkAutobotFeature silkAutobotFeature = (SilkAutobotFeature) obj;
            return this.f106753a.equals(silkAutobotFeature.mo41576a()) && this.f106754b.equals(silkAutobotFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106753a.hashCode() ^ 1000003) * 1000003) ^ this.f106754b.hashCode();
    }

    public final String toString() {
        String obj = this.f106753a.toString();
        String obj2 = this.f106754b.toString();
        return "SilkAutobotFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
