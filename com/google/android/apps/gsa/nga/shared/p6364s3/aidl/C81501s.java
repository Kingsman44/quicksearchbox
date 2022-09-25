package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.s */
/* compiled from: PG */
public abstract class C81501s extends C8849b implements C81502t {
    public C81501s() {
        super("com.google.android.apps.gsa.nga.shared.s3.aidl.IVoiceStreamReadCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            mo75111f(createByteArray);
        } else if (i != 2) {
            return false;
        } else {
            mo75110e();
        }
        return true;
    }
}
