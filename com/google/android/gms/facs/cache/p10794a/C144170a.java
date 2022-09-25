package com.google.android.gms.facs.cache.p10794a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.facs.cache.a.a */
/* compiled from: PG */
public final class C144170a extends C143887ac {
    public C144170a(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 202, sVar, uVar, vVar);
    }

    /* renamed from: T */
    public final boolean mo119462T() {
        return true;
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 19525000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsCacheService");
        return queryLocalInterface instanceof C144173d ? (C144173d) queryLocalInterface : new C144173d(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.facs.cache.internal.IFacsCacheService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.facs.cache.service.START";
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
