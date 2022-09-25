package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.dw */
/* compiled from: PG */
public final class C71687dw {

    /* renamed from: a */
    public static final ThreadLocal f191139a = new ThreadLocal();

    /* renamed from: a */
    public static final C71619bt m104785a() {
        ThreadLocal threadLocal = f191139a;
        C71619bt btVar = (C71619bt) threadLocal.get();
        if (btVar != null) {
            return btVar;
        }
        C71801k kVar = new C71801k(Thread.currentThread());
        threadLocal.set(kVar);
        return kVar;
    }
}
