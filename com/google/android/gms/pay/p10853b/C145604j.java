package com.google.android.gms.pay.p10853b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.pay.C145606d;

/* renamed from: com.google.android.gms.pay.b.j */
/* compiled from: PG */
public final class C145604j extends C143887ac {
    public C145604j(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar) {
        super(context, looper, 198, sVar, aaVar, cjVar);
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 17895000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pay.internal.IThirdPartyPayService");
        return queryLocalInterface instanceof C145598d ? (C145598d) queryLocalInterface : new C145598d(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.pay.internal.IThirdPartyPayService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.pay.service.THIRD_PARTY";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return new Feature[]{C145606d.f393764g, C145606d.f393725A, C145606d.f393726B, C145606d.f393728D, C145606d.f393757af};
    }

    /* access modifiers changed from: protected */
    /* renamed from: kt */
    public final boolean mo117784kt() {
        return true;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }
}
