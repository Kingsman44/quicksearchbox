package com.google.android.libraries.search.silk.web.download;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.download.$AutoValue_SilkDownloadFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkDownloadFeature extends SilkDownloadFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106865a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106866b;

    public C$AutoValue_SilkDownloadFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106865a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106866b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106865a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106866b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkDownloadFeature) {
            SilkDownloadFeature silkDownloadFeature = (SilkDownloadFeature) obj;
            return this.f106865a.equals(silkDownloadFeature.mo41576a()) && this.f106866b.equals(silkDownloadFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106865a.hashCode() ^ 1000003) * 1000003) ^ this.f106866b.hashCode();
    }

    public final String toString() {
        String obj = this.f106865a.toString();
        String obj2 = this.f106866b.toString();
        return "SilkDownloadFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
