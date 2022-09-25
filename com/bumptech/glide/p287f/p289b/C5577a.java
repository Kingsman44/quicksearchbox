package com.bumptech.glide.p287f.p289b;

import com.bumptech.glide.load.C5637a;

/* renamed from: com.bumptech.glide.f.b.a */
/* compiled from: PG */
public final class C5577a implements C5583g {

    /* renamed from: a */
    private final int f16869a;

    /* renamed from: b */
    private final boolean f16870b;

    /* renamed from: c */
    private C5578b f16871c;

    public C5577a(int i, boolean z) {
        this.f16869a = i;
        this.f16870b = z;
    }

    /* renamed from: a */
    public final C5582f mo12027a(C5637a aVar, boolean z) {
        if (aVar == C5637a.MEMORY_CACHE) {
            return C5580d.f16874a;
        }
        if (this.f16871c == null) {
            this.f16871c = new C5578b(this.f16869a, this.f16870b);
        }
        return this.f16871c;
    }
}
