package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p299c.p300a.C5835an;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.m */
/* compiled from: PG */
public final class C5954m {
    /* renamed from: a */
    public static int m15364a(List list, InputStream inputStream, C5640b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C5835an(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m15365b(list, new C5950i(inputStream, bVar));
    }

    /* renamed from: b */
    public static int m15365b(List list, C5952k kVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = kVar.mo12397a((ImageHeaderParser) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static ImageHeaderParser.ImageType m15366c(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m15368e(list, new C5947f(byteBuffer));
    }

    /* renamed from: d */
    public static ImageHeaderParser.ImageType m15367d(List list, InputStream inputStream, C5640b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C5835an(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m15368e(list, new C5946e(inputStream));
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m15368e(List list, C5953l lVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = lVar.mo12396a((ImageHeaderParser) list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
