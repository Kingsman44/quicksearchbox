package com.google.android.gms.learning.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p10793f.C144163h;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.r */
/* compiled from: PG */
public abstract class C144786r extends C8849b implements C144787s {
    public C144786r() {
        super("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
    }

    public static C144787s asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
        return queryLocalInterface instanceof C144787s ? (C144787s) queryLocalInterface : new C144785q(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C144165j jVar;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                C144784p pVar = null;
                if (readStrongBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar = queryLocalInterface instanceof C144165j ? (C144165j) queryLocalInterface : new C144163h(readStrongBinder);
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreV2");
                    pVar = queryLocalInterface2 instanceof C144784p ? (C144784p) queryLocalInterface2 : new C144782n(readStrongBinder2);
                }
                enforceNoDataAvail(parcel);
                init(jVar, pVar);
                parcel2.writeNoException();
                return true;
            case 2:
                onDestroy();
                parcel2.writeNoException();
                return true;
            case 3:
                enforceNoDataAvail(parcel);
                IBinder onBind = onBind((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(onBind);
                return true;
            case 4:
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTrimMemory(readInt);
                parcel2.writeNoException();
                return true;
            case 5:
                enforceNoDataAvail(parcel);
                boolean onUnbind = onUnbind((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, onUnbind);
                return true;
            case 6:
                enforceNoDataAvail(parcel);
                onRebind((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
