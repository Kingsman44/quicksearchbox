package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.usonia.auth.internal.e */
/* compiled from: PG */
public abstract class C146132e extends C8849b implements C146133f {
    public C146132e() {
        super("com.google.android.gms.usonia.auth.internal.ICheckIsServiceAllowedCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        boolean i3 = C8850c.m23500i(parcel);
        enforceNoDataAvail(parcel);
        mo122684a((Status) C8850c.m23492a(parcel, Status.CREATOR), i3);
        return true;
    }
}
