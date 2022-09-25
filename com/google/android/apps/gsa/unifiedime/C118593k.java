package com.google.android.apps.gsa.unifiedime;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.unifiedime.k */
/* compiled from: PG */
public abstract class C118593k extends C8849b implements C118594l {
    public C118593k() {
        super("com.google.android.apps.gsa.unifiedime.IUnifiedImeService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C118595m mVar = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.unifiedime.IUnifiedImeServiceCallback");
                mVar = queryLocalInterface instanceof C118595m ? (C118595m) queryLocalInterface : new C118595m(readStrongBinder);
            }
            String readString = parcel.readString();
            enforceNoDataAvail(parcel);
            mo103768c(mVar, readString);
            parcel2.writeNoException();
        } else if (i == 2) {
            mo103767b();
            parcel2.writeNoException();
        } else if (i == 3) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.apps.gsa.unifiedime.IUnifiedImeServiceCallback");
                mVar = queryLocalInterface2 instanceof C118595m ? (C118595m) queryLocalInterface2 : new C118595m(readStrongBinder2);
            }
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            boolean d = mo103769d(mVar, createByteArray);
            parcel2.writeNoException();
            C8850c.m23495d(parcel2, d);
        } else if (i != 4) {
            return false;
        } else {
            mo103766a();
            parcel2.writeNoException();
        }
        return true;
    }
}
