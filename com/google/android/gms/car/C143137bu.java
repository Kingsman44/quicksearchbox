package com.google.android.gms.car;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.bu */
/* compiled from: PG */
public abstract class C143137bu extends C8849b implements C143138bv {
    public C143137bu() {
        super("com.google.android.gms.car.ICarActivityStartListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo118000b((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo118001c((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo117999a((ActivityLaunchInfo) C8850c.m23492a(parcel, ActivityLaunchInfo.CREATOR));
        }
        return true;
    }
}
