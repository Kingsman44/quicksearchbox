package com.google.android.gms.lockbox.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.lockbox.internal.f */
/* compiled from: PG */
public final class C144990f extends C143887ac {
    public C144990f(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 26, sVar, uVar, vVar);
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.lockbox.internal.ILockboxService");
        return queryLocalInterface instanceof C144985a ? (C144985a) queryLocalInterface : new C144985a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.lockbox.internal.ILockboxService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.lockbox.service.START";
    }
}
