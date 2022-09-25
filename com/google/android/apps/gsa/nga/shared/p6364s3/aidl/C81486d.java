package com.google.android.apps.gsa.nga.shared.p6364s3.aidl;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.aidl.d */
/* compiled from: PG */
public abstract class C81486d extends C8849b implements C81487e {
    public C81486d() {
        super("com.google.android.apps.gsa.nga.shared.s3.aidl.ICloudFulfillmentCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo75106e((CloudFulfillmentData) C8850c.m23492a(parcel, CloudFulfillmentData.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo75107f();
        }
        return true;
    }
}
