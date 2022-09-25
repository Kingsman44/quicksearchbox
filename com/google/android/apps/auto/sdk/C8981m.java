package com.google.android.apps.auto.sdk;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.auto.sdk.m */
/* compiled from: PG */
public abstract class C8981m extends C8849b implements C8982n {
    public C8981m() {
        super("com.google.android.apps.auto.sdk.IImeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            boolean c = mo17298c();
            parcel2.writeNoException();
            C8850c.m23495d(parcel2, c);
        } else if (i == 2) {
            mo17296a();
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            mo17297b();
            parcel2.writeNoException();
        }
        return true;
    }
}
