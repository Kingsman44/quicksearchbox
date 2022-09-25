package androidx.work;

import android.content.Context;

/* renamed from: androidx.work.bb */
/* compiled from: PG */
public abstract class C4405bb {

    /* renamed from: a */
    private static final String f14052a = C4380ad.m12561i("WorkerFactory");

    /* renamed from: c */
    public static C4405bb m12594c() {
        return new C4404ba();
    }

    /* renamed from: a */
    public abstract C4378ab mo9346a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final C4378ab mo9347b(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        C4378ab a = mo9346a(context, str, workerParameters);
        if (a == null) {
            try {
                cls = Class.forName(str).asSubclass(C4378ab.class);
            } catch (Throwable th) {
                C4380ad.m12560h().mo9312d(f14052a, "Invalid class: ".concat(String.valueOf(str)), th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a = (C4378ab) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    C4380ad.m12560h().mo9312d(f14052a, "Could not instantiate ".concat(String.valueOf(str)), th2);
                }
            }
        }
        if (a == null || !a.f14002f) {
            return a;
        }
        String name = getClass().getName();
        throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
