package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.usonia.auth.internal.g */
/* compiled from: PG */
public abstract class C146134g extends C8849b implements C146135h {
    public C146134g() {
        super("com.google.android.gms.usonia.auth.internal.ISignAppCertificateCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo122685a((Status) C8850c.m23492a(parcel, Status.CREATOR), (SignAppCertificateResult) C8850c.m23492a(parcel, SignAppCertificateResult.CREATOR));
        return true;
    }
}
