package com.google.android.gms.pseudonymous.p10861a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.pseudonymous.a.a */
/* compiled from: PG */
public abstract class C145762a extends C8849b implements C145763b {
    public C145762a() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo121928c((Status) C8850c.m23492a(parcel, Status.CREATOR), (PseudonymousIdToken) C8850c.m23492a(parcel, PseudonymousIdToken.CREATOR));
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo121927b((Status) C8850c.m23492a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            long readLong = parcel.readLong();
            enforceNoDataAvail(parcel);
            mo121926a((Status) C8850c.m23492a(parcel, Status.CREATOR), readLong);
        }
        return true;
    }
}
