package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mdisync.internal.a */
/* compiled from: PG */
public abstract class C145088a extends C8849b implements C145089b {
    public C145088a() {
        super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo120601a((Status) C8850c.m23492a(parcel, Status.CREATOR), (SyncResult) C8850c.m23492a(parcel, SyncResult.CREATOR));
        return true;
    }
}
