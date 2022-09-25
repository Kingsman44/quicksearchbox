package com.google.android.libraries.search.silk.web.signin;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.signin.$AutoValue_SilkSignInFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkSignInFeature extends SilkSignInFeature {

    /* renamed from: a */
    public final WebFeatureConfig f107175a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107176b;

    public C$AutoValue_SilkSignInFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f107175a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107176b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f107175a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107176b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkSignInFeature) {
            SilkSignInFeature silkSignInFeature = (SilkSignInFeature) obj;
            return this.f107175a.equals(silkSignInFeature.mo41576a()) && this.f107176b.equals(silkSignInFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f107175a.hashCode() ^ 1000003) * 1000003) ^ this.f107176b.hashCode();
    }

    public final String toString() {
        String obj = this.f107175a.toString();
        String obj2 = this.f107176b.toString();
        return "SilkSignInFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
