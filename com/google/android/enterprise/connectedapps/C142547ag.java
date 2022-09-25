package com.google.android.enterprise.connectedapps;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.enterprise.connectedapps.ag */
/* compiled from: PG */
public final class C142547ag extends C8848a implements C142549ai {
    public C142547ag(IBinder iBinder) {
        super(iBinder, "com.google.android.enterprise.connectedapps.ICrossProfileCallback");
    }

    /* renamed from: a */
    public final void mo117144a(long j, int i, byte[] bArr) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        gA.writeInt(i);
        gA.writeByteArray(bArr);
        mo17262he(4, gA);
    }

    /* renamed from: b */
    public final void mo117145b(long j, int i, int i2, byte[] bArr) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        gA.writeInt(i);
        gA.writeInt(i2);
        gA.writeByteArray(bArr);
        mo17262he(3, gA);
    }

    /* renamed from: c */
    public final void mo117146c(long j, int i, int i2, byte[] bArr) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        gA.writeInt(i);
        gA.writeInt(i2);
        gA.writeByteArray(bArr);
        mo17262he(1, gA);
    }

    /* renamed from: d */
    public final void mo117147d(long j, Bundle bundle) {
        Parcel gA = mo17260gA();
        gA.writeLong(j);
        gA.writeInt(0);
        C8850c.m23497f(gA, bundle);
        mo17262he(2, gA);
    }
}
