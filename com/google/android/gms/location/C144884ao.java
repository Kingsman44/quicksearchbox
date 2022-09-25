package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.location.ao */
/* compiled from: PG */
public abstract class C144884ao extends C8849b implements C144885ap {
    public C144884ao() {
        super("com.google.android.gms.location.ILocationListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo120376e((Location) C8850c.m23492a(parcel, Location.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo120377f();
        }
        return true;
    }
}
