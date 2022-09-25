package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: androidx.core.content.f */
/* compiled from: PG */
public final class C1880f {
    /* renamed from: a */
    public static ComponentName m5134a(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }

    /* renamed from: b */
    static Intent m5135b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if ((i & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }
        String concat = String.valueOf(context.getPackageName()).concat(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        if (C1885k.m5142a(context, concat) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, concat, handler);
        }
        throw new RuntimeException("Permission " + concat + " is required by your application to receive broadcasts, please add it to your manifest");
    }
}
