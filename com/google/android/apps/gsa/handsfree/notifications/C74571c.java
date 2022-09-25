package com.google.android.apps.gsa.handsfree.notifications;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.handsfree.notifications.c */
/* compiled from: PG */
final class C74571c implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CarRemoteNotification(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CarRemoteNotification[i];
    }
}
