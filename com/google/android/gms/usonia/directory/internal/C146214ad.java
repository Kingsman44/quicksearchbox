package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.usonia.directory.internal.ad */
/* compiled from: PG */
public abstract class C146214ad extends C8849b implements C146215ae {
    public C146214ad() {
        super("com.google.android.gms.usonia.directory.internal.IUsoniaStatusCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo122806e((Status) C8850c.m23492a(parcel, Status.CREATOR));
        return true;
    }
}
