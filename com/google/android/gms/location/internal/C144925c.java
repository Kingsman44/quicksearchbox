package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.location.internal.c */
/* compiled from: PG */
public abstract class C144925c extends C8849b implements C144926d {
    public C144925c() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo120429e((FusedLocationProviderResult) C8850c.m23492a(parcel, FusedLocationProviderResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo120430f();
        }
        return true;
    }
}
