package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.m */
/* compiled from: PG */
public abstract class C81495m extends C8849b implements C81496n {
    public C81495m() {
        super("com.google.android.apps.gsa.nga.shared.s3.aidl.IStreamCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        byte[] createByteArray = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        mo72775a(createByteArray);
        return true;
    }
}
