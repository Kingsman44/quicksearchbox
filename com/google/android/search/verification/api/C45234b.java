package com.google.android.search.verification.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.search.verification.api.b */
/* compiled from: PG */
public abstract class C45234b extends C8849b implements C45235c {
    public C45234b() {
        super("com.google.android.search.verification.api.ISearchActionVerificationService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Bundle bundle = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            boolean b = mo49097b((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
            parcel2.writeNoException();
            C8850c.m23495d(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(mo49096a());
        }
        return true;
    }
}
