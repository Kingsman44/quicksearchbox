package com.google.android.libraries.search.silk.web.phonecall;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.phonecall.$AutoValue_SilkPhonecallFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkPhonecallFeature extends SilkPhonecallFeature {

    /* renamed from: a */
    public final WebFeatureConfig f107080a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107081b;

    public C$AutoValue_SilkPhonecallFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f107080a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107081b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f107080a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107081b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkPhonecallFeature) {
            SilkPhonecallFeature silkPhonecallFeature = (SilkPhonecallFeature) obj;
            return this.f107080a.equals(silkPhonecallFeature.mo41576a()) && this.f107081b.equals(silkPhonecallFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f107080a.hashCode() ^ 1000003) * 1000003) ^ this.f107081b.hashCode();
    }

    public final String toString() {
        String obj = this.f107080a.toString();
        String obj2 = this.f107081b.toString();
        return "SilkPhonecallFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
