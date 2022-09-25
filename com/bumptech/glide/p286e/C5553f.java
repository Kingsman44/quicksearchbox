package com.bumptech.glide.p286e;

import com.bumptech.glide.load.C5962u;

/* renamed from: com.bumptech.glide.e.f */
/* compiled from: PG */
final class C5553f {

    /* renamed from: a */
    final Class f16805a;

    /* renamed from: b */
    final C5962u f16806b;

    /* renamed from: c */
    private final Class f16807c;

    public C5553f(Class cls, Class cls2, C5962u uVar) {
        this.f16807c = cls;
        this.f16805a = cls2;
        this.f16806b = uVar;
    }

    /* renamed from: a */
    public final boolean mo11940a(Class cls, Class cls2) {
        return this.f16807c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f16805a);
    }
}
