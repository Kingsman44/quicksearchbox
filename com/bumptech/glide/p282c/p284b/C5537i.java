package com.bumptech.glide.p282c.p284b;

import com.bumptech.glide.C5997p;

/* renamed from: com.bumptech.glide.c.b.i */
/* compiled from: PG */
abstract class C5537i implements Runnable, Comparable {

    /* renamed from: a */
    private final int f16772a;

    public C5537i(C5997p pVar) {
        this.f16772a = pVar.ordinal();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((C5537i) obj).f16772a;
        int i2 = this.f16772a;
        if (i > i2) {
            return -1;
        }
        return i < i2 ? 1 : 0;
    }
}
