package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.e */
/* compiled from: PG */
final class C5946e implements C5953l {

    /* renamed from: a */
    final /* synthetic */ InputStream f17603a;

    public C5946e(InputStream inputStream) {
        this.f17603a = inputStream;
    }

    /* renamed from: a */
    public final ImageHeaderParser.ImageType mo12396a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.mo12096c(this.f17603a);
        } finally {
            this.f17603a.reset();
        }
    }
}
