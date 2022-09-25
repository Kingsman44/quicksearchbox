package com.google.android.apps.gsa.publicsearch;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.publicsearch.k */
/* compiled from: PG */
public abstract class C84211k extends C8849b implements C84212l {
    public C84211k() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo29491e(parcel.createByteArray(), (SystemParcelableWrapper) C8850c.m23492a(parcel, SystemParcelableWrapper.CREATOR));
        return true;
    }
}
