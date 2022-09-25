package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wearable.internal.bj */
/* compiled from: PG */
public final class C146452bj extends C8848a implements IInterface {
    public C146452bj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    /* renamed from: e */
    public final void mo123252e(C146448bf bfVar, AddListenerRequest addListenerRequest) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, bfVar);
        C8850c.m23497f(gA, addListenerRequest);
        mo17262he(16, gA);
    }
}
