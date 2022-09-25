package com.google.android.gms.clearcut.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.clearcut.C143620aa;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.clearcut.internal.j */
/* compiled from: PG */
public final class C143642j extends C143887ac {
    public C143642j(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 40, sVar, uVar, vVar);
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof C143650r ? (C143650r) queryLocalInterface : new C143650r(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C143620aa.f389406b;
    }
}
