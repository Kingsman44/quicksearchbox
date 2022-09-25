package com.google.android.apps.gsa.search.shared.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.search.shared.service.k */
/* compiled from: PG */
public final class C88490k extends C8848a implements C88492m {
    public C88490k(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.search.shared.service.ISearchService");
    }

    /* renamed from: i */
    public final void mo80387i(ClientEventData clientEventData) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, clientEventData);
        mo17263hf(1, gA);
    }
}
