package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.internal.C143891ag;
import com.google.android.gms.common.internal.C143929d;
import com.google.android.gms.common.internal.C143930e;
import com.google.android.gms.common.internal.C143939n;

/* renamed from: com.google.android.gms.measurement.internal.dt */
/* compiled from: PG */
public final class C145321dt extends C143939n {
    public C145321dt(Context context, Looper looper, C143929d dVar, C143930e eVar) {
        super(context, looper, C143891ag.m233922a(context), C143876h.f389991d, 93, dVar, eVar, (String) null);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C145316do ? (C145316do) queryLocalInterface : new C145314dm(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.measurement.START";
    }
}
