package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.C4380ad;
import androidx.work.impl.C4452ag;

/* compiled from: PG */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f14292a = C4380ad.m12561i("ConstrntProxyUpdtRecvr");

    /* renamed from: a */
    public static Intent m12866a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C4380ad.m12560h().mo9309a(f14292a, "Ignoring unknown action ".concat(String.valueOf(action)));
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        C4452ag.m12686j(context).f14151m.f14486a.execute(new C4524d(intent, context, goAsync));
    }
}
