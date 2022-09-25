package com.google.android.libraries.search.silk.web.androiduri;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.androiduri.$AutoValue_SilkAndroidUriFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkAndroidUriFeature extends SilkAndroidUriFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106703a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106704b;

    public C$AutoValue_SilkAndroidUriFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106703a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106704b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106703a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106704b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkAndroidUriFeature) {
            SilkAndroidUriFeature silkAndroidUriFeature = (SilkAndroidUriFeature) obj;
            return this.f106703a.equals(silkAndroidUriFeature.mo41576a()) && this.f106704b.equals(silkAndroidUriFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106703a.hashCode() ^ 1000003) * 1000003) ^ this.f106704b.hashCode();
    }

    public final String toString() {
        String obj = this.f106703a.toString();
        String obj2 = this.f106704b.toString();
        return "SilkAndroidUriFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
