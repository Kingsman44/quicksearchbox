package androidx.work;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.work.n */
/* compiled from: PG */
public final class C4633n extends C4405bb {

    /* renamed from: b */
    private static final String f14552b = C4380ad.m12561i("DelegatingWkrFctry");

    /* renamed from: a */
    public final List f14553a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final C4378ab mo9346a(Context context, String str, WorkerParameters workerParameters) {
        for (C4405bb a : this.f14553a) {
            try {
                C4378ab a2 = a.mo9346a(context, str, workerParameters);
                if (a2 != null) {
                    return a2;
                }
            } catch (Throwable th) {
                C4380ad.m12560h().mo9312d(f14552b, "Unable to instantiate a ListenableWorker (" + str + ")", th);
                throw th;
            }
        }
        return null;
    }
}
