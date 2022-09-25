package com.google.common.p4522b;

/* renamed from: com.google.common.b.fy */
/* compiled from: PG */
public final class C58462fy {
    /* renamed from: a */
    static int m89757a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: b */
    public static int m89758b(Object obj) {
        return m89757a(obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: c */
    static int m89759c(int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) ((double) highestOneBit))) {
            return highestOneBit;
        }
        int i2 = highestOneBit + highestOneBit;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }
}
