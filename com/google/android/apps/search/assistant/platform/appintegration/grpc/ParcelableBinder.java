package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class ParcelableBinder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C119602av();

    /* renamed from: a */
    public final IBinder f333271a;

    public ParcelableBinder(IBinder iBinder) {
        this.f333271a = iBinder;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f333271a);
    }
}
