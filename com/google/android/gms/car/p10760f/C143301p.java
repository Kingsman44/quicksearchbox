package com.google.android.gms.car.p10760f;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.p060c.C0984n;
import com.google.android.gms.car.C143127bk;
import com.google.android.gms.car.C143141by;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.car.f.p */
/* compiled from: PG */
public final class C143301p extends C143887ac {

    /* renamed from: a */
    public final C0984n f388527a = new C0984n(0);

    public C143301p(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar) {
        super(context, looper, 13, sVar, uVar, vVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarCall");
        return queryLocalInterface instanceof C143141by ? (C143141by) queryLocalInterface : new C143141by(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.car.ICarCall";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.car.CALL";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C143127bk.f388183b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo118342k() {
        return 161;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
