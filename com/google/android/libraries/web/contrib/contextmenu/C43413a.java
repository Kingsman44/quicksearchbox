package com.google.android.libraries.web.contrib.contextmenu;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a */
/* compiled from: PG */
final class C43413a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_ContextMenuFeature((WebFeatureConfig) parcel.readParcelable(ContextMenuFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_ContextMenuFeature[i];
    }
}
