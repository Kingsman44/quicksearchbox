package com.google.android.libraries.search.silk.web.weathersettings;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.weathersettings.$AutoValue_SilkWeatherSettingsFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkWeatherSettingsFeature extends SilkWeatherSettingsFeature {

    /* renamed from: a */
    public final WebFeatureConfig f107226a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f107227b;

    public C$AutoValue_SilkWeatherSettingsFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f107226a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f107227b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f107226a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f107227b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkWeatherSettingsFeature) {
            SilkWeatherSettingsFeature silkWeatherSettingsFeature = (SilkWeatherSettingsFeature) obj;
            return this.f107226a.equals(silkWeatherSettingsFeature.mo41576a()) && this.f107227b.equals(silkWeatherSettingsFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f107226a.hashCode() ^ 1000003) * 1000003) ^ this.f107227b.hashCode();
    }

    public final String toString() {
        String obj = this.f107226a.toString();
        String obj2 = this.f107227b.toString();
        return "SilkWeatherSettingsFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}
