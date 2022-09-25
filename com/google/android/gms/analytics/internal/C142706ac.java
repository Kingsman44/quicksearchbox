package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.analytics.internal.ac */
/* compiled from: PG */
final class C142706ac implements Parcelable.Creator {
    @Deprecated
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Command(parcel);
    }

    @Deprecated
    public final /* synthetic */ Object[] newArray(int i) {
        return new Command[i];
    }
}
