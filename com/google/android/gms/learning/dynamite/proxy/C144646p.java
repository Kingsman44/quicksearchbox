package com.google.android.gms.learning.dynamite.proxy;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.p */
/* compiled from: PG */
public final class C144646p extends C8848a implements C144648r {
    public C144646p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.proxy.IExampleStoreProxy");
    }

    /* renamed from: e */
    public final void mo120100e(String str, byte[] bArr, byte[] bArr2, C144645o oVar, byte[] bArr3) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeByteArray(bArr);
        gA.writeByteArray(bArr2);
        C8850c.m23499h(gA, oVar);
        gA.writeByteArray(bArr3);
        mo17263hf(3, gA);
    }
}
