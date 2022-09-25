package androidx.mediarouter.p175a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: androidx.mediarouter.a.bz */
/* compiled from: PG */
final class C3717bz {
    /* renamed from: a */
    static void m10758a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler, int i) {
        context.registerReceiver(broadcastReceiver, intentFilter, (String) null, handler, i);
    }
}
