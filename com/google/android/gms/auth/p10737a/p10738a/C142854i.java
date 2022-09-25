package com.google.android.gms.auth.p10737a.p10738a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.auth.a.a.i */
/* compiled from: PG */
public abstract class C142854i extends C8849b implements C142855j {
    public C142854i() {
        super("com.google.android.gms.auth.account.data.IGetStringValueCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        String readString = parcel.readString();
        enforceNoDataAvail(parcel);
        mo117785a((Status) C8850c.m23492a(parcel, Status.CREATOR), readString);
        return true;
    }
}
