package androidx.work.impl.p204a.p206b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C4380ad;
import androidx.work.impl.utils.p210b.C4595b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a.b.a */
/* compiled from: PG */
public final class C4426a extends C4431f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4426a(Context context, C4595b bVar) {
        super(context, bVar);
        C69664n.m101061g(context, "context");
    }

    /* renamed from: a */
    public final IntentFilter mo9376a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo9377b() {
        Intent registerReceiver = this.f14115a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C4380ad.m12560h().mo9311c(C4427b.f14108a, "getInitialState - null intent received");
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final void mo9378c(Intent intent) {
        C69664n.m101061g(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            C4380ad.m12560h().mo9309a(C4427b.f14108a, "Received ".concat(action));
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        mo9384g(false);
                        return;
                    }
                    return;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        mo9384g(false);
                        return;
                    }
                    return;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        mo9384g(true);
                        return;
                    }
                    return;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        mo9384g(true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
