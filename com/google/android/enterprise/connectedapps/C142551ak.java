package com.google.android.enterprise.connectedapps;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.enterprise.connectedapps.ak */
/* compiled from: PG */
public abstract class C142551ak extends C8849b implements C142552al {
    public C142551ak() {
        super("com.google.android.enterprise.connectedapps.ICrossProfileService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C142549ai aiVar;
        if (i == 1) {
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            mo77085a(readLong, readInt, readInt2, createByteArray);
            parcel2.writeNoException();
        } else if (i == 2) {
            long readLong2 = parcel.readLong();
            parcel.readInt();
            enforceNoDataAvail(parcel);
            mo77089e(readLong2, (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
        } else if (i == 3) {
            long readLong3 = parcel.readLong();
            int readInt3 = parcel.readInt();
            long readLong4 = parcel.readLong();
            int readInt4 = parcel.readInt();
            byte[] createByteArray2 = parcel.createByteArray();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                aiVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.enterprise.connectedapps.ICrossProfileCallback");
                aiVar = queryLocalInterface instanceof C142549ai ? (C142549ai) queryLocalInterface : new C142547ag(readStrongBinder);
            }
            enforceNoDataAvail(parcel);
            byte[] b = mo77086b(readLong3, readInt3, readLong4, readInt4, createByteArray2, aiVar);
            parcel2.writeNoException();
            parcel2.writeByteArray(b);
        } else if (i == 4) {
            long readLong5 = parcel.readLong();
            int readInt5 = parcel.readInt();
            enforceNoDataAvail(parcel);
            byte[] c = mo77087c(readLong5, readInt5);
            parcel2.writeNoException();
            parcel2.writeByteArray(c);
        } else if (i != 5) {
            return false;
        } else {
            long readLong6 = parcel.readLong();
            parcel.readInt();
            enforceNoDataAvail(parcel);
            Bundle d = mo77088d(readLong6);
            parcel2.writeNoException();
            C8850c.m23498g(parcel2, d);
        }
        return true;
    }
}
