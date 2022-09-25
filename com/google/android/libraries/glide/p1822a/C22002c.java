package com.google.android.libraries.glide.p1822a;

import android.support.rastermill.FrameSequence;
import com.bumptech.glide.load.C5954m;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.google.android.libraries.glide.a.c */
/* compiled from: PG */
public final class C22002c implements C5962u {

    /* renamed from: a */
    private final List f60709a;

    /* renamed from: b */
    private final C5642d f60710b;

    /* renamed from: c */
    private final C5640b f60711c;

    public C22002c(List list, C5642d dVar, C5640b bVar) {
        this.f60709a = list;
        this.f60710b = dVar;
        this.f60711c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        return mo27310c((InputStream) obj);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        return C5954m.m15367d(this.f60709a, (InputStream) obj, this.f60711c) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    /* renamed from: c */
    public final C5679av mo27310c(InputStream inputStream) {
        return new C22003d(FrameSequence.decodeStream(inputStream), this.f60710b);
    }
}
