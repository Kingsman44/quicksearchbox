package com.google.android.apps.auto.sdk;

import android.content.Context;
import com.google.android.gms.car.C143133bq;

/* renamed from: com.google.android.apps.auto.sdk.ac */
/* compiled from: PG */
public final class C8967ac {

    /* renamed from: a */
    public final Context f31062a;

    /* renamed from: b */
    public final Context f31063b;

    public C8967ac(Context context) {
        this.f31062a = context;
        this.f31063b = C143133bq.m232184a(context);
    }

    /* renamed from: a */
    public static int m23524a(Context context) {
        return ((Integer) context.getClassLoader().loadClass("com.google.android.apps.auto.sdk.SdkVersion").getDeclaredMethod("getVersion", new Class[0]).invoke((Object) null, new Object[0])).intValue();
    }
}
