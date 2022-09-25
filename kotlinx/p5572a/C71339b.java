package kotlinx.p5572a;

import com.google.android.setupcompat.p3549a.C45240c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kotlinx.a.b */
/* compiled from: PG */
public final class C71339b {
    @Deprecated

    /* renamed from: a */
    public static final AtomicIntegerFieldUpdater f190522a = AtomicIntegerFieldUpdater.newUpdater(C71339b.class, C45240c.f118157a);

    /* renamed from: b */
    public final C71344g f190523b;

    /* renamed from: c */
    public volatile int f190524c;

    public C71339b(boolean z, C71344g gVar) {
        this.f190523b = gVar;
        this.f190524c = z ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean mo62669a() {
        return this.f190524c != 0;
    }

    /* renamed from: b */
    public final boolean mo62670b() {
        boolean compareAndSet = f190522a.compareAndSet(this, 0, 1);
        if (!compareAndSet || this.f190523b == C71343f.f190534a) {
            return compareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(mo62669a());
    }
}
