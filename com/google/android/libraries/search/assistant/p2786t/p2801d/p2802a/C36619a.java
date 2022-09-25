package com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.provider.Settings;

/* renamed from: com.google.android.libraries.search.assistant.t.d.a.a */
/* compiled from: PG */
public final class C36619a {
    /* renamed from: a */
    public static ComponentName m65145a(Context context) {
        return new ComponentName(context, "com.google.android.apps.gsa.notificationlistener.GsaNotificationListenerService");
    }

    /* renamed from: b */
    public static Intent m65146b(Context context) {
        ResolveInfo resolveActivity;
        Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (resolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return null;
        }
        ActivityInfo activityInfo = resolveActivity.activityInfo;
        activityInfo.getClass();
        intent.setPackage(activityInfo.packageName);
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        Bundle bundle = new Bundle();
        bundle.putString(":settings:fragment_args_key", m65145a(context).flattenToString());
        intent.putExtra(":settings:show_fragment_args", bundle);
        intent.setFlags(268435456);
        return intent;
    }

    /* renamed from: c */
    public static boolean m65147c(Context context) {
        boolean z = context.getPackageManager().getComponentEnabledSetting(m65145a(context)) != 1;
        if (z) {
            context.getPackageManager().setComponentEnabledSetting(m65145a(context), 1, 1);
        }
        return z;
    }

    @Deprecated
    /* renamed from: d */
    public static boolean m65148d(Context context) {
        String[] split;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (string == null || (split = string.split(":")) == null) {
            return false;
        }
        ComponentName a = m65145a(context);
        for (String unflattenFromString : split) {
            if (a.equals(ComponentName.unflattenFromString(unflattenFromString))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m65149e(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        return notificationManager.isNotificationListenerAccessGranted(m65145a(context));
    }
}
