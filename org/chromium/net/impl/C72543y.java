package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.y */
/* compiled from: PG */
final class C72543y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetUploadDataStream f193053a;

    public C72543y(CronetUploadDataStream cronetUploadDataStream) {
        this.f193053a = cronetUploadDataStream;
    }

    public final void run() {
        synchronized (this.f193053a.f192704g) {
            CronetUploadDataStream cronetUploadDataStream = this.f193053a;
            if (cronetUploadDataStream.f192705h != 0) {
                cronetUploadDataStream.mo64167a(3);
                this.f193053a.f192706i = 1;
                try {
                    this.f193053a.f192700c.mo64174b();
                    CronetUploadDataStream cronetUploadDataStream2 = this.f193053a;
                    cronetUploadDataStream2.f192699b.f192966a.rewind(cronetUploadDataStream2);
                } catch (Exception e) {
                    this.f193053a.mo64168b(e);
                }
            }
        }
    }
}
