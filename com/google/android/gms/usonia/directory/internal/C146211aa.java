package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.usonia.directory.internal.aa */
/* compiled from: PG */
public abstract class C146211aa extends C8849b implements C146212ab {
    public C146211aa() {
        super("com.google.android.gms.usonia.directory.internal.IResolvePeerAddressCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo122805e((Status) C8850c.m23492a(parcel, Status.CREATOR), (ResolvePeerAddressResult) C8850c.m23492a(parcel, ResolvePeerAddressResult.CREATOR));
        return true;
    }
}
