package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.common.api.internal.bt */
/* compiled from: PG */
public abstract class C143772bt extends C8849b implements C143773bu {
    public C143772bt() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo117762a((Status) C8850c.m23492a(parcel, Status.CREATOR));
        return true;
    }
}
