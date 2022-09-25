package com.google.android.gms.p10811h.p10812a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.h.a.d */
/* compiled from: PG */
public abstract class C144341d extends C8849b implements C144342e {
    public C144341d() {
        super("com.google.android.gms.homegraph.internal.IHgsIdCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        enforceNoDataAvail(parcel);
        mo119864a((Status) C8850c.m23492a(parcel, Status.CREATOR), readString);
        return true;
    }
}
