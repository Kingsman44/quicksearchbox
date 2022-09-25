package com.bumptech.glide.p282c.p284b;

import com.bumptech.glide.C5997p;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.bumptech.glide.c.b.e */
/* compiled from: PG */
final class C5533e extends C5537i {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f16757a;

    /* renamed from: b */
    final /* synthetic */ CronetException f16758b;

    /* renamed from: c */
    final /* synthetic */ C5535g f16759c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5533e(C5535g gVar, C5997p pVar, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        super(pVar);
        this.f16759c = gVar;
        this.f16757a = urlResponseInfo;
        this.f16758b = cronetException;
    }

    public final void run() {
        this.f16759c.mo11912a(this.f16757a, this.f16758b, false, (ByteBuffer) null);
    }
}
