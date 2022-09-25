package com.google.android.gms.cast.framework.media.internal;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.cast.framework.media.internal.g */
/* compiled from: PG */
public abstract class C143514g extends C8849b implements C143515h {
    public C143514g() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            enforceNoDataAvail(parcel);
            mo118811b(readLong, readLong2);
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(mo118810a());
        }
        return true;
    }
}
