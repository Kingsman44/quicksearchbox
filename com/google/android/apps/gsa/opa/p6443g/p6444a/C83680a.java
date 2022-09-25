package com.google.android.apps.gsa.opa.p6443g.p6444a;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.gsa.opa.g.a.a */
/* compiled from: PG */
public abstract class C83680a extends C8849b implements C83681b {
    public C83680a() {
        super("com.google.android.apps.gsa.opa.proactiveapi.devapp.IProactiveApiTestService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            byte[] b = mo77008b();
            parcel2.writeNoException();
            parcel2.writeByteArray(b);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo77007a();
            parcel2.writeNoException();
            return true;
        }
    }
}
