package com.google.android.gms.learning.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.e */
/* compiled from: PG */
public final class C144773e extends C8848a implements C144775g {
    public C144773e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
    }

    /* renamed from: a */
    public final void mo120092a(Status status, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, status);
        gA.writeLong(j);
        mo17262he(3, gA);
    }

    /* renamed from: b */
    public final void mo120093b(C144165j jVar, C144165j jVar2, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        gA.writeLong(j);
        mo17262he(2, gA);
    }
}
