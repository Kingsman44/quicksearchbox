package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.cast.C143610s;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.cast.internal.k */
/* compiled from: PG */
public final class C143585k extends C143887ac {
    public C143585k(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 161, sVar, uVar, vVar);
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12451000;
    }

    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof C143564ac ? (C143564ac) queryLocalInterface : new C143564ac(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C143610s.f389378n;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
