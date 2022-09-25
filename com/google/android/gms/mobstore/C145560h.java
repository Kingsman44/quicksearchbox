package com.google.android.gms.mobstore;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mobstore.h */
/* compiled from: PG */
public abstract class C145560h extends C8849b implements C145561i {
    public C145560h() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo121454b((Status) C8850c.m23492a(parcel, Status.CREATOR), (OpenFileDescriptorResponse) C8850c.m23492a(parcel, OpenFileDescriptorResponse.CREATOR));
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo121453a((Status) C8850c.m23492a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo121455c((Status) C8850c.m23492a(parcel, Status.CREATOR));
        }
        return true;
    }
}
