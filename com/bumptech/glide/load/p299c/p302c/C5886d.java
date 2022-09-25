package com.bumptech.glide.load.p299c.p302c;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p299c.C5878b;
import java.io.IOException;
import java.util.List;

/* renamed from: com.bumptech.glide.load.c.c.d */
/* compiled from: PG */
public final class C5886d {

    /* renamed from: a */
    public final List f17501a;

    /* renamed from: b */
    public final C5640b f17502b;

    public C5886d(List list, C5640b bVar) {
        this.f17501a = list;
        this.f17502b = bVar;
    }

    /* renamed from: a */
    static final C5679av m15217a(ImageDecoder.Source source, int i, int i2, C5960s sVar) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new C5878b(i, i2, sVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C5883a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: ".concat(String.valueOf(String.valueOf(decodeDrawable))));
    }

    /* renamed from: b */
    public static final boolean m15218b(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }
}
