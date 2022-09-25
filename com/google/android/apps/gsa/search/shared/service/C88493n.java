package com.google.android.apps.gsa.search.shared.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.search.shared.service.n */
/* compiled from: PG */
public final class C88493n extends C8848a implements C88495p {
    public C88493n(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.search.shared.service.ISearchServiceBinder");
    }

    /* renamed from: a */
    public final AttachClientResponse mo80232a(long j, C88498s sVar, ClientConfig clientConfig, long j2) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        C8850c.m23499h(gA, sVar);
        C8850c.m23497f(gA, clientConfig);
        gA.writeLong(j2);
        Parcel gT = mo17261gT(1, gA);
        AttachClientResponse attachClientResponse = (AttachClientResponse) C8850c.m23492a(gT, AttachClientResponse.CREATOR);
        gT.recycle();
        return attachClientResponse;
    }

    /* renamed from: b */
    public final void mo80233b(long j, boolean z) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        C8850c.m23495d(gA, z);
        mo17262he(2, gA);
    }
}
