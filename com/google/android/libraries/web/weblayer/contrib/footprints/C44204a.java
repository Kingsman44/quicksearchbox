package com.google.android.libraries.web.weblayer.contrib.footprints;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.footprints.a */
/* compiled from: PG */
final class C44204a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_FootprintsFeature((WebFeatureConfig) parcel.readParcelable(FootprintsFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_FootprintsFeature[i];
    }
}
