package com.google.android.apps.gsa.publicsearch;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.publicsearch.j */
/* compiled from: PG */
public final class C84210j extends C8848a implements C84212l {
    public C84210j(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
    }

    /* renamed from: e */
    public final void mo29491e(byte[] bArr, SystemParcelableWrapper systemParcelableWrapper) {
        Parcel gA = mo17260gA();
        gA.writeByteArray(bArr);
        C8850c.m23497f(gA, systemParcelableWrapper);
        mo17263hf(1, gA);
    }
}
