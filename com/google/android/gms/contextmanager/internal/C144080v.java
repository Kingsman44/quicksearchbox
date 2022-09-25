package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.contextmanager.internal.v */
/* compiled from: PG */
public abstract class C144080v extends C8849b implements C144081w {
    public C144080v() {
        super("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                enforceNoDataAvail(parcel);
                mo119626d((Status) C8850c.m23492a(parcel, Status.CREATOR));
                break;
            case 2:
                Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                DataHolder dataHolder = (DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR);
                DataHolder dataHolder2 = (DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR);
                enforceNoDataAvail(parcel);
                mo119628f();
                break;
            case 3:
                Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                WriteBatchImpl writeBatchImpl = (WriteBatchImpl) C8850c.m23492a(parcel, WriteBatchImpl.CREATOR);
                enforceNoDataAvail(parcel);
                mo119629g();
                break;
            case 5:
                enforceNoDataAvail(parcel);
                mo119623a((Status) C8850c.m23492a(parcel, Status.CREATOR), (DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR));
                break;
            case 6:
                enforceNoDataAvail(parcel);
                mo119625c((Status) C8850c.m23492a(parcel, Status.CREATOR), (Snapshot) C8850c.m23492a(parcel, Snapshot.CREATOR));
                break;
            case 7:
                enforceNoDataAvail(parcel);
                mo119624b((Status) C8850c.m23492a(parcel, Status.CREATOR), (FenceStateMapImpl) C8850c.m23492a(parcel, FenceStateMapImpl.CREATOR));
                break;
            case 8:
                Status status3 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                FenceStateImpl fenceStateImpl = (FenceStateImpl) C8850c.m23492a(parcel, FenceStateImpl.CREATOR);
                enforceNoDataAvail(parcel);
                mo119627e();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
