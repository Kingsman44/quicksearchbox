package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: androidx.mediarouter.app.a */
/* compiled from: PG */
final class C3754a {
    /* renamed from: a */
    static void m10896a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        context.registerReceiver(broadcastReceiver, intentFilter, i);
    }
}
