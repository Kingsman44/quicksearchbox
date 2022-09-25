package com.google.android.libraries.web.contrib.logging;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.contrib.logging.j */
/* compiled from: PG */
final class C43707j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_LoggingFeature((WebFeatureConfig) parcel.readParcelable(LoggingFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_LoggingFeature[i];
    }
}
