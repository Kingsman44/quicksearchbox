package com.bumptech.glide.load.p299c.p300a;

/* renamed from: com.bumptech.glide.load.c.a.t */
/* compiled from: PG */
final class C5871t extends C5873v {
    /* renamed from: a */
    public final float mo12332a(int i, int i2, int i3, int i4) {
        if (f17476g) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
        int max = Math.max(i2 / i4, i / i3);
        if (max == 0) {
            return 1.0f;
        }
        return 1.0f / ((float) Integer.highestOneBit(max));
    }

    /* renamed from: b */
    public final int mo12333b(int i, int i2, int i3, int i4) {
        return f17476g ? 2 : 1;
    }
}
