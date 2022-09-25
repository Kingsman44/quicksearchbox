package com.google.android.gms.mdh.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.p10813i.C144352a;

/* renamed from: com.google.android.gms.mdh.internal.v */
/* compiled from: PG */
public final class C145071v extends C143887ac {
    public C145071v(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 127, sVar, uVar, vVar);
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12600000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMobileDataHubService");
        return queryLocalInterface instanceof C145064o ? (C145064o) queryLocalInterface : new C145064o(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.mdh.internal.IMobileDataHubService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.mdh.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C144352a.f390917i;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
