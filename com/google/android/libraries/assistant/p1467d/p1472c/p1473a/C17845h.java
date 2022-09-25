package com.google.android.libraries.assistant.p1467d.p1472c.p1473a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.libraries.assistant.d.c.a.h */
/* compiled from: PG */
public abstract class C17845h extends C8849b implements C17846i {
    public C17845h() {
        super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            mo23480a(createByteArray);
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            enforceNoDataAvail(parcel);
            mo23481b(readStrongBinder);
        }
        return true;
    }
}
