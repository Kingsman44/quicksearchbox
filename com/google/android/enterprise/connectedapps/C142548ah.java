package com.google.android.enterprise.connectedapps;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.enterprise.connectedapps.ah */
/* compiled from: PG */
public abstract class C142548ah extends C8849b implements C142549ai {
    public C142548ah() {
        super("com.google.android.enterprise.connectedapps.ICrossProfileCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            mo117146c(readLong, readInt, readInt2, createByteArray);
        } else if (i == 2) {
            long readLong2 = parcel.readLong();
            parcel.readInt();
            enforceNoDataAvail(parcel);
            mo117147d(readLong2, (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        } else if (i == 3) {
            long readLong3 = parcel.readLong();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            byte[] createByteArray2 = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            mo117145b(readLong3, readInt3, readInt4, createByteArray2);
        } else if (i != 4) {
            return false;
        } else {
            long readLong4 = parcel.readLong();
            int readInt5 = parcel.readInt();
            byte[] createByteArray3 = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            mo117144a(readLong4, readInt5, createByteArray3);
        }
        parcel2.writeNoException();
        return true;
    }
}
