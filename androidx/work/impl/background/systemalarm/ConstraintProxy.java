package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C4380ad;
import androidx.work.C4381ae;
import androidx.work.C4412h;
import androidx.work.impl.p207b.C4470ae;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f14291a = C4380ad.m12561i("ConstraintProxy");

    /* compiled from: PG */
    public class BatteryChargingProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    public class BatteryNotLowProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    public class NetworkStateProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    public class StorageNotLowProxy extends ConstraintProxy {
    }

    /* renamed from: a */
    static void m12865a(Context context, List list) {
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            C4412h hVar = ((C4470ae) it.next()).f14226k;
            z4 |= hVar.f14084e;
            z |= hVar.f14082c;
            z2 |= hVar.f14085f;
            z3 |= hVar.f14081b != C4381ae.NOT_REQUIRED;
            if (z4 && z && z2 && z3) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m12866a(context, z4, z, z2, z3));
    }

    public final void onReceive(Context context, Intent intent) {
        C4380ad h = C4380ad.m12560h();
        String str = f14291a;
        new StringBuilder("onReceive : ").append(intent);
        h.mo9309a(str, "onReceive : ".concat(String.valueOf(intent)));
        context.startService(C4523c.m12874b(context));
    }
}
