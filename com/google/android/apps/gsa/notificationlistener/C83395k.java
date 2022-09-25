package com.google.android.apps.gsa.notificationlistener;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: com.google.android.apps.gsa.notificationlistener.k */
/* compiled from: PG */
public final class C83395k {
    /* renamed from: a */
    public static ComponentName m132730a(String str) {
        if ("com.google.android.carassistant".equals(str)) {
            return new ComponentName(str, GsaNotificationListenerService.class.getName());
        }
        return new ComponentName("com.google.android.googlequicksearchbox", GsaNotificationListenerService.class.getName());
    }

    /* renamed from: b */
    public static Intent m132731b(Context context) {
        Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || packageManager.resolveActivity(intent, 65536) == null) {
            return null;
        }
        intent.setFlags(268435456);
        return intent;
    }

    /* renamed from: c */
    public static Intent m132732c(Context context) {
        Intent b = m132731b(context);
        if (b == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(":settings:fragment_args_key", "com.google.android.googlequicksearchbox/com.google.android.apps.gsa.notificationlistener.GsaNotificationListenerService");
        b.putExtra(":settings:show_fragment_args", bundle);
        return b;
    }

    /* renamed from: d */
    public static void m132733d(Context context) {
        context.getPackageManager().setComponentEnabledSetting(m132730a(context.getPackageName()), 1, 1);
    }

    /* renamed from: e */
    public static void m132734e(Context context, String str) {
        context.getPackageManager().setComponentEnabledSetting(m132730a(str), 1, 1);
    }

    /* renamed from: f */
    public static Runnable m132735f(Context context, Handler handler, Runnable runnable) {
        C83394j jVar = new C83394j(context, runnable, handler);
        handler.post(jVar);
        return jVar;
    }
}
