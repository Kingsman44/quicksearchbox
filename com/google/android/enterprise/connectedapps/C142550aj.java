package com.google.android.enterprise.connectedapps;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.enterprise.connectedapps.aj */
/* compiled from: PG */
public final class C142550aj extends C8848a implements C142552al {
    public C142550aj(IBinder iBinder) {
        super(iBinder, "com.google.android.enterprise.connectedapps.ICrossProfileService");
    }

    /* renamed from: a */
    public final void mo77085a(long j, int i, int i2, byte[] bArr) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        gA.writeInt(i);
        gA.writeInt(i2);
        gA.writeByteArray(bArr);
        mo17262he(1, gA);
    }

    /* renamed from: b */
    public final byte[] mo77086b(long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        gA.writeInt(i);
        gA.writeLong(j2);
        gA.writeInt(i2);
        gA.writeByteArray(bArr);
        C8850c.m23499h(gA, aiVar);
        Parcel gT = mo17261gT(3, gA);
        byte[] createByteArray = gT.createByteArray();
        gT.recycle();
        return createByteArray;
    }

    /* renamed from: c */
    public final byte[] mo77087c(long j, int i) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        gA.writeInt(i);
        Parcel gT = mo17261gT(4, gA);
        byte[] createByteArray = gT.createByteArray();
        gT.recycle();
        return createByteArray;
    }

    /* renamed from: d */
    public final Bundle mo77088d(long j) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        gA.writeInt(0);
        Parcel gT = mo17261gT(5, gA);
        Bundle bundle = (Bundle) C8850c.m23492a(gT, Bundle.CREATOR);
        gT.recycle();
        return bundle;
    }

    /* renamed from: e */
    public final void mo77089e(long j, Bundle bundle) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        gA.writeInt(0);
        C8850c.m23497f(gA, bundle);
        mo17262he(2, gA);
    }
}
