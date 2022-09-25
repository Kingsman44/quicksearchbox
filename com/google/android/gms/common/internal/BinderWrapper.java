package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C143940o();

    /* renamed from: a */
    private IBinder f389999a;

    public BinderWrapper(IBinder iBinder) {
        this.f389999a = iBinder;
    }

    public BinderWrapper(Parcel parcel) {
        this.f389999a = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f389999a);
    }
}
