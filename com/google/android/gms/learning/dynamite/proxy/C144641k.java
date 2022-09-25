package com.google.android.gms.learning.dynamite.proxy;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.k */
/* compiled from: PG */
public abstract class C144641k extends C8849b implements C144642l {
    public C144641k() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIteratorCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            enforceNoDataAvail(parcel);
            mo120097f((Status) C8850c.m23492a(parcel, Status.CREATOR), readLong, readLong2);
        } else if (i != 4) {
            return false;
        } else {
            byte[] createByteArray = parcel.createByteArray();
            boolean i3 = C8850c.m23500i(parcel);
            byte[] createByteArray2 = parcel.createByteArray();
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            enforceNoDataAvail(parcel);
            mo120096e(createByteArray, i3, createByteArray2, readLong3, readLong4);
        }
        parcel2.writeNoException();
        return true;
    }
}
