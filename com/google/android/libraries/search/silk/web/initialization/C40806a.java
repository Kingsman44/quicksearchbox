package com.google.android.libraries.search.silk.web.initialization;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.initialization.a */
/* compiled from: PG */
final class C40806a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkInitializationFeature((ProtoParsers.ParcelableProto) parcel.readParcelable(SilkInitializationFeature.class.getClassLoader()), (WebFeatureConfig) parcel.readParcelable(SilkInitializationFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkInitializationFeature[i];
    }
}
