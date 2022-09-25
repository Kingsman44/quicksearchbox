package com.google.android.apps.gsa.unifiedime;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;

/* renamed from: com.google.android.apps.gsa.unifiedime.m */
/* compiled from: PG */
public final class C118595m extends C8848a implements IInterface {
    public C118595m(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.unifiedime.IUnifiedImeServiceCallback");
    }

    /* renamed from: e */
    public final void mo103781e(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17263hf(2, gA);
    }

    /* renamed from: f */
    public final void mo103782f(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17263hf(3, gA);
    }

    /* renamed from: g */
    public final void mo103783g(byte[] bArr) {
        Parcel gA = mo17260gA();
        gA.writeByteArray(bArr);
        mo17263hf(1, gA);
    }
}
