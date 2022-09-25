package com.google.android.apps.gsa.nga.shared.p6339f.p6340a;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.a.b */
/* compiled from: PG */
public abstract class C81025b extends C8849b implements C81026c {
    public C81025b() {
        super("com.google.android.apps.gsa.nga.shared.bisto.aidl.IOnClientHotwordCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        byte[] createByteArray = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        mo74812a(createByteArray);
        return true;
    }
}
