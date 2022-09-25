package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.measurement.api.internal.f */
/* compiled from: PG */
public abstract class C145197f extends C8849b implements C145198g {
    public C145197f() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo120689c((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
