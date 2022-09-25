package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.contextmanager.internal.t */
/* compiled from: PG */
public abstract class C144078t extends C8849b implements C144079u {
    public C144078t() {
        super("com.google.android.gms.contextmanager.internal.IContextListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo119619a((ContextData) C8850c.m23492a(parcel, ContextData.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
