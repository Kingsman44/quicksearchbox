package com.google.android.gms.car.display.p10758a;

import android.os.Parcel;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.display.a.c */
/* compiled from: PG */
public abstract class C143186c extends C8849b implements C143187d {
    public C143186c() {
        super("com.google.android.gms.car.display.manager.ICarDisplayChangedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        CarDisplay carDisplay = (CarDisplay) C8850c.m23492a(parcel, CarDisplay.CREATOR);
        enforceNoDataAvail(parcel);
        mo117983b();
        parcel2.writeNoException();
        return true;
    }
}
