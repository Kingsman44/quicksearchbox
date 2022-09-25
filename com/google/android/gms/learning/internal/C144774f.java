package com.google.android.gms.learning.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p10793f.C144163h;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.f */
/* compiled from: PG */
public abstract class C144774f extends C8849b implements C144775g {
    public C144774f() {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C144165j jVar;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            C144165j jVar2 = null;
            if (readStrongBinder == null) {
                jVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                jVar = queryLocalInterface instanceof C144165j ? (C144165j) queryLocalInterface : new C144163h(readStrongBinder);
            }
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                jVar2 = queryLocalInterface2 instanceof C144165j ? (C144165j) queryLocalInterface2 : new C144163h(readStrongBinder2);
            }
            long readLong = parcel.readLong();
            enforceNoDataAvail(parcel);
            mo120093b(jVar, jVar2, readLong);
        } else if (i != 3) {
            return false;
        } else {
            long readLong2 = parcel.readLong();
            enforceNoDataAvail(parcel);
            mo120092a((Status) C8850c.m23492a(parcel, Status.CREATOR), readLong2);
        }
        parcel2.writeNoException();
        return true;
    }
}
