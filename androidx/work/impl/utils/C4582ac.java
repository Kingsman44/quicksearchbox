package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C4380ad;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.utils.ac */
/* compiled from: PG */
public final class C4582ac {

    /* renamed from: a */
    private static final String f14453a = C4380ad.m12561i("WakeLocks");

    /* renamed from: a */
    public static final PowerManager.WakeLock m12985a(Context context, String str) {
        C69664n.m101061g(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("power");
        C69664n.m101059e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (C4583ad.f14454a) {
            String str2 = (String) C4583ad.f14455b.put(newWakeLock, concat);
        }
        C69664n.m101060f(newWakeLock, "wakeLock");
        return newWakeLock;
    }

    /* renamed from: b */
    public static final void m12986b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (C4583ad.f14454a) {
            linkedHashMap.putAll(C4583ad.f14455b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                C4380ad.m12560h().mo9314f(f14453a, "WakeLock held for ".concat(String.valueOf(str)));
            }
        }
    }
}
