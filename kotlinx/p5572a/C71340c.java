package kotlinx.p5572a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kotlinx.a.c */
/* compiled from: PG */
public final class C71340c {
    @Deprecated

    /* renamed from: a */
    public static final AtomicIntegerFieldUpdater f190525a = AtomicIntegerFieldUpdater.newUpdater(C71340c.class, "b");

    /* renamed from: b */
    public volatile int f190526b;

    /* renamed from: c */
    private final C71344g f190527c;

    public C71340c(int i, C71344g gVar) {
        this.f190527c = gVar;
        this.f190526b = i;
    }

    /* renamed from: a */
    public final boolean mo62672a(int i, int i2) {
        boolean compareAndSet = f190525a.compareAndSet(this, i, i2);
        if (!compareAndSet || this.f190527c == C71343f.f190534a) {
            return compareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.f190526b);
    }
}
