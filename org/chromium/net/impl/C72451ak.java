package org.chromium.net.impl;

import java.nio.ByteBuffer;

/* renamed from: org.chromium.net.impl.ak */
/* compiled from: PG */
final class C72451ak implements Runnable {

    /* renamed from: a */
    ByteBuffer f192798a;

    /* renamed from: b */
    final /* synthetic */ CronetUrlRequest f192799b;

    public C72451ak(CronetUrlRequest cronetUrlRequest) {
        this.f192799b = cronetUrlRequest;
    }

    public final void run() {
        this.f192799b.mo64174b();
        ByteBuffer byteBuffer = this.f192798a;
        this.f192798a = null;
        try {
            synchronized (this.f192799b.f192722d) {
                CronetUrlRequest cronetUrlRequest = this.f192799b;
                if (!cronetUrlRequest.mo64181i()) {
                    cronetUrlRequest.f192721c = true;
                    CronetUrlRequest cronetUrlRequest2 = this.f192799b;
                    C72522da daVar = cronetUrlRequest2.f192723e;
                    daVar.f192969a.onReadCompleted(cronetUrlRequest2, cronetUrlRequest2.f192726h, byteBuffer);
                }
            }
        } catch (Exception e) {
            this.f192799b.mo64177e(e);
        }
    }
}
