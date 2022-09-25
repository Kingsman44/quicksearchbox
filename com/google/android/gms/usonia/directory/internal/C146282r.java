package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.usonia.directory.internal.r */
/* compiled from: PG */
public abstract class C146282r extends C8849b implements C146283s {
    public C146282r() {
        super("com.google.android.gms.usonia.directory.internal.IDirectoryStateCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo122840c((OnDistributedStateChangeParams) C8850c.m23492a(parcel, OnDistributedStateChangeParams.CREATOR));
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo122841d((OnInititialDistributedStateCompleteParams) C8850c.m23492a(parcel, OnInititialDistributedStateCompleteParams.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo122839b((OnDeviceOfflineParams) C8850c.m23492a(parcel, OnDeviceOfflineParams.CREATOR));
        }
        return true;
    }
}
