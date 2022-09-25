package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.cg */
/* compiled from: PG */
public abstract class C143151cg extends C8849b implements C143152ch {
    public C143151cg() {
        super("com.google.android.gms.car.ICarUiInfoChangedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        CarUiInfo carUiInfo = (CarUiInfo) C8850c.m23492a(parcel, CarUiInfo.CREATOR);
        enforceNoDataAvail(parcel);
        mo117991a();
        return true;
    }
}
