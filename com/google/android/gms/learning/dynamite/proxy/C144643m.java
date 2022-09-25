package com.google.android.gms.learning.dynamite.proxy;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.m */
/* compiled from: PG */
public final class C144643m extends C8848a implements C144645o {
    public C144643m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingQueryCallback");
    }

    /* renamed from: e */
    public final void mo120098e(Status status, long j, long j2) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, status);
        gA.writeLong(j);
        gA.writeLong(j2);
        mo17262he(3, gA);
    }

    /* renamed from: f */
    public final void mo120099f(C144639i iVar, long j, long j2) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, iVar);
        gA.writeLong(j);
        gA.writeLong(j2);
        mo17262he(2, gA);
    }
}
