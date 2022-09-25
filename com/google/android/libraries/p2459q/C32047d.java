package com.google.android.libraries.p2459q;

import android.content.Context;
import android.content.IntentFilter;

/* renamed from: com.google.android.libraries.q.d */
/* compiled from: PG */
public final class C32047d {

    /* renamed from: a */
    private static boolean f86106a = false;

    /* renamed from: a */
    public static void m59724a(Context context) {
        System.setProperty("org.joda.time.DateTimeZone.Provider", C32046c.class.getName());
        m59725b(context);
    }

    /* renamed from: b */
    public static synchronized void m59725b(Context context) {
        synchronized (C32047d.class) {
            if (!f86106a) {
                context.getApplicationContext().registerReceiver(new C32048e(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
                f86106a = true;
            }
        }
    }
}
