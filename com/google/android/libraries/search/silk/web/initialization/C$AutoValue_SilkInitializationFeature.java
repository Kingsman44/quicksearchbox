package com.google.android.libraries.search.silk.web.initialization;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.initialization.$AutoValue_SilkInitializationFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkInitializationFeature extends SilkInitializationFeature {

    /* renamed from: a */
    public final ProtoParsers.ParcelableProto f106961a;

    /* renamed from: b */
    public final WebFeatureConfig f106962b;

    public C$AutoValue_SilkInitializationFeature(ProtoParsers.ParcelableProto parcelableProto, WebFeatureConfig webFeatureConfig) {
        if (parcelableProto != null) {
            this.f106961a = parcelableProto;
            if (webFeatureConfig != null) {
                this.f106962b = webFeatureConfig;
                return;
            }
            throw new NullPointerException("Null config");
        }
        throw new NullPointerException("Null capabilitiesHeader");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106962b;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106961a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkInitializationFeature) {
            SilkInitializationFeature silkInitializationFeature = (SilkInitializationFeature) obj;
            return this.f106961a.equals(silkInitializationFeature.mo42586d()) && this.f106962b.equals(silkInitializationFeature.mo41576a());
        }
    }

    public final int hashCode() {
        return ((this.f106961a.hashCode() ^ 1000003) * 1000003) ^ this.f106962b.hashCode();
    }

    public final String toString() {
        String obj = this.f106961a.toString();
        String obj2 = this.f106962b.toString();
        return "SilkInitializationFeature{capabilitiesHeader=" + obj + ", config=" + obj2 + "}";
    }
}
