package com.google.android.apps.p453b.p457b.p458a.p459a;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.b.b.a.a.a */
/* compiled from: PG */
public abstract class C8998a extends C8849b implements C8999b {
    public C8998a() {
        super("com.google.android.apps.gmm.offline.aidl.shared.IProtoResultListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            mo17309b(createByteArray);
        } else if (i != 2) {
            return false;
        } else {
            byte[] createByteArray2 = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            mo17308a(createByteArray2);
        }
        return true;
    }
}
