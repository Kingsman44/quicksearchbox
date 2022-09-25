package com.google.android.gms.mdh.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143771bs;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mdh.internal.p */
/* compiled from: PG */
public abstract class C145065p extends C8849b implements C145066q {
    public C145065p() {
        super("com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C143773bu buVar = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                buVar = queryLocalInterface instanceof C143773bu ? (C143773bu) queryLocalInterface : new C143771bs(readStrongBinder);
            }
            enforceNoDataAvail(parcel);
            mo120573c(buVar, (TimeSeriesFootprintsSubscriptionFilter) C8850c.m23492a(parcel, TimeSeriesFootprintsSubscriptionFilter.CREATOR), (MdhFootprintListSafeParcelable) C8850c.m23492a(parcel, MdhFootprintListSafeParcelable.CREATOR));
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                buVar = queryLocalInterface2 instanceof C143773bu ? (C143773bu) queryLocalInterface2 : new C143771bs(readStrongBinder2);
            }
            enforceNoDataAvail(parcel);
            mo120572b(buVar, (MdhFootprintListSafeParcelable) C8850c.m23492a(parcel, MdhFootprintListSafeParcelable.CREATOR));
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                buVar = queryLocalInterface3 instanceof C143773bu ? (C143773bu) queryLocalInterface3 : new C143771bs(readStrongBinder3);
            }
            long readLong = parcel.readLong();
            enforceNoDataAvail(parcel);
            mo120571a(buVar, readLong);
        } else if (i != 4) {
            return false;
        } else {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                buVar = queryLocalInterface4 instanceof C143773bu ? (C143773bu) queryLocalInterface4 : new C143771bs(readStrongBinder4);
            }
            enforceNoDataAvail(parcel);
            mo120574d(buVar, (SyncStatus) C8850c.m23492a(parcel, SyncStatus.CREATOR));
        }
        return true;
    }
}
