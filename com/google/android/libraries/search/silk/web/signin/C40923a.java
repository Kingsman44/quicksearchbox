package com.google.android.libraries.search.silk.web.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.signin.a */
/* compiled from: PG */
final class C40923a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkSignInFeature((WebFeatureConfig) parcel.readParcelable(SilkSignInFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkSignInFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkSignInFeature[i];
    }
}
