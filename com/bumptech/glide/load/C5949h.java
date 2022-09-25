package com.bumptech.glide.load;

import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.p291h.C5616c;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.h */
/* compiled from: PG */
public final class C5949h implements C5952k {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f17607a;

    /* renamed from: b */
    final /* synthetic */ C5640b f17608b;

    public C5949h(ByteBuffer byteBuffer, C5640b bVar) {
        this.f17607a = byteBuffer;
        this.f17608b = bVar;
    }

    /* renamed from: a */
    public final int mo12397a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.mo12095b(this.f17607a, this.f17608b);
        } finally {
            C5616c.m14583d(this.f17607a);
        }
    }
}
