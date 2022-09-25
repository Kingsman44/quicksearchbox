package com.google.android.apps.gsa.search.shared.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.search.shared.service.o */
/* compiled from: PG */
public abstract class C88494o extends C8849b implements C88495p {
    public C88494o() {
        super("com.google.android.apps.gsa.search.shared.service.ISearchServiceBinder");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C88498s sVar;
        if (i == 1) {
            long readLong = parcel.readLong();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                sVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.search.shared.service.ISearchServiceUiCallback");
                sVar = queryLocalInterface instanceof C88498s ? (C88498s) queryLocalInterface : new C88496q(readStrongBinder);
            }
            long readLong2 = parcel.readLong();
            enforceNoDataAvail(parcel);
            AttachClientResponse a = mo80232a(readLong, sVar, (ClientConfig) C8850c.m23492a(parcel, ClientConfig.CREATOR), readLong2);
            parcel2.writeNoException();
            C8850c.m23498g(parcel2, a);
        } else if (i != 2) {
            return false;
        } else {
            long readLong3 = parcel.readLong();
            boolean i3 = C8850c.m23500i(parcel);
            enforceNoDataAvail(parcel);
            mo80233b(readLong3, i3);
            parcel2.writeNoException();
        }
        return true;
    }
}
