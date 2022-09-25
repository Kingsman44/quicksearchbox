package com.google.android.gms.car.p10763g;

import android.os.Parcel;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.g.a */
/* compiled from: PG */
public abstract class C143313a extends C8849b implements C143314b {
    public C143313a() {
        super("com.google.android.gms.car.lifecycle.ICarDisplayLayoutUpdateCompleteListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo117989b(parcel.readString(), (CarDisplayId) C8850c.m23492a(parcel, CarDisplayId.CREATOR));
        return true;
    }
}
