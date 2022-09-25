package com.bumptech.glide.p286e;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.e.c */
/* compiled from: PG */
public final class C5550c {

    /* renamed from: a */
    private final List f16799a = new ArrayList();

    /* renamed from: a */
    public final synchronized List mo11938a() {
        return this.f16799a;
    }

    /* renamed from: b */
    public final synchronized void mo11939b(ImageHeaderParser imageHeaderParser) {
        this.f16799a.add(imageHeaderParser);
    }
}
