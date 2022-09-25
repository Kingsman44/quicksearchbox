package com.google.android.gms.learning.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.k */
/* compiled from: PG */
public final class C144779k extends C8848a implements C144781m {
    public C144779k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
    }

    /* renamed from: a */
    public final void mo120094a(Status status, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, status);
        gA.writeLong(j);
        mo17262he(3, gA);
    }

    /* renamed from: b */
    public final void mo120095b(C144778j jVar, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        gA.writeLong(j);
        mo17262he(2, gA);
    }
}
