package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.b */
/* compiled from: PG */
final class C90395b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        return new AutoValue_NotificationParseConfigs(C58485gu.m89842j(parcel2.readArrayList(String.class.getClassLoader())), C58485gu.m89842j(parcel2.readArrayList(String.class.getClassLoader())), C58485gu.m89842j(parcel2.readArrayList(String.class.getClassLoader())), C58485gu.m89842j(parcel2.readArrayList(String.class.getClassLoader())), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_NotificationParseConfigs[i];
    }
}
