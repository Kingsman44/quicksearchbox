package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.common.c */
/* compiled from: PG */
final class C90422c implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BundledMessageNotification(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BundledMessageNotification[i];
    }
}
