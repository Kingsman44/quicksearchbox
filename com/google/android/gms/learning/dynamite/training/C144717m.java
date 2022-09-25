package com.google.android.gms.learning.dynamite.training;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;

/* renamed from: com.google.android.gms.learning.dynamite.training.m */
/* compiled from: PG */
public final class C144717m extends C8848a implements C144719o {
    public C144717m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.training.IInAppTrainingResultCallback");
    }

    /* renamed from: e */
    public final void mo120156e(byte[] bArr, int i) {
        Parcel gA = mo17260gA();
        gA.writeByteArray(bArr);
        gA.writeInt(i);
        mo17262he(6, gA);
    }
}
