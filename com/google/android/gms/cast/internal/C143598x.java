package com.google.android.gms.cast.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.internal.x */
/* compiled from: PG */
public abstract class C143598x extends C8849b implements C143599y {
    public C143598x() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo118912a((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        return true;
    }
}
