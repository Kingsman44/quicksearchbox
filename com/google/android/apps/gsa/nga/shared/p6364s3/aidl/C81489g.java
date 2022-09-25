package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.g */
/* compiled from: PG */
public abstract class C81489g extends C8849b implements C81490h {
    public C81489g() {
        super("com.google.android.apps.gsa.nga.shared.s3.aidl.IDeviceSelectionCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        byte[] createByteArray = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        mo75108b(createByteArray);
        return true;
    }
}
