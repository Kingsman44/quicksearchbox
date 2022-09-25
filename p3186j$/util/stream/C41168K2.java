package p3186j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.K2 */
abstract class C41168K2 {

    /* renamed from: a */
    protected final Spliterator f107752a;

    /* renamed from: b */
    protected final boolean f107753b;

    /* renamed from: c */
    protected final int f107754c;

    /* renamed from: d */
    private final long f107755d;

    /* renamed from: e */
    private final AtomicLong f107756e;

    C41168K2(Spliterator spliterator, long j, long j2) {
        this.f107752a = spliterator;
        this.f107753b = j2 < 0;
        this.f107755d = j2 >= 0 ? j2 : 0;
        this.f107754c = 128;
        this.f107756e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    C41168K2(Spliterator spliterator, C41168K2 k2) {
        this.f107752a = spliterator;
        this.f107753b = k2.f107753b;
        this.f107756e = k2.f107756e;
        this.f107755d = k2.f107755d;
        this.f107754c = k2.f107754c;
    }

    public final int characteristics() {
        return this.f107752a.characteristics() & -16465;
    }

    public final long estimateSize() {
        return this.f107752a.estimateSize();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo43767m(long r11) {
        /*
            r10 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicLong r0 = r10.f107756e
            long r1 = r0.get()
            boolean r3 = r10.f107753b
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0013
            if (r3 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r11 = r4
        L_0x0012:
            return r11
        L_0x0013:
            long r6 = java.lang.Math.min(r1, r11)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0023
            long r8 = r1 - r6
            boolean r0 = r0.compareAndSet(r1, r8)
            if (r0 == 0) goto L_0x0000
        L_0x0023:
            if (r3 == 0) goto L_0x002b
            long r11 = r11 - r6
            long r11 = java.lang.Math.max(r11, r4)
            return r11
        L_0x002b:
            long r11 = r10.f107755d
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            long r1 = r1 - r11
            long r6 = r6 - r1
            long r11 = java.lang.Math.max(r6, r4)
            return r11
        L_0x0038:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.stream.C41168K2.mo43767m(long):long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract Spliterator mo43737n(Spliterator spliterator);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C41164J2 mo43768o() {
        return this.f107756e.get() > 0 ? C41164J2.MAYBE_MORE : this.f107753b ? C41164J2.UNLIMITED : C41164J2.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.f107756e.get() == 0 || (trySplit = this.f107752a.trySplit()) == null) {
            return null;
        }
        return mo43737n(trySplit);
    }
}
