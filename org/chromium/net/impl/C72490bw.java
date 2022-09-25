package org.chromium.net.impl;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.impl.bw */
/* compiled from: PG */
final class C72490bw implements C72500cf {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f192868a;

    /* renamed from: b */
    final /* synthetic */ ByteBuffer f192869b;

    /* renamed from: c */
    final /* synthetic */ C72495ca f192870c;

    public C72490bw(C72495ca caVar, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f192870c = caVar;
        this.f192868a = urlResponseInfo;
        this.f192869b = byteBuffer;
    }

    /* renamed from: a */
    public final void mo64214a() {
        if (this.f192870c.f192881d.f192898g.compareAndSet(5, 4)) {
            C72495ca caVar = this.f192870c;
            C72522da daVar = caVar.f192878a;
            daVar.f192969a.onReadCompleted(caVar.f192881d, this.f192868a, this.f192869b);
        }
    }
}
