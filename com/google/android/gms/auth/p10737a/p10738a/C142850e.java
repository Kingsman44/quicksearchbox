package com.google.android.gms.auth.p10737a.p10738a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.auth.a.a.e */
/* compiled from: PG */
public abstract class C142850e extends C8849b implements C142851f {
    public C142850e() {
        super("com.google.android.gms.auth.account.data.IBundleCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo117775a((Status) C8850c.m23492a(parcel, Status.CREATOR), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        return true;
    }
}
