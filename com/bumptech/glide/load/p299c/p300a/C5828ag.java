package com.bumptech.glide.load.p299c.p300a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.bumptech.glide.load.C5954m;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C5941p;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.c.a.ag */
/* compiled from: PG */
public final class C5828ag implements C5830ai {

    /* renamed from: a */
    private final C5941p f17416a;

    /* renamed from: b */
    private final C5640b f17417b;

    /* renamed from: c */
    private final List f17418c;

    public C5828ag(InputStream inputStream, List list, C5640b bVar) {
        this.f17417b = bVar;
        this.f17418c = list;
        this.f17416a = new C5941p(inputStream, bVar);
    }

    /* renamed from: a */
    public final int mo12298a() {
        return C5954m.m15364a(this.f17418c, this.f17416a.mo12338a(), this.f17417b);
    }

    /* renamed from: b */
    public final Bitmap mo12299b(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(this.f17416a.mo12338a(), (Rect) null, options);
    }

    /* renamed from: c */
    public final ImageHeaderParser.ImageType mo12300c() {
        return C5954m.m15367d(this.f17418c, this.f17416a.mo12338a(), this.f17417b);
    }

    /* renamed from: d */
    public final void mo12301d() {
        this.f17416a.f17598a.mo12302a();
    }
}
