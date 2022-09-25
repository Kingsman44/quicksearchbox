package com.google.android.libraries.lens.sdk.p2047d;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.lens.sdk.d.e */
/* compiled from: PG */
public abstract class C24935e extends C8849b implements C24936f {
    public C24935e() {
        super("com.google.android.libraries.lens.sdk.shared.ILensServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo30040c((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        return true;
    }
}
