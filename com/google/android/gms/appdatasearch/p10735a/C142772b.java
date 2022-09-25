package com.google.android.gms.appdatasearch.p10735a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.appdatasearch.a.b */
/* compiled from: PG */
public final class C142772b extends C8848a implements IInterface {
    public C142772b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    /* renamed from: e */
    public final void mo117677e(C142774d dVar, UsageInfo[] usageInfoArr) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, dVar);
        gA.writeString((String) null);
        gA.writeTypedArray(usageInfoArr, 0);
        mo17262he(1, gA);
    }
}
