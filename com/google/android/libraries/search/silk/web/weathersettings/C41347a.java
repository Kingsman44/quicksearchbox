package com.google.android.libraries.search.silk.web.weathersettings;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.weathersettings.a */
/* compiled from: PG */
final class C41347a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkWeatherSettingsFeature((WebFeatureConfig) parcel.readParcelable(SilkWeatherSettingsFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkWeatherSettingsFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkWeatherSettingsFeature[i];
    }
}
