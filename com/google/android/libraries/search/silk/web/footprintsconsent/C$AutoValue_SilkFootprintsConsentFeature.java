package com.google.android.libraries.search.silk.web.footprintsconsent;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.footprintsconsent.$AutoValue_SilkFootprintsConsentFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkFootprintsConsentFeature extends SilkFootprintsConsentFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106904a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106905b;

    public C$AutoValue_SilkFootprintsConsentFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106904a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106905b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106904a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106905b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkFootprintsConsentFeature) {
            SilkFootprintsConsentFeature silkFootprintsConsentFeature = (SilkFootprintsConsentFeature) obj;
            return this.f106904a.equals(silkFootprintsConsentFeature.mo41576a()) && this.f106905b.equals(silkFootprintsConsentFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106904a.hashCode() ^ 1000003) * 1000003) ^ this.f106905b.hashCode();
    }

    public final String toString() {
        String obj = this.f106904a.toString();
        String obj2 = this.f106905b.toString();
        return "SilkFootprintsConsentFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
