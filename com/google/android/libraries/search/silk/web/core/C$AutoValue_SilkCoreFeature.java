package com.google.android.libraries.search.silk.web.core;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.core.$AutoValue_SilkCoreFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkCoreFeature extends SilkCoreFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106847a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106848b;

    public C$AutoValue_SilkCoreFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106847a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106848b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null silkConfig");
        }
        throw new NullPointerException("Null getConfig");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106847a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42692d() {
        return this.f106848b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkCoreFeature) {
            SilkCoreFeature silkCoreFeature = (SilkCoreFeature) obj;
            return this.f106847a.equals(silkCoreFeature.mo41576a()) && this.f106848b.equals(silkCoreFeature.mo42692d());
        }
    }

    public final int hashCode() {
        return ((this.f106847a.hashCode() ^ 1000003) * 1000003) ^ this.f106848b.hashCode();
    }

    public final String toString() {
        String obj = this.f106847a.toString();
        String obj2 = this.f106848b.toString();
        return "SilkCoreFeature{getConfig=" + obj + ", silkConfig=" + obj2 + "}";
    }
}
