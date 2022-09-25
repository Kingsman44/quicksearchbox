package p5488io.grpc.p5525e;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.grpc.e.jx */
/* compiled from: PG */
final class C70624jx {

    /* renamed from: a */
    final int f188239a;

    /* renamed from: b */
    final int f188240b;

    /* renamed from: c */
    final int f188241c;

    /* renamed from: d */
    final AtomicInteger f188242d;

    public C70624jx(float f, float f2) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f188242d = atomicInteger;
        this.f188241c = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.f188239a = i;
        this.f188240b = i / 2;
        atomicInteger.set(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo62362a() {
        return this.f188242d.get() > this.f188240b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo62363b() {
        int i;
        int i2;
        do {
            i = this.f188242d.get();
            if (i == 0) {
                return false;
            }
            i2 = i - 1000;
        } while (!this.f188242d.compareAndSet(i, Math.max(i2, 0)));
        if (i2 > this.f188240b) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70624jx)) {
            return false;
        }
        C70624jx jxVar = (C70624jx) obj;
        return this.f188239a == jxVar.f188239a && this.f188241c == jxVar.f188241c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f188239a), Integer.valueOf(this.f188241c)});
    }
}
