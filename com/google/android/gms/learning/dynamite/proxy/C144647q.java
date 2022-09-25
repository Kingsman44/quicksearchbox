package com.google.android.gms.learning.dynamite.proxy;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.q */
/* compiled from: PG */
public abstract class C144647q extends C8849b implements C144648r {
    public C144647q() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C144645o oVar;
        if (i != 3) {
            return false;
        }
        String readString = parcel.readString();
        byte[] createByteArray = parcel.createByteArray();
        byte[] createByteArray2 = parcel.createByteArray();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingQueryCallback");
            oVar = queryLocalInterface instanceof C144645o ? (C144645o) queryLocalInterface : new C144643m(readStrongBinder);
        }
        byte[] createByteArray3 = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        mo120100e(readString, createByteArray, createByteArray2, oVar, createByteArray3);
        return true;
    }
}
