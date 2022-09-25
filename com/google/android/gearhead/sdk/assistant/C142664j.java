package com.google.android.gearhead.sdk.assistant;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;

/* renamed from: com.google.android.gearhead.sdk.assistant.j */
/* compiled from: PG */
public final class C142664j extends C8848a implements IInterface {
    public C142664j(IBinder iBinder) {
        super(iBinder, "com.google.android.gearhead.sdk.assistant.IVoicePlate");
    }

    /* renamed from: e */
    public final void mo117448e(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17263hf(1, gA);
    }
}
