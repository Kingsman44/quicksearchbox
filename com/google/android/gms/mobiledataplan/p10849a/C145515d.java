package com.google.android.gms.mobiledataplan.p10849a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.mobiledataplan.C145517c;

/* renamed from: com.google.android.gms.mobiledataplan.a.d */
/* compiled from: PG */
public final class C145515d extends C143887ac {
    public C145515d(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 158, sVar, uVar, vVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService");
        return queryLocalInterface instanceof C145514c ? (C145514c) queryLocalInterface : new C145514c(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.mobiledataplan.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C145517c.f393528c;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
