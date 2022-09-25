package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.y */
/* compiled from: PG */
public final class C143554y extends C8848a implements C143555z {
    public C143554y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    /* renamed from: e */
    public final int mo118865e(Intent intent, int i, int i2) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        gA.writeInt(i);
        gA.writeInt(i2);
        Parcel gT = mo17261gT(2, gA);
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final IBinder mo118866f(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        Parcel gT = mo17261gT(3, gA);
        IBinder readStrongBinder = gT.readStrongBinder();
        gT.recycle();
        return readStrongBinder;
    }

    /* renamed from: g */
    public final void mo118867g() {
        mo17262he(1, mo17260gA());
    }

    /* renamed from: h */
    public final void mo118868h() {
        mo17262he(4, mo17260gA());
    }
}
