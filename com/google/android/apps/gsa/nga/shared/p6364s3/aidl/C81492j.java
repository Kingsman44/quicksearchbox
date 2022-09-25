package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.j */
/* compiled from: PG */
public abstract class C81492j extends C8849b implements C81493k {
    public C81492j() {
        super("com.google.android.apps.gsa.nga.shared.s3.aidl.IOnDeviceArbitrationCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        byte[] createByteArray = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        mo75109a(createByteArray);
        return true;
    }
}
