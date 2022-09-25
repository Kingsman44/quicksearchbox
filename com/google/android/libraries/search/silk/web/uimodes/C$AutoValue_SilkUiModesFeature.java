package com.google.android.libraries.search.silk.web.uimodes;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.uimodes.$AutoValue_SilkUiModesFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkUiModesFeature extends SilkUiModesFeature {

    /* renamed from: a */
    public final WebFeatureConfig f107206a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107207b;

    public C$AutoValue_SilkUiModesFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f107206a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107207b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f107206a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107207b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkUiModesFeature) {
            SilkUiModesFeature silkUiModesFeature = (SilkUiModesFeature) obj;
            return this.f107206a.equals(silkUiModesFeature.mo41576a()) && this.f107207b.equals(silkUiModesFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f107206a.hashCode() ^ 1000003) * 1000003) ^ this.f107207b.hashCode();
    }

    public final String toString() {
        String obj = this.f107206a.toString();
        String obj2 = this.f107207b.toString();
        return "SilkUiModesFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
