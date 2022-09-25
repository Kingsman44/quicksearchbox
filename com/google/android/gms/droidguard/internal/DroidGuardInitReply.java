package com.google.android.gms.droidguard.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
public class DroidGuardInitReply implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C144134n();

    /* renamed from: a */
    public final ParcelFileDescriptor f390402a;

    /* renamed from: b */
    public final Parcelable f390403b;

    public DroidGuardInitReply(ParcelFileDescriptor parcelFileDescriptor, Parcelable parcelable) {
        this.f390402a = parcelFileDescriptor;
        this.f390403b = parcelable;
    }

    public final int describeContents() {
        int i = 0;
        int i2 = this.f390402a != null ? 1 : 0;
        Parcelable parcelable = this.f390403b;
        if (parcelable != null) {
            i = parcelable.describeContents();
        }
        return i2 | i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f390402a, i);
        parcel.writeParcelable(this.f390403b, i);
    }
}
