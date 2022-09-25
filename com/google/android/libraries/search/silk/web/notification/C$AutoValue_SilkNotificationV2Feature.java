package com.google.android.libraries.search.silk.web.notification;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.notification.$AutoValue_SilkNotificationV2Feature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkNotificationV2Feature extends SilkNotificationV2Feature {

    /* renamed from: a */
    public final WebFeatureConfig f107018a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107019b;

    public C$AutoValue_SilkNotificationV2Feature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f107018a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107019b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f107018a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107019b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkNotificationV2Feature) {
            SilkNotificationV2Feature silkNotificationV2Feature = (SilkNotificationV2Feature) obj;
            return this.f107018a.equals(silkNotificationV2Feature.mo41576a()) && this.f107019b.equals(silkNotificationV2Feature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f107018a.hashCode() ^ 1000003) * 1000003) ^ this.f107019b.hashCode();
    }

    public final String toString() {
        String obj = this.f107018a.toString();
        String obj2 = this.f107019b.toString();
        return "SilkNotificationV2Feature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
