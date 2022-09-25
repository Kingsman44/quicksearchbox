package com.google.p3723ar.imp.view.ipc.p3727a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.ar.imp.view.ipc.a.b */
/* compiled from: PG */
public abstract class C47996b extends C8849b implements C47997c {
    private static final String DESCRIPTOR = "com.google.ar.imp.view.ipc.aidl.ILoaderService";
    static final int TRANSACTION_close = 2;
    static final int TRANSACTION_create = 1;

    public C47996b() {
        super(DESCRIPTOR);
    }

    public static C47997c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        return queryLocalInterface instanceof C47997c ? (C47997c) queryLocalInterface : new C47995a(iBinder);
    }

    /* access modifiers changed from: protected */
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            enforceNoDataAvail(parcel);
            create((ParcelFileDescriptor) C8850c.m23492a(parcel, ParcelFileDescriptor.CREATOR), readString);
        } else if (i != 2) {
            return false;
        } else {
            close();
        }
        parcel2.writeNoException();
        return true;
    }
}
