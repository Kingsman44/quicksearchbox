package com.google.frameworks.client.data.android;

import com.google.common.p4522b.C58485gu;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.google.frameworks.client.data.android.w */
/* compiled from: PG */
final class C61622w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f166494a;

    /* renamed from: b */
    final /* synthetic */ C61625z f166495b;

    public C61622w(C61625z zVar, UrlResponseInfo urlResponseInfo) {
        this.f166495b = zVar;
        this.f166494a = urlResponseInfo;
    }

    public final void run() {
        ByteBuffer byteBuffer;
        C61620u uVar = this.f166495b.f166500b;
        int i = 0;
        if (uVar.f166492a.isEmpty()) {
            byteBuffer = ByteBuffer.allocateDirect(0);
        } else if (uVar.f166492a.size() == 1) {
            byteBuffer = (ByteBuffer) uVar.f166492a.get(0);
            if (byteBuffer.hasRemaining()) {
                byteBuffer.flip();
            }
            byteBuffer.position(0);
        } else {
            for (ByteBuffer byteBuffer2 : uVar.f166492a) {
                byteBuffer2.flip();
                i += byteBuffer2.remaining();
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            for (ByteBuffer put : uVar.f166492a) {
                allocateDirect.put(put);
            }
            allocateDirect.flip();
            byteBuffer = allocateDirect;
        }
        AtomicInteger atomicInteger = C61359aa.f165925a;
        this.f166495b.mo58153a(this.f166494a);
        byteBuffer.remaining();
        this.f166495b.f166499a.mo57356n(new C61366ah(C61625z.m94411b(this.f166494a.getAllHeaders()), byteBuffer, this.f166494a.getHttpStatusCode(), C58485gu.m89842j(this.f166495b.f166502d)));
    }
}
