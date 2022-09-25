package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;

/* renamed from: com.google.android.gms.cast.internal.z */
/* compiled from: PG */
public final class C143600z extends C8848a implements IInterface {
    public C143600z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    /* renamed from: e */
    public final void mo118934e() {
        mo17263hf(1, mo17260gA());
    }

    /* renamed from: f */
    public final void mo118935f(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        mo17263hf(12, gA);
    }
}
