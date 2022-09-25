package com.google.firebase.dynamiclinks.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.firebase.dynamiclinks.internal.j */
/* compiled from: PG */
public abstract class C61187j extends C8849b implements C61188k {
    public C61187j() {
        super("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
            DynamicLinkData dynamicLinkData = (DynamicLinkData) C8850c.m23492a(parcel, DynamicLinkData.CREATOR);
            enforceNoDataAvail(parcel);
            mo57750b();
        } else if (i != 2) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo57749a((Status) C8850c.m23492a(parcel, Status.CREATOR), (ShortDynamicLinkImpl) C8850c.m23492a(parcel, ShortDynamicLinkImpl.CREATOR));
        }
        return true;
    }
}
