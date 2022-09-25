package com.bumptech.glide.load.p299c.p300a;

import androidx.p114h.p115a.C2275g;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.p291h.C5616c;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.c.a.ac */
/* compiled from: PG */
public final class C5824ac implements ImageHeaderParser {
    /* renamed from: a */
    public final int mo12094a(InputStream inputStream, C5640b bVar) {
        int d = new C2275g(inputStream).mo5670d();
        if (d == 0) {
            return -1;
        }
        return d;
    }

    /* renamed from: b */
    public final int mo12095b(ByteBuffer byteBuffer, C5640b bVar) {
        return mo12094a(C5616c.m14580a(byteBuffer), bVar);
    }

    /* renamed from: c */
    public final ImageHeaderParser.ImageType mo12096c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: d */
    public final ImageHeaderParser.ImageType mo12097d(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
