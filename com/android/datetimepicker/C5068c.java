package com.android.datetimepicker;

import android.content.Context;
import android.database.ContentObserver;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;

/* renamed from: com.android.datetimepicker.c */
/* compiled from: PG */
public final class C5068c {

    /* renamed from: a */
    public final Context f16141a;

    /* renamed from: b */
    public final ContentObserver f16142b = new C5067b(this);

    /* renamed from: c */
    public Vibrator f16143c;

    /* renamed from: d */
    public boolean f16144d;

    /* renamed from: e */
    private long f16145e;

    public C5068c(Context context) {
        this.f16141a = context;
    }

    /* renamed from: b */
    public static boolean m13932b(Context context) {
        if (Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10050a() {
        if (this.f16143c != null && this.f16144d) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f16145e >= 125) {
                this.f16143c.vibrate(5);
                this.f16145e = uptimeMillis;
            }
        }
    }
}
