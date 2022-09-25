package com.bumptech.glide.load.p299c.p300a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.bumptech.glide.load.C5949h;
import com.bumptech.glide.load.C5954m;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.p291h.C5616c;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.c.a.af */
/* compiled from: PG */
public final class C5827af implements C5830ai {

    /* renamed from: a */
    private final ByteBuffer f17413a;

    /* renamed from: b */
    private final List f17414b;

    /* renamed from: c */
    private final C5640b f17415c;

    public C5827af(ByteBuffer byteBuffer, List list, C5640b bVar) {
        this.f17413a = byteBuffer;
        this.f17414b = list;
        this.f17415c = bVar;
    }

    /* renamed from: a */
    public final int mo12298a() {
        List list = this.f17414b;
        ByteBuffer d = C5616c.m14583d(this.f17413a);
        C5640b bVar = this.f17415c;
        if (d == null) {
            return -1;
        }
        return C5954m.m15365b(list, new C5949h(d, bVar));
    }

    /* renamed from: b */
    public final Bitmap mo12299b(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(C5616c.m14580a(C5616c.m14583d(this.f17413a)), (Rect) null, options);
    }

    /* renamed from: c */
    public final ImageHeaderParser.ImageType mo12300c() {
        return C5954m.m15366c(this.f17414b, C5616c.m14583d(this.f17413a));
    }

    /* renamed from: d */
    public final void mo12301d() {
    }
}
