package com.google.common.p4520a;

import sun.misc.Unsafe;

/* renamed from: com.google.common.a.by */
/* compiled from: PG */
final class C58245by {
    private static final Unsafe UNSAFE;
    private static final long valueOffset;

    /* renamed from: p0 */
    volatile long f155757p0;

    /* renamed from: p1 */
    volatile long f155758p1;

    /* renamed from: p2 */
    volatile long f155759p2;

    /* renamed from: p3 */
    volatile long f155760p3;

    /* renamed from: p4 */
    volatile long f155761p4;

    /* renamed from: p5 */
    volatile long f155762p5;

    /* renamed from: p6 */
    volatile long f155763p6;

    /* renamed from: q0 */
    volatile long f155764q0;

    /* renamed from: q1 */
    volatile long f155765q1;

    /* renamed from: q2 */
    volatile long f155766q2;

    /* renamed from: q3 */
    volatile long f155767q3;

    /* renamed from: q4 */
    volatile long f155768q4;

    /* renamed from: q5 */
    volatile long f155769q5;

    /* renamed from: q6 */
    volatile long f155770q6;
    volatile long value;

    static {
        try {
            Unsafe d = C58246bz.m89178d();
            UNSAFE = d;
            valueOffset = d.objectFieldOffset(C58245by.class.getDeclaredField("value"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public C58245by(long j) {
        this.value = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo54813a(long j, long j2) {
        return UNSAFE.compareAndSwapLong(this, valueOffset, j, j2);
    }
}
