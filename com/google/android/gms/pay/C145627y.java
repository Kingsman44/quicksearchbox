package com.google.android.gms.pay;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.pay.p10852a.C145579a;
import com.google.android.gms.pay.p10853b.C145601g;

/* renamed from: com.google.android.gms.pay.y */
/* compiled from: PG */
public final class C145627y {

    /* renamed from: a */
    static final C143840l f393785a;

    /* renamed from: b */
    static final C143840l f393786b;

    /* renamed from: c */
    static final C143707a f393787c;

    /* renamed from: d */
    static final C143707a f393788d;

    /* renamed from: e */
    public static final C143841m f393789e;

    static {
        C143840l lVar = new C143840l();
        f393785a = lVar;
        C143840l lVar2 = new C143840l();
        f393786b = lVar2;
        C145625w wVar = new C145625w();
        f393787c = wVar;
        C145626x xVar = new C145626x();
        f393788d = xVar;
        f393789e = new C143841m("Pay.API", wVar, lVar);
        new C143841m("Pay.THIRD_PARTY_API", xVar, lVar2);
    }

    /* renamed from: a */
    public static C145579a m236726a(Context context) {
        return new C145601g(context);
    }

    /* renamed from: b */
    public static boolean m236727b(Context context) {
        return new Intent().setAction("com.google.android.gms.pay.PAY_OPTIONAL").setPackage("com.google.android.gms").resolveActivity(context.getApplicationContext().getPackageManager()) != null;
    }
}
