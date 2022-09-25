package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.search.shared.service.l */
/* compiled from: PG */
public abstract class C88491l extends C8849b implements C88492m {
    public C88491l() {
        super("com.google.android.apps.gsa.search.shared.service.ISearchService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo80387i((ClientEventData) C8850c.m23492a(parcel, ClientEventData.CREATOR));
        return true;
    }
}
