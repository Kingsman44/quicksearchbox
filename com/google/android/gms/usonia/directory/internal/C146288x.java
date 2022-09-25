package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.usonia.directory.internal.x */
/* compiled from: PG */
public abstract class C146288x extends C8849b implements C146289y {
    public C146288x() {
        super("com.google.android.gms.usonia.directory.internal.IFetchAllPeerAddressesCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo122808e((Status) C8850c.m23492a(parcel, Status.CREATOR), (FetchAllPeerAddressesResult) C8850c.m23492a(parcel, FetchAllPeerAddressesResult.CREATOR));
        return true;
    }
}
