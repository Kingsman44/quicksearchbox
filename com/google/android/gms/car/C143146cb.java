package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.car.cb */
/* compiled from: PG */
public abstract class C143146cb extends C8849b implements C143147cc {
    public C143146cb() {
        super("com.google.android.gms.car.ICarConnectionListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            mo117975a(readInt);
        } else if (i == 2) {
            mo117976b();
        } else if (i != 3) {
            return false;
        } else {
            parcel.readInt();
            enforceNoDataAvail(parcel);
            mo117977c();
        }
        return true;
    }
}
