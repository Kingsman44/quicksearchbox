package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.common.k */
/* compiled from: PG */
final class C90430k implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new NotificationWrapper(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NotificationWrapper[i];
    }
}
