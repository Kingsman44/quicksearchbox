package kotlinx.p5572a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.a.e */
/* compiled from: PG */
public final class C71342e {
    @Deprecated

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f190531b = AtomicReferenceFieldUpdater.newUpdater(C71342e.class, Object.class, "a");

    /* renamed from: a */
    public volatile Object f190532a;

    /* renamed from: c */
    private final C71344g f190533c;

    public C71342e(Object obj, C71344g gVar) {
        this.f190533c = gVar;
        this.f190532a = obj;
    }

    /* renamed from: a */
    public final Object mo62676a(Object obj) {
        Object andSet = f190531b.getAndSet(this, obj);
        if (this.f190533c != C71343f.f190534a) {
            StringBuilder sb = new StringBuilder("getAndSet(");
            sb.append(obj);
            sb.append("):");
            sb.append(andSet);
        }
        return andSet;
    }

    /* renamed from: b */
    public final void mo62677b(Object obj) {
        f190531b.lazySet(this, obj);
        if (this.f190533c != C71343f.f190534a) {
            new StringBuilder("lazySet(").append(obj);
        }
    }

    /* renamed from: c */
    public final void mo62678c(Object obj) {
        this.f190532a = obj;
        if (this.f190533c != C71343f.f190534a) {
            new StringBuilder("set(").append(obj);
        }
    }

    /* renamed from: d */
    public final boolean mo62679d(Object obj, Object obj2) {
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f190531b;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z || this.f190533c == C71343f.f190534a) {
            return z;
        }
        StringBuilder sb = new StringBuilder("CAS(");
        sb.append(obj);
        sb.append(", ");
        sb.append(obj2);
        return true;
    }

    public final String toString() {
        return String.valueOf(this.f190532a);
    }
}
