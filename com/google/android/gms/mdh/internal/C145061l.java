package com.google.android.gms.mdh.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprintsReadResult;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mdh.internal.l */
/* compiled from: PG */
public abstract class C145061l extends C8849b implements C145062m {
    public C145061l() {
        super("com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo120579a((Status) C8850c.m23492a(parcel, Status.CREATOR), (MdhFootprintsReadResult) C8850c.m23492a(parcel, MdhFootprintsReadResult.CREATOR));
        return true;
    }
}
