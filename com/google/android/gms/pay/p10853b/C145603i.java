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

/* renamed from: com.google.android.gms.pay.b.i */
/* compiled from: PG */
public final class C145603i extends C143887ac {
    public C145603i(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar) {
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pay.internal.IPayService");
        return queryLocalInterface instanceof C145595a ? (C145595a) queryLocalInterface : new C145595a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.pay.internal.IPayService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.pay.service.BIND";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return new Feature[]{C145606d.f393751a, C145606d.f393759b, C145606d.f393740P, C145606d.f393761d, C145606d.f393762e, C145606d.f393763f, C145606d.f393764g, C145606d.f393765h, C145606d.f393766i, C145606d.f393767j, C145606d.f393768k, C145606d.f393769l, C145606d.f393770m, C145606d.f393771n, C145606d.f393773p, C145606d.f393772o, C145606d.f393774q, C145606d.f393777t, C145606d.f393776s, C145606d.f393760c, C145606d.f393778u, C145606d.f393779v, C145606d.f393780w, C145606d.f393782y, C145606d.f393783z, C145606d.f393727C, C145606d.f393725A, C145606d.f393726B, C145606d.f393729E, C145606d.f393728D, C145606d.f393732H, C145606d.f393733I, C145606d.f393734J, C145606d.f393735K, C145606d.f393736L, C145606d.f393737M, C145606d.f393739O, C145606d.f393741Q, C145606d.f393742R, C145606d.f393743S, C145606d.f393744T, C145606d.f393745U, C145606d.f393730F, C145606d.f393746V, C145606d.f393747W, C145606d.f393748X, C145606d.f393749Y, C145606d.f393750Z, C145606d.f393752aa, C145606d.f393753ab, C145606d.f393754ac, C145606d.f393781x, C145606d.f393775r, C145606d.f393755ad, C145606d.f393731G, C145606d.f393738N, C145606d.f393756ae, C145606d.f393757af, C145606d.f393758ag};
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
