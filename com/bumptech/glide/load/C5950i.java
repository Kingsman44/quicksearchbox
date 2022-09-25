package com.bumptech.glide.load;

import com.bumptech.glide.load.p293a.p294a.C5640b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.i */
/* compiled from: PG */
final class C5950i implements C5952k {

    /* renamed from: a */
    final /* synthetic */ InputStream f17609a;

    /* renamed from: b */
    final /* synthetic */ C5640b f17610b;

    public C5950i(InputStream inputStream, C5640b bVar) {
        this.f17609a = inputStream;
        this.f17610b = bVar;
    }

    /* renamed from: a */
    public final int mo12397a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.mo12094a(this.f17609a, this.f17610b);
        } finally {
            this.f17609a.reset();
        }
    }
}
