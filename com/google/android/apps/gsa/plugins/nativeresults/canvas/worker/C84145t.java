package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.t */
/* compiled from: PG */
public final class C84145t extends C8848a implements C84147v {
    public C84145t(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.IFetcherCallback");
    }

    /* renamed from: a */
    public final void mo77529a(ParcelableFetcherResponse parcelableFetcherResponse) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, parcelableFetcherResponse);
        mo17262he(2, gA);
    }
}
