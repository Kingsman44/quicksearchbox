package org.chromium.net.impl;

import p000J.C0000N;

/* renamed from: org.chromium.net.impl.aa */
/* compiled from: PG */
final class C72441aa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetUrlRequest f192785a;

    public C72441aa(CronetUrlRequest cronetUrlRequest) {
        this.f192785a = cronetUrlRequest;
    }

    public final void run() {
        CronetUploadDataStream cronetUploadDataStream = this.f192785a.f192725g;
        synchronized (cronetUploadDataStream.f192704g) {
            cronetUploadDataStream.f192706i = 2;
        }
        try {
            cronetUploadDataStream.f192700c.mo64174b();
            long length = cronetUploadDataStream.f192699b.f192966a.getLength();
            cronetUploadDataStream.f192701d = length;
            cronetUploadDataStream.f192702e = length;
        } catch (Throwable th) {
            cronetUploadDataStream.mo64168b(th);
        }
        synchronized (cronetUploadDataStream.f192704g) {
            cronetUploadDataStream.f192706i = 3;
        }
        synchronized (this.f192785a.f192722d) {
            CronetUrlRequest cronetUrlRequest = this.f192785a;
            if (!cronetUrlRequest.mo64181i()) {
                CronetUploadDataStream cronetUploadDataStream2 = cronetUrlRequest.f192725g;
                long j = cronetUrlRequest.f192719a;
                synchronized (cronetUploadDataStream2.f192704g) {
                    cronetUploadDataStream2.f192705h = C0000N.MA4X1aZa(cronetUploadDataStream2, j, cronetUploadDataStream2.f192701d);
                }
                CronetUrlRequest cronetUrlRequest2 = this.f192785a;
                C0000N.MabZ5m6r(cronetUrlRequest2.f192719a, cronetUrlRequest2);
            }
        }
    }
}
