package com.google.android.libraries.search.silk.web.notification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.notification.a */
/* compiled from: PG */
final class C40838a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_SilkNotificationV2Feature((WebFeatureConfig) parcel.readParcelable(SilkNotificationV2Feature.class.getClassLoader()), (ProtoParsers.ParcelableProto) parcel.readParcelable(SilkNotificationV2Feature.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_SilkNotificationV2Feature[i];
    }
}
