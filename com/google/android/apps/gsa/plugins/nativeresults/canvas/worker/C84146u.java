package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.u */
/* compiled from: PG */
public abstract class C84146u extends C8849b implements C84147v {
    public C84146u() {
        super("com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.IFetcherCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo77529a((ParcelableFetcherResponse) C8850c.m23492a(parcel, ParcelableFetcherResponse.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
