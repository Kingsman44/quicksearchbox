package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.search.shared.service.r */
/* compiled from: PG */
public abstract class C88497r extends C8849b implements C88498s {
    public C88497r() {
        super("com.google.android.apps.gsa.search.shared.service.ISearchServiceUiCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo82016e((ServiceEventData) C8850c.m23492a(parcel, ServiceEventData.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            mo82017f(readInt);
        }
        return true;
    }
}
