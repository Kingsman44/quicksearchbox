package com.google.android.apps.gsa.handsfree.notifications;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.handsfree.notifications.b */
/* compiled from: PG */
final class C74570b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BaseRemoteNotification(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BaseRemoteNotification[i];
    }
}
