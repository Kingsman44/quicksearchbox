package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.usonia.auth.internal.j */
/* compiled from: PG */
public abstract class C146137j extends C8849b implements C146138k {
    public C146137j() {
        super("com.google.android.gms.usonia.auth.internal.IStructureInfoCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo122686e((OnStructureInfoUpdatedParams) C8850c.m23492a(parcel, OnStructureInfoUpdatedParams.CREATOR));
        return true;
    }
}
