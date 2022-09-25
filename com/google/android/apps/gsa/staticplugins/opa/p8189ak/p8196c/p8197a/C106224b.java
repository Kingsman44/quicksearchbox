package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8197a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.a.b */
/* compiled from: PG */
public abstract class C106224b extends C8849b implements C106225c {
    public C106224b() {
        super("com.google.android.apps.gsa.staticplugins.opa.nga.ngaentrypoint.aidl.INgaEntryPointBinderSession");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo95458e(parcel.createByteArray(), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        return true;
    }
}
