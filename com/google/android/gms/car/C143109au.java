package com.google.android.gms.car;

import android.util.Log;

/* renamed from: com.google.android.gms.car.au */
/* compiled from: PG */
public final class C143109au {

    /* renamed from: a */
    public static volatile boolean f388178a;

    /* renamed from: b */
    private static volatile boolean f388179b;

    /* renamed from: a */
    public static final boolean m232164a(String str, int i) {
        if (f388178a) {
            if (i >= 3) {
                return true;
            }
            i = 2;
        }
        return Log.isLoggable(str, i);
    }
}
