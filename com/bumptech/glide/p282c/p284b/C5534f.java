package com.bumptech.glide.p282c.p284b;

import com.bumptech.glide.C5997p;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.bumptech.glide.c.b.f */
/* compiled from: PG */
final class C5534f extends C5537i {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f16760a;

    /* renamed from: b */
    final /* synthetic */ C5535g f16761b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5534f(C5535g gVar, C5997p pVar, UrlResponseInfo urlResponseInfo) {
        super(pVar);
        this.f16761b = gVar;
        this.f16760a = urlResponseInfo;
    }

    public final void run() {
        this.f16761b.mo11912a(this.f16760a, (CronetException) null, true, (ByteBuffer) null);
    }
}
