package com.google.android.gms.learning.internal.training;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.training.s */
/* compiled from: PG */
public final class C144815s extends C8848a implements C144817u {
    public C144815s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainingService");
    }

    public final void addHttpUrlConnectionFactory(String str, C144802f fVar) {
        Parcel gA = mo17260gA();
        gA.writeString("cronet");
        C8850c.m23499h(gA, fVar);
        mo17262he(9, gA);
    }

    public final IBinder onBind(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        Parcel gT = mo17261gT(3, gA);
        IBinder readStrongBinder = gT.readStrongBinder();
        gT.recycle();
        return readStrongBinder;
    }

    public final void onCreate(C144165j jVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        mo17262he(1, gA);
    }

    public final void onDestroy() {
        mo17262he(2, mo17260gA());
    }

    public final void onRebind(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        mo17262he(7, gA);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        gA.writeInt(i);
        gA.writeInt(i2);
        Parcel gT = mo17261gT(5, gA);
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    public final void onTrimMemory(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17262he(4, gA);
    }

    public final boolean onUnbind(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        Parcel gT = mo17261gT(6, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    public final void setPRFSdkImpl() {
        throw null;
    }
}
