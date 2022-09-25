package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.usonia.directory.internal.u */
/* compiled from: PG */
public abstract class C146285u extends C8849b implements C146286v {
    public C146285u() {
        super("com.google.android.gms.usonia.directory.internal.IDistributedServiceAvailabilityCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo122842b((OnDistributedServiceAvailableParams) C8850c.m23492a(parcel, OnDistributedServiceAvailableParams.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo122843c((OnDistributedServiceOfflineParams) C8850c.m23492a(parcel, OnDistributedServiceOfflineParams.CREATOR));
        }
        return true;
    }
}
