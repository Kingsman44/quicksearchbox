package p5488io.p5490b.p5497e.p5510g;

import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: io.b.e.g.aa */
/* compiled from: PG */
final class C70040aa implements Runnable {
    public final void run() {
        ArrayList arrayList = new ArrayList(C70041ab.f186705d.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) arrayList.get(i);
            if (scheduledThreadPoolExecutor.isShutdown()) {
                C70041ab.f186705d.remove(scheduledThreadPoolExecutor);
            } else {
                scheduledThreadPoolExecutor.purge();
            }
        }
    }
}
