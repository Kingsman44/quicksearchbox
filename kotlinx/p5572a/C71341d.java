package kotlinx.p5572a;

import com.google.android.setupcompat.p3549a.C45240c;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: kotlinx.a.d */
/* compiled from: PG */
public final class C71341d {
    @Deprecated

    /* renamed from: a */
    public static final AtomicLongFieldUpdater f190528a = AtomicLongFieldUpdater.newUpdater(C71341d.class, C45240c.f118157a);

    /* renamed from: b */
    public final C71344g f190529b;

    /* renamed from: c */
    public volatile long f190530c;

    public C71341d(long j, C71344g gVar) {
        this.f190529b = gVar;
        this.f190530c = j;
    }

    /* renamed from: a */
    public final boolean mo62674a(long j, long j2) {
        boolean compareAndSet = f190528a.compareAndSet(this, j, j2);
        if (!compareAndSet || this.f190529b == C71343f.f190534a) {
            return compareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.f190530c);
    }
}
