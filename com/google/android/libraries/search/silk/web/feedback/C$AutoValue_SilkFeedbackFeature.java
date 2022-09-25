package com.google.android.libraries.search.silk.web.feedback;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.feedback.$AutoValue_SilkFeedbackFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkFeedbackFeature extends SilkFeedbackFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106889a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106890b;

    public C$AutoValue_SilkFeedbackFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106889a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106890b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106889a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106890b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkFeedbackFeature) {
            SilkFeedbackFeature silkFeedbackFeature = (SilkFeedbackFeature) obj;
            return this.f106889a.equals(silkFeedbackFeature.mo41576a()) && this.f106890b.equals(silkFeedbackFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106889a.hashCode() ^ 1000003) * 1000003) ^ this.f106890b.hashCode();
    }

    public final String toString() {
        String obj = this.f106889a.toString();
        String obj2 = this.f106890b.toString();
        return "SilkFeedbackFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
