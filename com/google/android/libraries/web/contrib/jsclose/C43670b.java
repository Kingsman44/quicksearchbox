package com.google.android.libraries.web.contrib.jsclose;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.contrib.jsclose.b */
/* compiled from: PG */
final class C43670b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_JsCloseFeature((WebFeatureConfig) parcel.readParcelable(JsCloseFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_JsCloseFeature[i];
    }
}
