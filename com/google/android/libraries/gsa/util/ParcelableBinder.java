package com.google.android.libraries.gsa.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class ParcelableBinder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23339d();

    /* renamed from: a */
    public final IBinder f63870a;

    public ParcelableBinder(IBinder iBinder) {
        this.f63870a = iBinder;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f63870a);
    }
}
