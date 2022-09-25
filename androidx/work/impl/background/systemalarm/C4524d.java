package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C4380ad;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.C4609p;

/* renamed from: androidx.work.impl.background.systemalarm.d */
/* compiled from: PG */
final class C4524d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f14303a;

    /* renamed from: b */
    final /* synthetic */ Context f14304b;

    /* renamed from: c */
    final /* synthetic */ BroadcastReceiver.PendingResult f14305c;

    public C4524d(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.f14303a = intent;
        this.f14304b = context;
        this.f14305c = pendingResult;
    }

    public final void run() {
        try {
            boolean booleanExtra = this.f14303a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = this.f14303a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = this.f14303a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = this.f14303a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            C4380ad.m12560h().mo9309a(ConstraintProxyUpdateReceiver.f14292a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
            C4609p.m13004a(this.f14304b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
            C4609p.m13004a(this.f14304b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
            C4609p.m13004a(this.f14304b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
            C4609p.m13004a(this.f14304b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
        } finally {
            this.f14305c.finish();
        }
    }
}
