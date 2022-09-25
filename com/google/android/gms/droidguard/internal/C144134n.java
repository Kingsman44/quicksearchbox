package com.google.android.gms.droidguard.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.gms.droidguard.internal.n */
/* compiled from: PG */
final class C144134n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcel.readParcelable(ParcelFileDescriptor.class.getClassLoader());
        Parcelable readParcelable = parcel.readParcelable(getClass().getClassLoader());
        boolean z = false;
        if ((parcelFileDescriptor == null) == (readParcelable == null)) {
            z = true;
        }
        C58838bb.m90868c(z);
        return new DroidGuardInitReply(parcelFileDescriptor, readParcelable);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DroidGuardInitReply[i];
    }
}
