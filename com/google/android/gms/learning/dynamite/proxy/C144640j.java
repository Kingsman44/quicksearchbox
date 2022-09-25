package com.google.android.gms.learning.dynamite.proxy;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.j */
/* compiled from: PG */
public final class C144640j extends C8848a implements C144642l {
    public C144640j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIteratorCallback");
    }

    /* renamed from: e */
    public final void mo120096e(byte[] bArr, boolean z, byte[] bArr2, long j, long j2) {
        Parcel gA = mo17260gA();
        gA.writeByteArray(bArr);
        C8850c.m23495d(gA, z);
        gA.writeByteArray(bArr2);
        gA.writeLong(j);
        gA.writeLong(j2);
        mo17262he(4, gA);
    }

    /* renamed from: f */
    public final void mo120097f(Status status, long j, long j2) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, status);
        gA.writeLong(j);
        gA.writeLong(j2);
        mo17262he(3, gA);
    }
}
