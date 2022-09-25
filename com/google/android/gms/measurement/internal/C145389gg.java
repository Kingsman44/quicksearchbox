package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.measurement.api.internal.InitializationParams;

/* renamed from: com.google.android.gms.measurement.internal.gg */
/* compiled from: PG */
public final class C145389gg {

    /* renamed from: a */
    final Context f393055a;

    /* renamed from: b */
    String f393056b;

    /* renamed from: c */
    String f393057c;

    /* renamed from: d */
    String f393058d;

    /* renamed from: e */
    Boolean f393059e;

    /* renamed from: f */
    long f393060f;

    /* renamed from: g */
    InitializationParams f393061g;

    /* renamed from: h */
    boolean f393062h = true;

    /* renamed from: i */
    final Long f393063i;

    /* renamed from: j */
    String f393064j;

    public C145389gg(Context context, InitializationParams initializationParams, Long l) {
        C143919bh.m233958a(context);
        Context applicationContext = context.getApplicationContext();
        C143919bh.m233958a(applicationContext);
        this.f393055a = applicationContext;
        this.f393063i = l;
        if (initializationParams != null) {
            this.f393061g = initializationParams;
            this.f393056b = initializationParams.f392416f;
            this.f393057c = initializationParams.f392415e;
            this.f393058d = initializationParams.f392414d;
            this.f393062h = initializationParams.f392413c;
            this.f393060f = initializationParams.f392412b;
            this.f393064j = initializationParams.f392418h;
            Bundle bundle = initializationParams.f392417g;
            if (bundle != null) {
                this.f393059e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
