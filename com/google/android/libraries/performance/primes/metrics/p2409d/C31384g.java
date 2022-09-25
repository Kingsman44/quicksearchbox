package com.google.android.libraries.performance.primes.metrics.p2409d;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.g */
/* compiled from: PG */
public final class C31384g {

    /* renamed from: a */
    public static volatile long f84496a;

    /* renamed from: b */
    private static volatile float f84497b;

    private C31384g() {
    }

    /* renamed from: a */
    public static C58833ax m58504a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C58836b.f156633a;
        }
        float f = f84497b;
        if (f == 0.0f) {
            synchronized (C31384g.class) {
                f = f84497b;
                if (f == 0.0f) {
                    float refreshRate = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    f84497b = refreshRate;
                    f = refreshRate;
                }
            }
        }
        return C58833ax.m90834k(Float.valueOf(f));
    }
}
