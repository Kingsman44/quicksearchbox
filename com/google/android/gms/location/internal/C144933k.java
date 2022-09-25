package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.location.internal.k */
/* compiled from: PG */
public abstract class C144933k extends C8849b implements C144934l {
    public C144933k() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo120418a((LocationSettingsResult) C8850c.m23492a(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}
