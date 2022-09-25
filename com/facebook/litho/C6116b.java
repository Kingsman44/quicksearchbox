package com.facebook.litho;

import android.content.Context;
import android.provider.Settings;
import com.facebook.litho.p325d.C6180a;

/* renamed from: com.facebook.litho.b */
/* compiled from: PG */
public final class C6116b {
    static {
        boolean z = C6180a.f18234a;
    }

    /* renamed from: a */
    static boolean m15917a(Context context) {
        if (C6180a.f18236c) {
            return false;
        }
        if (!C6180a.f18235b) {
            return true;
        }
        return (context == null || Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) ? false : true;
    }
}
