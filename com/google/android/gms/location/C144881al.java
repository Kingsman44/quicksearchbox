package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.location.al */
/* compiled from: PG */
public abstract class C144881al extends C8849b implements C144882am {
    public C144881al() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo120373e((LocationResult) C8850c.m23492a(parcel, LocationResult.CREATOR));
        } else if (i == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) C8850c.m23492a(parcel, LocationAvailability.CREATOR);
            enforceNoDataAvail(parcel);
            mo120375g();
        } else if (i != 3) {
            return false;
        } else {
            mo120374f();
        }
        return true;
    }
}
