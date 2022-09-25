package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.bs */
/* compiled from: PG */
public abstract class C143135bs extends C8849b implements C143136bt {
    public C143135bs() {
        super("com.google.android.gms.car.ICarActivityLifecycleEventListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            enforceNoDataAvail(parcel);
            mo117996b((ActivityLaunchInfo) C8850c.m23492a(parcel, ActivityLaunchInfo.CREATOR));
            return true;
        } else if (i == 3) {
            enforceNoDataAvail(parcel);
            mo117995a((ActivityLaunchInfo) C8850c.m23492a(parcel, ActivityLaunchInfo.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo117997c((ActivityLaunchInfo) C8850c.m23492a(parcel, ActivityLaunchInfo.CREATOR));
            return true;
        }
    }
}
