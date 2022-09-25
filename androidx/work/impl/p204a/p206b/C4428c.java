package androidx.work.impl.p204a.p206b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C4380ad;
import androidx.work.impl.utils.p210b.C4595b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a.b.c */
/* compiled from: PG */
public final class C4428c extends C4431f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4428c(Context context, C4595b bVar) {
        super(context, bVar);
        C69664n.m101061g(context, "context");
    }

    /* renamed from: a */
    public final IntentFilter mo9376a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo9377b() {
        Intent registerReceiver = this.f14115a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C4380ad.m12560h().mo9311c(C4429d.f14109a, "getInitialState - null intent received");
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final void mo9378c(Intent intent) {
        C69664n.m101061g(intent, "intent");
        if (intent.getAction() != null) {
            C4380ad.m12560h().mo9309a(C4429d.f14109a, "Received ".concat(String.valueOf(intent.getAction())));
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1980154005) {
                    if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                        mo9384g(false);
                    }
                } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    mo9384g(true);
                }
            }
        }
    }
}
