package com.bumptech.glide.p282c.p284b;

import com.bumptech.glide.C5997p;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.bumptech.glide.c.b.d */
/* compiled from: PG */
final class C5532d extends C5537i {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f16755a;

    /* renamed from: b */
    final /* synthetic */ C5535g f16756b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5532d(C5535g gVar, C5997p pVar, UrlResponseInfo urlResponseInfo) {
        super(pVar);
        this.f16756b = gVar;
        this.f16755a = urlResponseInfo;
    }

    public final void run() {
        ByteBuffer byteBuffer;
        C5535g gVar = this.f16756b;
        UrlResponseInfo urlResponseInfo = this.f16755a;
        C5529a aVar = gVar.f16768g;
        aVar.f16754b = new RuntimeException();
        ArrayDeque<ByteBuffer> arrayDeque = aVar.f16753a;
        aVar.f16753a = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (ByteBuffer flip : arrayDeque) {
            flip.flip();
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            if (arrayDeque.size() == 0) {
                byteBuffer = ByteBuffer.allocateDirect(0);
            } else if (arrayDeque.size() == 1) {
                byteBuffer = (ByteBuffer) arrayDeque.remove();
            } else {
                int i = 0;
                for (ByteBuffer remaining : arrayDeque) {
                    i += remaining.remaining();
                }
                byteBuffer = ByteBuffer.allocateDirect(i);
                while (!arrayDeque.isEmpty()) {
                    byteBuffer.put((ByteBuffer) arrayDeque.remove());
                }
                byteBuffer.flip();
            }
            gVar.mo11912a(urlResponseInfo, (CronetException) null, false, byteBuffer);
            return;
        }
        throw new IllegalStateException("This BufferQueue has already been consumed");
    }
}
