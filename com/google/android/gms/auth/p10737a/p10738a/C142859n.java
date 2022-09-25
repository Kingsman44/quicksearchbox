package com.google.android.gms.auth.p10737a.p10738a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.auth.a.a.n */
/* compiled from: PG */
public abstract class C142859n extends C8849b implements C142860o {
    public C142859n() {
        super("com.google.android.gms.auth.account.data.IHasCapabilitiesCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        int readInt = parcel.readInt();
        enforceNoDataAvail(parcel);
        mo117777a((Status) C8850c.m23492a(parcel, Status.CREATOR), readInt);
        return true;
    }
}
