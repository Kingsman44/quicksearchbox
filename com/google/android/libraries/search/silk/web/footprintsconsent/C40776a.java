package com.google.android.libraries.search.silk.web.footprintsconsent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.footprintsconsent.a */
/* compiled from: PG */
final class C40776a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkFootprintsConsentFeature((WebFeatureConfig) parcel.readParcelable(SilkFootprintsConsentFeature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkFootprintsConsentFeature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkFootprintsConsentFeature[i];
    }
}
