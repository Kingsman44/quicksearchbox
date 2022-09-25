package com.google.android.remotesearch;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.remotesearch.e */
/* compiled from: PG */
public abstract class C45219e extends C8849b implements C45220f {
    public C45219e() {
        super("com.google.android.remotesearch.IRemoteSearchServiceSession");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        byte[] createByteArray = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        mo49084a(createByteArray);
        return true;
    }
}
