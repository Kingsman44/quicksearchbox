package com.google.android.libraries.search.silk.web.prewarmplay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.prewarmplay.a */
/* compiled from: PG */
final class C40882a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkPrewarmPlayFeature((WebFeatureConfig) parcel.readParcelable(SilkPrewarmPlayFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkPrewarmPlayFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkPrewarmPlayFeature[i];
    }
}
