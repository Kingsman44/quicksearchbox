package com.google.android.p10710c.p10711a;

import android.content.Context;
import android.provider.Settings;

/* renamed from: com.google.android.c.a.b */
/* compiled from: PG */
public final class C142293b {

    /* renamed from: a */
    private final Context f386035a;

    public C142293b(Context context) {
        new C142292a(this);
        context.getClass();
        this.f386035a = context;
    }

    /* renamed from: a */
    public final int mo117124a() {
        int i = Settings.Global.getInt(this.f386035a.getContentResolver(), "car_data_subscription_status", 3);
        if (i <= 0 || i > 3) {
            return 3;
        }
        return i;
    }
}
