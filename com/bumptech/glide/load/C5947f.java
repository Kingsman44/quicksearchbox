package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.p291h.C5616c;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.f */
/* compiled from: PG */
final class C5947f implements C5953l {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f17604a;

    public C5947f(ByteBuffer byteBuffer) {
        this.f17604a = byteBuffer;
    }

    /* renamed from: a */
    public final ImageHeaderParser.ImageType mo12396a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.mo12097d(this.f17604a);
        } finally {
            C5616c.m14583d(this.f17604a);
        }
    }
}
