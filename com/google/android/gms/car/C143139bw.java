package com.google.android.gms.car;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.bw */
/* compiled from: PG */
public abstract class C143139bw extends C8849b implements C143140bx {
    public C143139bw() {
        super("com.google.android.gms.car.ICarActivityStartProcessor");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo118003a((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
        return true;
    }
}
