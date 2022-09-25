package com.google.android.gms.udc.p10875a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.udc.a.l */
/* compiled from: PG */
public final class C146059l extends C143887ac {
    public C146059l(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 35, sVar, uVar, vVar);
        C143919bh.m233971n(sVar.f390169a, "Must pass an account via UdcOptions or call GoogleApiClient.Builder.setAccount()");
    }

    /* renamed from: T */
    public final boolean mo119462T() {
        return true;
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12800000;
    }

    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.udc.internal.IUdcService");
        return queryLocalInterface instanceof C146050c ? (C146050c) queryLocalInterface : new C146050c(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.udc.internal.IUdcService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.udc.service.START";
    }
}
