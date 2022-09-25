package com.google.android.libraries.glide.p1822a;

import com.bumptech.glide.load.C5954m;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.p291h.C5616c;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.libraries.glide.a.a */
/* compiled from: PG */
public final class C22000a implements C5962u {

    /* renamed from: a */
    private final List f60707a;

    /* renamed from: b */
    private final C22002c f60708b;

    public C22000a(List list, C5642d dVar, C5640b bVar) {
        this.f60707a = list;
        this.f60708b = new C22002c(list, dVar, bVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        return this.f60708b.mo27310c(C5616c.m14580a((ByteBuffer) obj));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        return C5954m.m15366c(this.f60707a, (ByteBuffer) obj) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }
}
