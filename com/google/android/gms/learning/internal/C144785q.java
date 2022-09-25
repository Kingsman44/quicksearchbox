package com.google.android.gms.learning.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.q */
/* compiled from: PG */
public final class C144785q extends C8848a implements C144787s {
    public C144785q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
    }

    public final void init(C144165j jVar, C144784p pVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, pVar);
        mo17262he(1, gA);
    }

    public final IBinder onBind(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        Parcel gT = mo17261gT(3, gA);
        IBinder readStrongBinder = gT.readStrongBinder();
        gT.recycle();
        return readStrongBinder;
    }

    public final void onDestroy() {
        mo17262he(2, mo17260gA());
    }

    public final void onRebind(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        mo17262he(6, gA);
    }

    public final void onTrimMemory(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17262he(4, gA);
    }

    public final boolean onUnbind(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        Parcel gT = mo17261gT(5, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }
}
