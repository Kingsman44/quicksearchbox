package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.measurement.api.internal.h */
/* compiled from: PG */
public final class C145199h extends C8848a implements C145200i {
    public C145199h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: e */
    public final int mo120748e() {
        Parcel gT = mo17261gT(2, mo17260gA());
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final void mo120749f(String str, String str2, Bundle bundle, long j) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        C8850c.m23497f(gA, bundle);
        gA.writeLong(j);
        mo17262he(1, gA);
    }
}
