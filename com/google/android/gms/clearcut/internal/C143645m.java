package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.clearcut.internal.m */
/* compiled from: PG */
public abstract class C143645m extends C8849b implements C143646n {
    public C143645m() {
        super("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
        int readInt = parcel.readInt();
        enforceNoDataAvail(parcel);
        mo118950a(readInt);
        return true;
    }
}
