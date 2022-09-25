package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.common.internal.at */
/* compiled from: PG */
public abstract class C143904at extends C8849b implements C143905au {
    public C143904at() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo119419a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            mo119421c();
        } else if (i != 3) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo119420b(parcel.readInt(), parcel.readStrongBinder(), (ConnectionInfo) C8850c.m23492a(parcel, ConnectionInfo.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
