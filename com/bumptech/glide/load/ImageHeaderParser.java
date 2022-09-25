package com.bumptech.glide.load;

import com.bumptech.glide.load.p293a.p294a.C5640b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
public interface ImageHeaderParser {

    /* compiled from: PG */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        UNKNOWN(false);
        

        /* renamed from: a */
        private final boolean f17003a;

        private ImageType(boolean z) {
            this.f17003a = z;
        }

        public boolean hasAlpha() {
            return this.f17003a;
        }

        public boolean isWebp() {
            int ordinal = ordinal();
            return ordinal == 5 || ordinal == 6 || ordinal == 7;
        }
    }

    /* renamed from: a */
    int mo12094a(InputStream inputStream, C5640b bVar);

    /* renamed from: b */
    int mo12095b(ByteBuffer byteBuffer, C5640b bVar);

    /* renamed from: c */
    ImageType mo12096c(InputStream inputStream);

    /* renamed from: d */
    ImageType mo12097d(ByteBuffer byteBuffer);
}
