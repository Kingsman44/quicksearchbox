package com.google.android.libraries.search.silk.web.audiorecording;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.audiorecording.$AutoValue_SilkAudioRecordingFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkAudioRecordingFeature extends SilkAudioRecordingFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106730a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106731b;

    public C$AutoValue_SilkAudioRecordingFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106730a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106731b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106730a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106731b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkAudioRecordingFeature) {
            SilkAudioRecordingFeature silkAudioRecordingFeature = (SilkAudioRecordingFeature) obj;
            return this.f106730a.equals(silkAudioRecordingFeature.mo41576a()) && this.f106731b.equals(silkAudioRecordingFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106730a.hashCode() ^ 1000003) * 1000003) ^ this.f106731b.hashCode();
    }

    public final String toString() {
        String obj = this.f106730a.toString();
        String obj2 = this.f106731b.toString();
        return "SilkAudioRecordingFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
